package com.zx.dubbotest.service;


import com.zx.dubbotest.bean.UserAddress;

import java.util.Arrays;
import java.util.List;


/**
 * @author Zx
 * @date 2020/11/23 11:53
 * @modified By:
 */
public class UserServiceImpl implements UserService {
    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress()
                .setId(1)
                .setUserAddress("河南省郑州巩义市宋陵大厦2F")
                .setUserId("1")
                .setConsignee("安然")
                .setPhoneNum("13807720001")
                .setIsDefault("Y");
        UserAddress address2 = new UserAddress()
                .setId(2)
                .setUserAddress("北京市昌平区沙河镇沙阳路")
                .setUserId("1")
                .setConsignee("情话")
                .setPhoneNum("13807720002")
                .setIsDefault("N");

        return Arrays.asList(address1, address2);
    }
}

