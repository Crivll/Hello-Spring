package com.ljh.hellospring.aop;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 方法匹配，找到表达式范围内匹配下的目标类和方法
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 *
 * @Author: ljh
 * DateTime: 2022-08-01 21:23
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     *
     * @param method
     * @param targetClass
     * @return  whether this method matches statically or not
     */
    boolean matches(Method method, Class<?> targetClass);
}
