package com.design.Proxy;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 1:05
 */
public class Client {

    public static void main(String[] args) {

//        静态代理
//        Host host = new Host();
//        Proxy proxy = new Proxy(host);
//        proxy.rent();

        //动态代理
        Host host = new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
