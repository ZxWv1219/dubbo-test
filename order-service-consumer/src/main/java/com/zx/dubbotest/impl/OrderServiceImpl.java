package com.zx.dubbotest.impl;

import com.zx.dubbotest.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author ：Zx
 * @date ：2020/11/23 15:10
 * @modified By：
 */
@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 订单初始化
     *
     * @param userId
     */
    @Override
    public void initOrder(String userId) {

    }
}
