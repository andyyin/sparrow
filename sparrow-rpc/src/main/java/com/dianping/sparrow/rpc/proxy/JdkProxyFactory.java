package com.dianping.sparrow.rpc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by andy on 17/5/3.
 */
public class JdkProxyFactory implements ProxyFactory {

    public <T> T getProxy(Class<T> clz, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clz}, invocationHandler);
    }
}
