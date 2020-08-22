package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:59
 */
public class AppleFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new ApplePhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new AppleRouter();
    }
}
