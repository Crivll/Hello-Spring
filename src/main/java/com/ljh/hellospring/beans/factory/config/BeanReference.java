package com.ljh.hellospring.beans.factory.config;

/**
 * Created with IntelliJ IDEA.
 * Description: bean中的引用类型
 *
 * @Author: ljh
 * DateTime: 2022-07-16 21:01
 */
public class BeanReference {

    private final String name;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
