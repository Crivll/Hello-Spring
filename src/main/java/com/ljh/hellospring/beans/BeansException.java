package com.ljh.hellospring.beans;

/**
 * Created with IntelliJ IDEA.
 * Description: 定义Bean异常
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:37
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
