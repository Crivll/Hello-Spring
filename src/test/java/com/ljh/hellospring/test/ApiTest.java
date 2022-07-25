package com.ljh.hellospring.test;

import cn.hutool.core.io.IoUtil;
import com.ljh.hellospring.beans.PropertyValue;
import com.ljh.hellospring.beans.PropertyValues;
import com.ljh.hellospring.beans.factory.config.BeanDefinition;
import com.ljh.hellospring.beans.factory.config.BeanReference;
import com.ljh.hellospring.beans.factory.support.DefaultListableBeanFactory;
import com.ljh.hellospring.beans.factory.xml.XmlBeanDefinitionReader;
import com.ljh.hellospring.context.support.ClassPathXmlApplicationContext;
import com.ljh.hellospring.core.io.DefaultResourceLoader;
import com.ljh.hellospring.core.io.Resource;
import com.ljh.hellospring.test.bean.UserDao;
import com.ljh.hellospring.test.bean.UserService;
import com.ljh.hellospring.test.common.MyBeanFactoryPostProcessor;
import com.ljh.hellospring.test.common.MyBeanPostProcessor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
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

//    @Test
//    public void test_cglib() {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserService.class);
//        enhancer.setCallback(new NoOp() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        });
//        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"小傅哥"});
//        System.out.println(obj);
//    }
//
//    @Test
//    public void test_newInstance() throws IllegalAccessException, InstantiationException {
//        UserService userService = UserService.class.newInstance();
//        System.out.println(userService);
//    }
//
//    @Test
//    public void test_constructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<UserService> userServiceClass = UserService.class;
//        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
//        UserService userService = declaredConstructor.newInstance("小傅哥");
//        System.out.println(userService);
//    }
//
//    @Test
//    public void test_parameterTypes() throws Exception {
//        Class<UserService> beanClass = UserService.class;
//        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
//        Constructor<?> constructor = null;
//        for (Constructor<?> ctor : declaredConstructors) {
//            if (ctor.getParameterTypes().length == 1) {
//                constructor = ctor;
//                break;
//            }
//        }
//        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
//        UserService userService = declaredConstructor.newInstance("小傅哥");
//        System.out.println(userService);
//    }
//
//    @Test
//    public void test_BeanFactory() {
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//
//        // 2. UserDao 注册
//        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
//
//        // 3. UserService 设置属性[uId、userDao]
//        PropertyValues propertyValues = new PropertyValues();
//        propertyValues.addPropertyValue(new PropertyValue("uId", "10003"));
//        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
//
//        // 4. UserService 注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 5. UserService 获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
//    }

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

//    @Test
//    public void test_classpath() throws IOException {
//        Resource resource = resourceLoader.getResource("classpath:important.properties");
//        InputStream inputStream = resource.getInputStream();
//        String content = IoUtil.readUtf8(inputStream);
//        System.out.println(content);
//    }
//
//    @Test
//    public void test_file() throws IOException {
//        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
//        InputStream inputStream = resource.getInputStream();
//        String content = IoUtil.readUtf8(inputStream);
//        System.out.println(content);
//    }
//
//    @Test
//    public void test_url() throws IOException {
//        Resource resource = resourceLoader.getResource("https://github.com/Crivll/Hello-Spring/important.properties");
//        InputStream inputStream = resource.getInputStream();
//        String content = IoUtil.readUtf8(inputStream);
//        System.out.println(content);
//    }

//    @Test
//    public void test_xml() {
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//
//        // 2. 读取配置文件&注册Bean
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions("classpath:spring.xml");
//
//        // 3. 获取Bean对象调用方法
//        UserService userService = beanFactory.getBean("userService", UserService.class);
//        String result = userService.queryUserInfo();
//        System.out.println("测试结果：" + result);
//    }

    /**
     * 不使用应用上下文更改bean
     */
    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        // 4. Bean实例化之后，修改Bean属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 5. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    /**
     * 使用应用上下文更改bean
     */
    @Test
    public void test_xml() {
        // 1. 初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
        System.out.println("ApplicationContextAware："+userService.getApplicationContext());
        System.out.println("BeanFactoryAware："+userService.getBeanFactory());
    }
}
