package org.example;

/**
 * @author:yqz
 * @create: 2022-12-28
 * @Description: bean相关异常
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}