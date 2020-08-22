package com.design.bridge;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 0:00
 */
public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
