package com.design.adapter;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 23:26
 */

//客户端
public class Client {

    //需要连接上转接器
    public void client(Target target) {
        target.handlerRequest();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        client.client(adapter);
    }
}
