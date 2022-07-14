package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.factory.config.BeanDefinition;

/**
 * Created with IntelliJ IDEA.
 * Description: Bean定义的注册接口
 *
 * 该接口负责对Bean进行注册
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:58
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
