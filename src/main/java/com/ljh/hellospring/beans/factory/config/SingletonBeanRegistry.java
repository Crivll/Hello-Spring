package com.ljh.hellospring.beans.factory.config;

/**
 * Created with IntelliJ IDEA.
 * Description: 单例注册表接口
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:34
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
