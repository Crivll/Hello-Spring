package com.ljh.hellospring.context;

import java.util.EventObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * Class to be extended by all application events. Abstract as it
 * doesn't make sense for generic events to be published directly.
 *
 * @Author: ljh
 * DateTime: 2022-07-30 22:18
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     * @param source    The object on which the Event initially occurred.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
