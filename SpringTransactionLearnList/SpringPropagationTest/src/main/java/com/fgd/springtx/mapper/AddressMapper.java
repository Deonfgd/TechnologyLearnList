package com.fgd.springtx.mapper;

import com.fgd.springtx.entiries.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/18
 */
@Mapper
public interface AddressMapper {

//    @Insert("INSERT INTO address VALUE (#{address.id}, #{address.province}, #{address.city}, #{address.area}, #{address.street}")
    @Insert("INSERT INTO address VALUE (#{id}, #{province}, #{city}, #{area}, #{street})")
    int addAddress(Address address);

}
