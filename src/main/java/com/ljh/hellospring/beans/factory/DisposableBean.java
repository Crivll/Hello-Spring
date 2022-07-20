package com.ljh.hellospring.beans.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: Bean 销毁接口
 *
 * @Author: ljh
 * DateTime: 2022-07-22 21:46
 */
public interface DisposableBean {

    /**
     * 销毁bean
     * @throws Exception
     */
    void destroy() throws Exception;
}
