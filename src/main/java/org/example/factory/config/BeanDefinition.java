package org.example.factory.config;

/**
 * @Author: yqz
 * @Description: 定义bean实例化信息
 * @Date Created in 2022-12-28
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
