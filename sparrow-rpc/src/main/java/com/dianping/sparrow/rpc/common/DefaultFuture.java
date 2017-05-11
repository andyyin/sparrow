package com.dianping.sparrow.rpc.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by andy on 17/5/8.
 */
public class DefaultFuture<T> implements Future<T> {

    private static final Map<Long, DefaultFuture> FUTURES = new ConcurrentHashMap<Long, DefaultFuture>();

    private Request request;

    private volatile Response response;

    public DefaultFuture(Request request) {
        this.request = request;
    }


    public T get() {
        return get(request.getTimeout());
    }

    public T get(int timeoutInMillis) {
        return null;
    }

    public boolean isDone() {
        return response != null;
    }

    public static void recieve(long requestId, Response response) {
        DefaultFuture future = FUTURES.remove(requestId);
        if (future != null) {
            future.doRecieve(response);
        }
    }

    private void doRecieve(Response response) {
        this.response = response;
    }
}
