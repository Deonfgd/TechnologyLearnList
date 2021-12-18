package com.fgd.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_sharding_jdbc_goods")
public class FgdFGDShardingJdbcGoods implements Comparable<FgdFGDShardingJdbcGoods> {

	/**
	* null
	*/
	private long goodsId;
	/**
	* null
	*/
	private String goodsCode;
	/**
	* null
	*/
	private String goodsAbs;
	/**
	* null
	*/
	private String goodDesc;
	/**
	* null
	*/
	private java.sql.Date createTime;
	/**
	* null
	*/
	private String createUid;
	/**
	* null
	*/
	private java.sql.Date updateTime;
	/**
	* null
	*/
	private String updateUid;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsCode() {
    return goodsCode;
  }

  public void setGoodsCode(String goodsCode) {
    this.goodsCode = goodsCode;
  }


  public String getGoodsAbs() {
    return goodsAbs;
  }

  public void setGoodsAbs(String goodsAbs) {
    this.goodsAbs = goodsAbs;
  }


  public String getGoodDesc() {
    return goodDesc;
  }

  public void setGoodDesc(String goodDesc) {
    this.goodDesc = goodDesc;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public String getCreateUid() {
    return createUid;
  }

  public void setCreateUid(String createUid) {
    this.createUid = createUid;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdateUid() {
    return updateUid;
  }

  public void setUpdateUid(String updateUid) {
    this.updateUid = updateUid;
  }

    @Override
    public int compareTo(FgdFGDShardingJdbcGoods o) {
        return (int) (this.goodsId - o.goodsId);
    }
}
