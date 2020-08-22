package com.design.factory;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 17:26
        */
public class XiaoMiFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }
}
