package com.design.adapter;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 23:23
 */
//真正的适配器
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handlerRequest() {
        adaptee.request();
    }
}
