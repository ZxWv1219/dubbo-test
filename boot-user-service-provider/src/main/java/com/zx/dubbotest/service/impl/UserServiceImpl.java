package com.zx.dubbotest.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zx.dubbotest.bean.UserAddress;
import com.zx.dubbotest.service.UserService;


import java.util.Arrays;
import java.util.List;


/**
 * 使用@Service 暴露服务,使用@Reference 引用服务
 * 1.使用@EnableDubbo 开启注解的dubbo功能(推荐使用)
 * 2.使用ImportResource导入xml方式
 * 3.使用注解api方式  @Configuration 方式
 *
 * @author Zx
 * @date 2020/11/23 11:53
 * @modified By:
 */


//@Service(
//        version = "${demo.service.version}",
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
//        , parameters = {"sayHello.timeout", "3100", "sayHello2.timeout", "5000"}
//)

@Service(version = "1.0", parameters = {"getUserAddressList.timeout", "2000"})
//@DubboService
//@Service(version = "1.0")
//@Component("UserServiceImpl")
public class UserServiceImpl implements UserService {
    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl old");
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

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

