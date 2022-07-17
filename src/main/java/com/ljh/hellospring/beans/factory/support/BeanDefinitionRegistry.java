package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
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
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     *  Return the names of all beans defined in this registry.
     *
     * @return  注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
