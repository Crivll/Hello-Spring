package com.ljh.hellospring.context.event;

import com.ljh.hellospring.context.ApplicationEvent;
import com.ljh.hellospring.context.ApplicationListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface to be implemented by objects that can manage a number of
 * {@link ApplicationListener} objects, and publish events to them.
 *
 * @Author: ljh
 * DateTime: 2022-07-30 22:26
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a Listener to be notified of all events.
     * @param listener
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event
     */
    void multicastEvent(ApplicationEvent event);
}
