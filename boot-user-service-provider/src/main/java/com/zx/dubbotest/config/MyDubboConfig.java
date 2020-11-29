package com.zx.dubbotest.config;

import com.alibaba.dubbo.config.*;
import com.zx.dubbotest.service.UserService;
import com.zx.dubbotest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zx
 * @date 2020/11/28 17:19
 * @modified By:
 */
@Configuration
public class MyDubboConfig {
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("user-service-provider");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("127.0.0.1:2181");
//        registryConfig.setProtocol("zookeeper");
//        return registryConfig;
//    }
//
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//    }
//
//    @Bean
//    public MonitorConfig monitorConfig() {
//        MonitorConfig monitorConfig = new MonitorConfig();
//        monitorConfig.setProtocol("registry");
//        return monitorConfig;
//    }

//    @Bean
//    public ServiceConfig<UserService> userServiceServiceConfig() {
//        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
//        //配置每个method
//        MethodConfig methodConfig = new MethodConfig();
//        methodConfig.setName("getUserAddressList");
//        methodConfig.setTimeout(2000);
//
//        //将Method的设置关联到service配置中
//        List<MethodConfig> methodConfigs = new ArrayList<>();
//        methodConfigs.add(methodConfig);
//        serviceConfig.setMethods(methodConfigs);
//        return serviceConfig;
//    }

    @Bean
    ServiceParameterBeanPostProcessor serviceParameterBeanPostProcessor() {
        return new ServiceParameterBeanPostProcessor();
    }
}
