package com.ljh.hellospring.context.event;

import com.ljh.hellospring.beans.factory.BeanFactory;
import com.ljh.hellospring.context.ApplicationEvent;
import com.ljh.hellospring.context.ApplicationListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-31 19:25
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener: getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
