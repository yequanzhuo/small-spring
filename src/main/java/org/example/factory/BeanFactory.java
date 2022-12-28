package org.example.factory;

import org.example.BeansException;

/**
 * @Author: yqz
 * @Description: bean对象的工厂
 * @Date Created in 2022-12-28
 */
public interface BeanFactory {

    /**
     * 根据name获取bean
     *
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;

}
