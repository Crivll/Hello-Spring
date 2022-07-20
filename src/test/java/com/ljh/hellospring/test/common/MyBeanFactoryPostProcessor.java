package com.ljh.hellospring.test.common;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.PropertyValue;
import com.ljh.hellospring.beans.PropertyValues;
import com.ljh.hellospring.beans.factory.ConfigurableListableBeanFactory;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;
import com.ljh.hellospring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-20 19:54
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));

    }
}
