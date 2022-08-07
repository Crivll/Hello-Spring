package com.ljh.hellospring.test.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-08-07 20:57
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}
