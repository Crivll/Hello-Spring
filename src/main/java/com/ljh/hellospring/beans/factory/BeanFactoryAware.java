package com.ljh.hellospring.beans.factory;

import com.ljh.hellospring.beans.BeansException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface to be implemented by beans that wish to be aware of their owning {@link BeanFactory}.
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @Author: ljh
 * DateTime: 2022-07-25 11:09
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
