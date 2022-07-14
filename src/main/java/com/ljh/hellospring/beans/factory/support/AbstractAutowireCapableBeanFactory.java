package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现Bean自动注入
 *
 * 该抽象类主要负责Bean的创建与注入到注册表
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:51
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            // todo 带参构造参数暂未处理
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
