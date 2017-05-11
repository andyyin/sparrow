package com.dianping.sparrow.rpc.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by andy on 17/5/3.
 */
public interface ProxyFactory {

    <T> T getProxy(Class<T> clz, InvocationHandler invocationHandler);
}
