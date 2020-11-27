package com.zx.dubbotest.service.impl;

import com.zx.dubbotest.bean.UserAddress;
import com.zx.dubbotest.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Zx
 * @date 2020/11/27 8:47
 * @modified By:
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        if (StringUtils.isEmpty(userId)) {
            System.out.println("userId 不能为空");
            return null;
        }
        return userService.getUserAddressList(userId);
    }
}
