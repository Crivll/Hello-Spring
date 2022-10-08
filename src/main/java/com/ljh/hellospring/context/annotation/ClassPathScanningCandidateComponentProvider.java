package com.ljh.hellospring.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;
import com.ljh.hellospring.stereotype.Component;
import com.ljh.hellospring.util.ClassUtils;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * A component provider that scans the classpath from a base package. It then
 * applies exclude and include filters to the resulting classes to find candidates.
 * <p>
 * @Author: ljh
 * DateTime: 2022-10-08 21:20
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz: classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
