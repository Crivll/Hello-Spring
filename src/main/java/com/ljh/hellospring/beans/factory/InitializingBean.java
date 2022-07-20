package com.ljh.hellospring.beans.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 初始化Bean接口
 *
 * @Author: ljh
 * DateTime: 2022-07-22 21:40
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
