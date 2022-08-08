package com.ljh.hellospring.aop;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Superinterface for all Advisors that are driven by a pointcut.
 * This covers nearly all advisors except introduction advisors,
 * for which method-level matching doesn't apply.
 *
 * PointcutAdvisor 承担了 Pointcut 和 Advice 的组合，
 * Pointcut 用于获取 JoinPoint，而 Advice 决定于 JoinPoint 执行什么操作。
 *
 * @Author: ljh
 * DateTime: 2022-08-08 20:34
 */
public interface PointcutAdvisor extends Advisor{

    /**
     * Get the Pointcut that drives this advisor.
     * @return
     */
    Pointcut getPointcut();
}
