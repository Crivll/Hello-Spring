package com.ljh.hellospring.test.event;

import com.ljh.hellospring.context.ApplicationListener;
import com.ljh.hellospring.context.event.ContextClosedEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-31 19:59
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}
