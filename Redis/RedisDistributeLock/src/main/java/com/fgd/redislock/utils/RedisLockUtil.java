package com.fgd.redislock.utils;

import redis.clients.jedis.Jedis;
import sun.misc.Unsafe;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/5/29
 */
public class RedisLockUtil {

    private static Jedis jedis = new Jedis("localhost", 6379);

    private static BlockingQueue<Thread> arrayBlockQueue = new ArrayBlockingQueue<>(2);

    public static void lock(String key, String uid, int time) throws Exception {
        System.out.println(uid + ": start get lock...");

        Object eval = jedis.eval("if (redis.call('exists', KEYS[1]) == 0) then " +
                "redis.call('hincrby', KEYS[1], ARGV[2], 1); " +
                "redis.call('pexpire', KEYS[1], ARGV[1]); " +
                "return nil; " +
                "end; " +
                "if (redis.call('hexists', KEYS[1], ARGV[2]) == 1) then " +
                "redis.call('hincrby', KEYS[1], ARGV[2], 1); " +
                "redis.call('pexpire', KEYS[1], ARGV[1]); " +
                "return nil; " +
                "end; " +
                "return redis.call('pttl', KEYS[1]);", 1, key, String.valueOf(time), uid);

        if (eval != null) {
            System.out.println(uid + ": can not get lock, wait park...");
            arrayBlockQueue.add(Thread.currentThread());
            LockSupport.park();
            Thread.interrupted();
            System.err.println(uid + ": restart after park...");
        }
    }

    public static void unlock(String key, String uid, int time) {
        System.out.println(uid + ": start release lock...");

        Object eval = jedis.eval("if (redis.call('hexists', KEYS[1], ARGV[2]) == 0) then " +
                "return nil;" +
                "end; " +
                "local counter = redis.call('hincrby', KEYS[1], ARGV[2], -1); " +
                "if (counter > 0) then " +
                "redis.call('pexpire', KEYS[1], ARGV[1]); " +
                "return 0; " +
                "else " +
                "redis.call('del', KEYS[1]); " +
                "return 1; " +
                "end; " +
                "return nil;", 1, key, String.valueOf(time), uid);

        if ((Long) eval == 1) {
            System.out.println(uid + ": start to unpark thread...");
            Thread parkThread = arrayBlockQueue.poll();
            LockSupport.unpark(parkThread);
        }
    }

}
