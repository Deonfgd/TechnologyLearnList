package com.fgd.seata.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @document: seata dao
 * @author: fgd
 * @date: 2022/4/30
 */
@Mapper
@Repository
public interface ISeataDao {

    @Insert("INSERT INTO fgd VALUES(#{id}, #{name})")
    int save(Integer id, String name);

}
