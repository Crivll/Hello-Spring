package com.ljh.hellospring.test;

import com.ljh.hellospring.aop.AdvisedSupport;
import com.ljh.hellospring.aop.TargetSource;
import com.ljh.hellospring.aop.aspectj.AspectJExpressionPointcut;
import com.ljh.hellospring.aop.framework.Cglib2AopProxy;
import com.ljh.hellospring.aop.framework.JdkDynamicAopProxy;
import com.ljh.hellospring.beans.factory.support.DefaultListableBeanFactory;
import com.ljh.hellospring.beans.factory.xml.XmlBeanDefinitionReader;
import com.ljh.hellospring.context.support.ClassPathXmlApplicationContext;
import com.ljh.hellospring.core.io.DefaultResourceLoader;
import com.ljh.hellospring.test.bean.IUserService;
import com.ljh.hellospring.test.bean.UserService;
import com.ljh.hellospring.test.bean.UserServiceInterceptor;
import com.ljh.hellospring.test.event.CustomEvent;
import org.junit.Before;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-16 19:32
 */
public class ApiTest {

//    @Test
//    public void test_prototype() {
//        // 1. 初始化 BeanFactory
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        applicationContext.registerShutdownHook();
//
//        // 2. 获取Bean对象调用方法
//        UserService userService01 = applicationContext.getBean("userService", UserService.class);
//        UserService userService02 = applicationContext.getBean("userService", UserService.class);
//
//        // 3. 配置scope="prototype/singleton"
//        System.out.println(userService01);
//        System.out.println(userService02);
//
//        // 4. 打印十六进制哈希
//        System.out.println(userService01 + " 十六进制哈希：" + Integer.toHexString(userService01.hashCode()));
//        System.out.println(ClassLayout.parseInstance(userService01).toPrintable());
//
//    }
//
//    @Test
//    public void test_factory_bean() {
//        // 1. 初始化 BeanFactory
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        applicationContext.registerShutdownHook();
//
//        // 2. 调用代理方法
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        System.out.println("测试结果：" + userService.queryUserInfo());
//
//    }
//
//    @Test
//    public void test_event() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "success!"));
//
//        applicationContext.registerShutdownHook();
//    }
//
//    @Test
//    public void test_aop() throws NoSuchMethodException {
//        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* com.ljh.hellospring.test.bean.UserService.*(..))");
//        Class<UserService> clazz = UserService.class;
//        Method method = clazz.getDeclaredMethod("queryUserInfo");
//
//        System.out.println(pointcut.matches(clazz));
//        System.out.println(pointcut.matches(method, clazz));
//    }

    @Test
    public void test_dynamic() {
        IUserService userService = new UserService();

        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* com.ljh.hellospring.test.bean.IUserService.*(..))"));

        // 代理对象(JdkDynamicAopProxy)
        IUserService proxy_jdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("jdk测试结果: " + proxy_jdk.queryUserInfo());

        // 代理对象(Cglib2AopProxy)
        IUserService proxy_cglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("cglib测试结果: " + proxy_cglib.queryUserInfo());
    }
}
