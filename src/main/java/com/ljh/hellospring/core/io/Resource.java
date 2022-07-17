package com.ljh.hellospring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description: 资源加载接口
 *
 * @Author: ljh
 * DateTime: 2022-07-17 19:58
 */
public interface Resource {

    /**
     * 加载资源接口
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
