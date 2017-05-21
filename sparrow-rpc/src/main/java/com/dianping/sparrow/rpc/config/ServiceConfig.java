package com.dianping.sparrow.rpc.config;

/**
 * Created by andy on 17/5/9.
 */
public class ServiceConfig<T> extends AbstractServiceConfig {

    private String interfaceName;

    private Class<T> interfaceClass;

    private T ref;
}
