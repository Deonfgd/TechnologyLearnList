package com.fgd.springtx.mapper;

import com.fgd.springtx.entiries.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/18
 */
@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user VALUE (#{user.id}, #{user.username}, #{user.age}, #{user.info}, #{user.addId})")
    int addUser(@Param("user") User user);

}
