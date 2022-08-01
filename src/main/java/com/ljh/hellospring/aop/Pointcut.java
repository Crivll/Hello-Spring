package com.ljh.hellospring.aop;



/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Core Spring pointcut abstraction.
 *
 * <p>A pointcut is composed of a {@link ClassFilter} and a {@link MethodMatcher}.
 * Both these basic terms and a Pointcut itself can be combined to build up combinations
 * <p>
 *
 * @Author: ljh
 * DateTime: 2022-08-01 21:19
 */
public interface Pointcut {

    /**
     * Return the ClassFilter for this pointcut.
     * @return  the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * Return the MethodMatcher for this pointcut.
     * @return  the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();
}
