package com.ljh.hellospring.beans.factory.config;

import com.ljh.hellospring.beans.factory.BeanFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Extension of the {@link com.ljh.hellospring.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 *
 * @Author: ljh
 * DateTime: 2022-07-17 21:30
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
