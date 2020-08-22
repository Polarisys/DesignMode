package com.design.factory;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 17:04
 */

//简单工厂模式
public class PhoneSimpleFactory {

    public static Phone getPhone(String name) {
        if (name.equals("小米")) {
            return new XiaoMiPhone();
        } else if (name.equals("苹果")) {
            return new ApplePhone();
        } else {
            return null;
        }
    }
}
