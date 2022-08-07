package com.ljh.hellospring.test.bean;

import com.ljh.hellospring.beans.BeansException;
import com.ljh.hellospring.beans.factory.*;
import com.ljh.hellospring.context.ApplicationContext;
import com.ljh.hellospring.context.ApplicationContextAware;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-16 19:32
 */
public class UserService implements IUserService{

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳";
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

}
