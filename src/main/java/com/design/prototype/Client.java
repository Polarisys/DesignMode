package com.design.prototype;

import org.springframework.beans.BeanUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 22:10
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        //原型对象
        Date date = new Date();
        Video video1 = new Video("三国演义", date);
        System.out.println(video1);
        System.out.println(video1.hashCode());

        //克隆对象
        Video video2 = (Video) video1.clone();
        System.out.println(video2);
        System.out.println(video2.hashCode());

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Object bean1 = applicationContext.getBean("video");
        //Object bean2 = applicationContext.getBean("video");
        Video bean2 = new Video();
        BeanUtils.copyProperties(bean1,bean2);
        System.out.println(bean1==bean2);

    }
}
