package org.example.factory.config;

/**
 * @Author: yqz
 * @Description: 单例注册，只负责获取单例bean
 * @Date Created in 2022-12-28
 */
public interface SingletonBeanRegistry {

    /**
     * 根据name获取单例bean
     *
     * @param beanName bean name
     * @return
     */
    Object getSingleton(String beanName);
}
