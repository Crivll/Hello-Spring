package com.ljh.hellospring.context.event;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 *
 * @Author: ljh
 * DateTime: 2022-07-30 22:24
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
