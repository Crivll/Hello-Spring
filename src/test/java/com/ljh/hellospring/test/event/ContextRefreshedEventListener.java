package com.ljh.hellospring.test.event;

import com.ljh.hellospring.context.ApplicationListener;
import com.ljh.hellospring.context.event.ContextRefreshedEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-31 20:01
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}
