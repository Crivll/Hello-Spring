package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: Bean容器核心类，单例Bean、非单例Bean获取与注册都可通过这个类做到
 *
 * 本身职责为非单例Bean定义的注册和获取
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:59
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String name) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (null == beanDefinition) {
            throw new BeansException("No bean named '" + name + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
