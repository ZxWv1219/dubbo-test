package com.zx.dubbotest.bean;

import java.io.Serializable;

/**
 * @author Zx
 * @date 2020/11/23 11:52
 * @modified By:
 */
public class UserAddress implements Serializable {

    private Integer id;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 电话号码
     */
    private String phoneNum;
    /**
     * 是否为默认地址    Y-是     N-否
     */
    private String isDefault;

    public Integer getId() {
        return id;
    }

    public UserAddress setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public UserAddress setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserAddress setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getConsignee() {
        return consignee;
    }

    public UserAddress setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public UserAddress setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public UserAddress setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
}
