package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:46
 */

//苹果手机
public class ApplePhone implements IPhoneProduct {

    @Override
    public void start() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("苹果手机关机");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("苹果手机发短信");
    }
}
