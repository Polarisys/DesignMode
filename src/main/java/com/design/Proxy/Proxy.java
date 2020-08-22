package com.design.Proxy;

/**
 * @anthor Tolaris
 * @date 2020/4/15 - 1:04
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}
