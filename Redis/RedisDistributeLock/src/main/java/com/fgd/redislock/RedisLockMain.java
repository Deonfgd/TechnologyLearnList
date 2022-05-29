package com.fgd.redislock;

import com.fgd.redislock.utils.RedisLockUtil;

import java.util.Scanner;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/5/29
 */
public class RedisLockMain {

    public static void main(String[] args) throws Exception {
        String redisKey = "testRedisLock";
        new Thread(() -> {
            try {
                RedisLockUtil.lock(redisKey, Thread.currentThread().getName(), 1000 * 60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "thread-1").start();

        Thread.sleep(1000);

        new Thread(() -> {
            try {
                RedisLockUtil.lock(redisKey, Thread.currentThread().getName(), 1000 * 60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "thread-2").start();

        Thread.sleep(1000);

        new Thread(() -> {
            try {
                RedisLockUtil.unlock(redisKey, Thread.currentThread().getName(), 1000 * 60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "thread-1").start();
    }

}
