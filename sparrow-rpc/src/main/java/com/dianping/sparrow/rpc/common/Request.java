package com.dianping.sparrow.rpc.common;

import java.util.Map;

/**
 * Created by andy on 17/4/20.
 */
public interface Request {

    /**
     * service name
     * @return
     */
    String getServiceName();

    /**
     * interface name
     * @return
     */
    String getInterfaceName();

    /**
     * method name
     * @return
     */
    String getMethodName();

    /**
     * service method param
     *
     * @return
     */
    Object[] getArguments();

    /**
     * get framework param
     *
     * @return
     */
    Map<String, String> getAttachments();


    int getTimeout();




}
