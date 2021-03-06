package com.ljh.hellospring.context;

import com.ljh.hellospring.beans.BeansException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-20 16:13
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * 注册关闭钩子方法
     */
    void registerShutdownHook();

    /**
     * 手动关闭方法
     */
    void close();

}
