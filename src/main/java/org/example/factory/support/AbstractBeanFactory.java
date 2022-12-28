package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.BeanFactory;
import org.example.factory.config.BeanDefinition;

/**
 * @Author: yqz
 * @Description: 【模板方法-设计模式】注册表功能
 * @Date Created in 2022-12-28
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 相当于模板方法，抽象方法getBeanDefinition、createBean交给子类实现
     *
     * @param name
     * @return
     * @throws BeansException
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 获取bean定义信息
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建bean实例
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
