package com.ljh.hellospring.context;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for ApplicationContext.
 *
 * 事件发布者接口
 *
 * @Author: ljh
 * DateTime: 2022-07-31 19:18
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
