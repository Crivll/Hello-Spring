package com.ljh.hellospring.beans.factory.support;

import com.ljh.hellospring.core.io.DefaultResourceLoader;
import com.ljh.hellospring.core.io.ResourceLoader;

/**
 * Created with IntelliJ IDEA.
 * Description: 资源读取抽象类
 *
 * @Author: ljh
 * DateTime: 2022-07-17 20:38
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
