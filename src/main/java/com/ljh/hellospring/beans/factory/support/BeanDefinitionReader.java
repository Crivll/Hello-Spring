package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.core.io.Resource;
import com.ljh.hellospring.core.io.ResourceLoader;

/**
 * Created with IntelliJ IDEA.
 * Description: 资源读取注册接口
 *
 * @Author: ljh
 * DateTime: 2022-07-17 20:34
 */
public interface BeanDefinitionReader {

    /**
     * 获取资源注册类
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取资源加载器
     * @return
     */
    ResourceLoader getResourceLoader();

    /**
     * 加载beanDefinition
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    /**
     * 加载beanDefinition
     * @param resources
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource... resources) throws BeansException;

    /**
     * 加载beanDefinition
     * @param location
     * @throws BeansException
     */
    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
