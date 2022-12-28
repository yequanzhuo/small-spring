package org.example.factory.support;

import org.example.BeansException;
import org.example.factory.config.BeanDefinition;

/**
 * @author:yqz
 * @create: 2022-12-28
 * @Description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            // 【优化】用户自行实例化行为
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        // 放入singletonObjects中
        addSingleton(beanName, bean);
        return bean;
    }

}
