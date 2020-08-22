package com.design.bridge;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 0:00
 */

//台式电脑
public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}
