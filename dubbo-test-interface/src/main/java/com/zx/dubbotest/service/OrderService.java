package com.zx.dubbotest.service;

import com.zx.dubbotest.bean.UserAddress;

import java.util.List;

/**
 * @author ：Zx
 * @date ：2020/11/23 15:10
 * @modified By：
 */
public interface OrderService {
    /**
     * 订单初始化
     *
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}
