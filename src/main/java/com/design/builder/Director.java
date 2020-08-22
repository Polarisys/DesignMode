package com.design.builder;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 21:08
 */

//指挥：核心，负责指挥构建一个工程
public class Director {

    public Product build(Builder builder) {
        builder.build1();
        builder.build2();
        builder.build3();
        builder.build4();
        return builder.getProduct();
    }
}
