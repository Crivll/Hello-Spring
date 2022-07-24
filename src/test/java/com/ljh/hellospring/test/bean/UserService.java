package com.ljh.hellospring.test.bean;

import com.ljh.hellospring.beans.factory.DisposableBean;
import com.ljh.hellospring.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-16 19:32
 */
public class UserService implements InitializingBean, DisposableBean {

    private String uId;
    private String company;
    private String location;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "，公司：" + company + "，地点" + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(userDao.queryUserName(uId));
        return sb.toString();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行；UserService.afterPropertiesSet");
    }
}
