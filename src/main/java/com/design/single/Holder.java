package com.design.single;


/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:05
 */
//静态内部类
public class Holder {
    private Holder() {

    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }
}
