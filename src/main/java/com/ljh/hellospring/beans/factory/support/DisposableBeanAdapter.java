package com.ljh.hellospring.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.DisposableBean;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: Bean 销毁方法适配器
 *
 * @Author: ljh
 * DateTime: 2022-07-24 16:29
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        // 2. 配置信息 destroy-method 避免二次销毁
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
