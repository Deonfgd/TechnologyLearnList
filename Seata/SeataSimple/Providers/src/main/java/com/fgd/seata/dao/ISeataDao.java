package com.fgd.seata.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @document: seata dao
 * @author: fgd
 * @date: 2022/4/30
 */
@Mapper
public interface ISeataDao {

    @Insert("INSERT INTO fgd VALUES(#{id}, #{name})")
    void test(Integer id, String name);

}
