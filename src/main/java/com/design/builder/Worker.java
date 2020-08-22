package com.design.builder;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 21:05
 */
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void build1() {
        product.setBuild1("1");
        System.out.println("1");
    }

    @Override
    void build2() {
        product.setBuild2("2");
        System.out.println("2");
    }

    @Override
    void build3() {
        product.setBuild3("3");
        System.out.println("3");
    }

    @Override
    void build4() {
        product.setBuild4("4");
        System.out.println("4");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
