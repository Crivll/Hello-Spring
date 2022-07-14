package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: 默认单例注册表实现类
 *
 * 该类主要负责存储单例bean对象，并维护注册表
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:39
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
