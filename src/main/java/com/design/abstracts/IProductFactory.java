package com.design.abstracts;

/**
 * @anthor Tolaris
 * @date 2020/4/14 - 15:55
 */

//抽象产品工厂
public interface IProductFactory {

    //生产手机
    IPhoneProduct iPhoneProduct();

    //生产路由器
    IRouterProduct iRouterProduct();
}
