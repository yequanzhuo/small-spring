package org.example;
/**
 * @Author: yqz
 * @Description: 定义bean实例化信息
 * @Date Created in 2022-12-28
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
