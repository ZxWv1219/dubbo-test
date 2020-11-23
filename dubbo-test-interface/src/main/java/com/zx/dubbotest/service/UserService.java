package com.zx.dubbotest.service;

import com.zx.dubbotest.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 *
 * @author ：Zx
 * @date ：2020/11/23 11:53
 * @modified By：
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
