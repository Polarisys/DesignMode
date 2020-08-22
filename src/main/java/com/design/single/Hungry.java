package com.design.single;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 13:25
 */
//饿汉式单例
public class Hungry {

    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }
}
