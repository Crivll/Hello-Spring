package com.ljh.hellospring.context;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.Aware;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Interface to be implemented by any object that wishes to be notified of the {@link ApplicationContext} that it runs in.
 * 实现此接口，既能感知到所属的 ApplicationContext
 *
 * @Author: ljh
 * DateTime: 2022-07-25 11:12
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
