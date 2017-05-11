package com.dianping.sparrow.rpc.common;

/**
 * Created by andy on 17/5/8.
 */
public interface Callback {

    void onSuccess(Object result);

    void onFailure(Throwable t);
}
