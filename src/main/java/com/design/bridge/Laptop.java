package com.design.bridge;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 0:02
 */

//笔记本
public class Laptop extends Computer {
    @Override
    public void info() {
        super.info();
    }

    public Laptop(Brand brand) {
        super(brand);
        System.out.println("笔记本");
    }
}
