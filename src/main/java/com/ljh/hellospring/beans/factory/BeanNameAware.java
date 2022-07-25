package com.ljh.hellospring.beans.factory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface to be implemented by beans that want to be aware of their bean name in a bean factory.
 * 实现此接口，既能感知到所属的 BeanName
 *
 * @Author: ljh
 * DateTime: 2022-07-25 11:11
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
