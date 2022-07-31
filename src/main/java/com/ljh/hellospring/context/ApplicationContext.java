package com.ljh.hellospring.context;

import com.ljh.hellospring.beans.factory.HierarchicalBeanFactory;
import com.ljh.hellospring.beans.factory.ListableBeanFactory;
import com.ljh.hellospring.core.io.ResourceLoader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-20 16:12
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
