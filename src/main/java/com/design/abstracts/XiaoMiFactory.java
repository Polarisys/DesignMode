package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:58
 */
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaoMiRouter();
    }
}
