package com.zx.dubbotest.service;

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
    void initOrder(String userId);
}
