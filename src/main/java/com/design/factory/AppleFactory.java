package com.design.factory;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 17:25
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
