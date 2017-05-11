package com.dianping.sparrow.rpc.common;

/**
 * Created by andy on 17/5/8.
 */
public interface Future<T> {

    T get();

    T get(int timeoutInMillis);

    boolean isDone();
}
