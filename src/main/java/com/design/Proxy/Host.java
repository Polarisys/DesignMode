package com.design.Proxy;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 1:03
 */
public class Host implements Rent {


    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
