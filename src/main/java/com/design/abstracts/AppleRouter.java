package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:51
 */

//苹果路由器
public class AppleRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("苹果路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("苹果路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("苹果路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("苹果路由器设置");
    }
}
