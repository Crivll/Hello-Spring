package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.BeanFactory;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象bean工厂类
 *
 * 该抽象类主要负责获取bean对象
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:41
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (null != bean) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
