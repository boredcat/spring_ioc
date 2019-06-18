package com.evan.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemo1 {

    @Test
    public void demo1(){
        UserServiceImpl userServeice = new UserServiceImpl();
        userServeice.setName("evan");
        userServeice.sayHello();
    }

    @Test
    public void demo2(){
        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类
        UserServeice userServeice = (UserServeice) applicationContext.getBean("UserService");
        userServeice.sayHello();
    }

    @Test
    public void demo33(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Food food = (Food) applicationContext.getBean("Food");
        System.out.println(food);
    }
    /*
    读取磁盘系统中的配置文件
     */

    @Test
    public void demo3(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        Food food = (Food) applicationContext.getBean("Food");
        System.out.println(food);
    }

    @Test
    public void demo4(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UserServeice userServeice = (UserServeice) beanFactory.getBean("UserService");
        userServeice.sayHello();


    }
}
