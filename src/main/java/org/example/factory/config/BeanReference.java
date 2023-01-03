package org.example.factory.config;

/**
 * @Author: yqz
 * @Description: 定义bean的引用
 * @Date Created in 2022-12-28
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
