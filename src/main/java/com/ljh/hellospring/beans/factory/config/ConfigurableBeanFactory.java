package com.ljh.hellospring.beans.factory.config;

import com.ljh.hellospring.beans.factory.BeanFactory;
import com.ljh.hellospring.beans.factory.HierarchicalBeanFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link com.ljh.hellospring.beans.factory.BeanFactory} interface
 *
 * @Author: ljh
 * DateTime: 2022-07-17 21:31
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
