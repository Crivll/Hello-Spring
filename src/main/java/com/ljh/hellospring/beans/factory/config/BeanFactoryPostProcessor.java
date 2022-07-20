package com.ljh.hellospring.beans.factory.config;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.ConfigurableListableBeanFactory;

/**
 * Created with IntelliJ IDEA.
 * Description: 修改BeanFactory处理接口
 *
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 *
 * @Author: ljh
 * DateTime: 2022-07-20 15:55
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有BeanDefinition加载完成后，实例化Bean对象前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
