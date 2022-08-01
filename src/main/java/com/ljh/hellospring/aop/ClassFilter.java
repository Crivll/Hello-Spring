package com.ljh.hellospring.aop;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 类匹配类，用于切点找到给定的接口和目标类。
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 *
 * @Author: ljh
 * DateTime: 2022-08-01 21:29
 */
public interface ClassFilter {

    /**
     *
     * Should the pointcut apply to the given interface or target class?
     *
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);
}
