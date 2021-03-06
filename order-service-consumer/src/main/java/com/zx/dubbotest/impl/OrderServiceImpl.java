package com.zx.dubbotest.impl;

import com.zx.dubbotest.bean.UserAddress;
import com.zx.dubbotest.service.OrderService;
import com.zx.dubbotest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Zx
 * @date ：2020/11/23 15:10
 * @modified By：
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final UserService userService;

    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    /**
     * 订单初始化
     *
     * @param userId
     */
    @Override
    public List<UserAddress> initOrder(String userId) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        //为了直观的看到得到的数据，以下内容也可不写
        System.out.println("当前接收到的userId=> " + userId);
        System.out.println("**********");
        for (UserAddress userAddress : userAddressList) {
            //打印远程服务地址的信息
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
