package com.design.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 13:27
 */
//懒汉式单例
public class LazyMan {

    //添加标志
    private static boolean tolaris = false;

    private LazyMan() {

        //标志判断
        synchronized (LazyMan.class) {
            if (tolaris == false) {
                tolaris = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }

//        synchronized (LazyMan.class) {
//            if (lazyMan != null) {
//                throw new RuntimeException("不要试图使用反射破坏异常");
//            }
//        }
    }

    private volatile static LazyMan lazyMan;

    //双重检测锁模式
    private static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();//不是原子性操作
                }
            }
        }
        return lazyMan;
    }


    //通过反射破坏
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //通过正常的创建
        //LazyMan instance1 = LazyMan.getInstance();

        //获取我们设置的标志字段
        Field tolaris = LazyMan.class.getDeclaredField("tolaris");
        tolaris.setAccessible(true);

        //获取构造器
        Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
        //无视私有的构造器
        constructor.setAccessible(true);
        //通过反射来创建两个对象
        LazyMan instance1 = constructor.newInstance();

        //将第一个对象的值改为false
        tolaris.set(instance1, false);

        LazyMan instance2 = constructor.newInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}

