package com.ljh.hellospring.test;

import com.ljh.hellospring.beans.PropertyValue;
import com.ljh.hellospring.beans.PropertyValues;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;
import com.ljh.hellospring.beans.factory.config.BeanReference;
import com.ljh.hellospring.beans.factory.support.DefaultListableBeanFactory;
import com.ljh.hellospring.test.bean.UserDao;
import com.ljh.hellospring.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-07-16 19:32
 */
public class ApiTest {

//    @Test
//    public void test_BeanFactory() {
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//
//        // 3. 注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 4.获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");
//        userService.queryUserInfo();
//    }

    @Test
    public void test_cglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"小傅哥"});
        System.out.println(obj);
    }

    @Test
    public void test_newInstance() throws IllegalAccessException, InstantiationException {
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }

    @Test
    public void test_constructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("小傅哥");
        System.out.println(userService);
    }

    @Test
    public void test_parameterTypes() throws Exception {
        Class<UserService> beanClass = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor<?> constructor = null;
        for (Constructor<?> ctor : declaredConstructors) {
            if (ctor.getParameterTypes().length == 1) {
                constructor = ctor;
                break;
            }
        }
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("小傅哥");
        System.out.println(userService);
    }

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
