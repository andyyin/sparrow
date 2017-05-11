package com.dianping.sparrow.rpc.common;

import com.dianping.sparrow.rpc.exception.RpcException;

/**
 * Created by andy on 17/4/20.
 */
public interface Invoker {

    Response invoke(Request request) throws RpcException;

}
