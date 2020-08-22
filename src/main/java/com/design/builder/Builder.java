package com.design.builder;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 21:02
 */

//抽象的建造者：方法
public abstract class Builder {
    abstract void build1();

    abstract void build2();

    abstract void build3();

    abstract void build4();

    //得到产品
    abstract Product getProduct();
}
