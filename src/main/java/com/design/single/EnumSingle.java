package com.design.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 14:02
 */
//枚举
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}

class test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> constructor =
                EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumSingle instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
