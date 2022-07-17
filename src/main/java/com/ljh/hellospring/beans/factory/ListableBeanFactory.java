package com.ljh.hellospring.beans.factory;

import com.ljh.hellospring.beans.BeansException;

import java.beans.Beans;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Extension of the {@link BeanFactory} interface to be implemented by bean factories
 * that can enumerate all their bean instances, rather than attempting bean lookup
 * by name one by one as requested by clients. BeanFactory implementations that
 * preload all their bean definitions (such as XML-based factories) may implement
 * this interface.
 *
 * @Author: ljh
 * DateTime: 2022-07-17 21:22
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按类型返回Bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * @return  注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
