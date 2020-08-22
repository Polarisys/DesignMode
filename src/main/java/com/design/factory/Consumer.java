package com.design.factory;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 17:06
 */
public class Consumer {
    public static void main(String[] args) {
        //使用工厂创建
        Phone phone1 = PhoneSimpleFactory.getPhone("小米");
        Phone phone2 = PhoneSimpleFactory.getPhone("苹果");
        phone1.name();
        phone2.name();
    }
}
