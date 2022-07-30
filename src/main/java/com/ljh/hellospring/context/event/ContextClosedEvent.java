package com.ljh.hellospring.context.event;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Event raised when an <code>ApplicationContext</code> gets closed.
 *
 * @Author: ljh
 * DateTime: 2022-07-30 22:23
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
