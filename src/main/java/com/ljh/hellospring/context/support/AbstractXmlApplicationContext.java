package com.ljh.hellospring.context.support;

import com.ljh.hellospring.beans.factory.support.DefaultListableBeanFactory;
import com.ljh.hellospring.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-20 17:03
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    /**
     * 从上下文拿到配置信息的地址描述
     * @return
     */
    protected abstract String[] getConfigLocations();
}
