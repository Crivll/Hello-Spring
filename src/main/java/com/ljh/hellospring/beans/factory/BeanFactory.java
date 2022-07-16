package com.ljh.hellospring.beans.factory;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * Description: 表示Bean对象的工厂，可以存放Bean定义到Map中以获取
 *
 * @Author: ljh
 * DateTime: 2022-07-14 22:17
 */
public interface BeanFactory {

    /**
     * 无参构造获取bean对象
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;

    /**
     *
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;

}
