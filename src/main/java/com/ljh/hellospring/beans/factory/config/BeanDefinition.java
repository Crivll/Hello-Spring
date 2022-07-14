package com.ljh.hellospring.beans.factory.config;

/**
 * Created with IntelliJ IDEA.
 * Description: 用于定义Bean的类信息
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:17
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
