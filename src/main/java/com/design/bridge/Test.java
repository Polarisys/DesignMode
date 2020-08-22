package com.design.bridge;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 0:03
 */
public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer1 = new Laptop(new Apple());
        computer1.info();

        //联想台式机
        Computer computer2 = new Desktop(new Lenovo());
        computer2.info();
    }
}
