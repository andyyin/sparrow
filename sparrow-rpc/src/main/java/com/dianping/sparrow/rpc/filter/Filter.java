package com.dianping.sparrow.rpc.filter;

import com.dianping.sparrow.rpc.common.Invoker;
import com.dianping.sparrow.rpc.common.Request;
import com.dianping.sparrow.rpc.common.Response;

/**
 * Created by andy on 17/4/20.
 */
public interface Filter {

    Response filter(Invoker invoker, Request request);
}
