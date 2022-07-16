package com.ljh.hellospring.beans;

/**
 * Created with IntelliJ IDEA.
 * Description: bean成员属性
 *
 * @Author: ljh
 * DateTime: 2022-07-16 20:50
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
