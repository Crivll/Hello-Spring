package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 * Description: 实例化Bean对象接口
 *
 * @Author: ljh
 * DateTime: 2022-07-16 19:00
 */
public interface InstantiationStrategy {

    /**
     * 实例化bean对象
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
