package com.ljh.hellospring.aop.framework;

import com.ljh.hellospring.aop.AdvisedSupport;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Factory for AOP proxies for programmatic use, rather than via a bean factory.
 * This class provides a simple way of obtaining and configuring AOP proxies in code.
 *
 * @Author: ljh
 * DateTime: 2022-08-08 21:03
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }
}
