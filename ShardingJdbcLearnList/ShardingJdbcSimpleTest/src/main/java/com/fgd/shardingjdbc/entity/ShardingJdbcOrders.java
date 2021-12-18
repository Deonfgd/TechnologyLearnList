package com.fgd.shardingjdbc.entity;

import lombok.Data;

@Data
public class ShardingJdbcOrders implements Comparable<ShardingJdbcOrders> {

    /**
     * null
     */
    private long ordersId;
    /**
     * null
     */
    private String ordersNbr;
    /**
     * null
     */
    private String goodsId;
    /**
     * null
     */
    private String orderDesc;
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


    public long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }


    public String getOrdersNbr() {
        return ordersNbr;
    }

    public void setOrdersNbr(String ordersNbr) {
        this.ordersNbr = ordersNbr;
    }


    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }


    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
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
    public int compareTo(ShardingJdbcOrders o) {
        return (int) (this.ordersId - o.ordersId);
    }
}
