package com.ljh.hellospring.beans.factory;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.config.AutowireCapableBeanFactory;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;
import com.ljh.hellospring.beans.factory.config.ConfigurableBeanFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 *
 * @Author: ljh
 * DateTime: 2022-07-17 21:29
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
