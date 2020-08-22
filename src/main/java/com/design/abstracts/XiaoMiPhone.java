package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:49
 */

//小米手机
public class XiaoMiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("小米手机开启");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米手机发短信");
    }
}
