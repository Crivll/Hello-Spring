package com.ljh.hellospring.beans.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 工厂 Bean，自定义 Bean 对象
 *
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 *
 * @Author: ljh
 * DateTime: 2022-07-28 17:11
 */
public interface FactoryBean<T> {

    /**
     *
     * @return
     * @throws Exception
     */
    T getObject() throws Exception;

    /**
     *
     * @return
     */
    Class<?> getObjectType();

    /**
     * 是否是单例对象，是单例对象才会被放入内存
     * @return
     */
    boolean isSingleton();
}
