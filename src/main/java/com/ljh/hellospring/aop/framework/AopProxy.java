package com.ljh.hellospring.aop.framework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects.
 *
 * Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 *
 * AOP 代理的抽象
 *
 * @Author: ljh
 * DateTime: 2022-08-03 21:59
 */
public interface AopProxy {

    /**
     * 获取代理类
     * @return
     */
    Object getProxy();
}
