package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author: yqz
 * @Description: 实例化策略
 * @Date Created in 2022-12-28
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
