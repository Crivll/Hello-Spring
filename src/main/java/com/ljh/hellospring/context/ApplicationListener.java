package com.ljh.hellospring.context;

import java.util.EventListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface to be implemented by application event listeners.
 * Based on the standard <code>java.util.EventListener</code> interface
 * for the Observer design pattern.
 *
 * @Author: ljh
 * DateTime: 2022-07-30 22:28
 */
public interface ApplicationListener <E extends  ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event
     */
    void onApplicationEvent(E event);
}
