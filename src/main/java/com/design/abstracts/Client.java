package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 16:01
 */
public class Client {
    public static void main(String[] args) {

        //小米工厂
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        //小米手机
        IPhoneProduct iPhoneProduct = xiaoMiFactory.iPhoneProduct();
        iPhoneProduct.call();
        iPhoneProduct.sendMessage();

        //小米路由器
        IRouterProduct iRouterProduct = xiaoMiFactory.iRouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.setting();

        //苹果工厂
        AppleFactory appleFactory = new AppleFactory();
        //苹果手机
        IPhoneProduct iPhoneProduct1 = appleFactory.iPhoneProduct();
        iPhoneProduct1.start();
        iPhoneProduct1.shutdown();

        //苹果路由器
        IRouterProduct iRouterProduct1 = appleFactory.iRouterProduct();
        iRouterProduct1.start();
        iRouterProduct1.shutdown();

    }
}
