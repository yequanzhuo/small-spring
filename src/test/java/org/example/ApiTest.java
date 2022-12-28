package org.example;

import org.example.bean.UserService;
import org.example.factory.config.BeanDefinition;
import org.example.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author: yqz
 * @Description:
 * @Date Created in 2022-12-28
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");
        userService.queryUserInfo();
    }
}
