package org.example.factory.support;

import org.example.factory.config.BeanDefinition;

/**
 * @Author: yqz
 * @Description: 只负责注册到bean容器
 * @Date Created in 2022-12-28
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
