package com.design.builder;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 21:44
 */
public class Test {

    public static void main(String[] args) {
        Product product = new Director().build(new Worker());
        System.out.println(product.toString());
    }
}
