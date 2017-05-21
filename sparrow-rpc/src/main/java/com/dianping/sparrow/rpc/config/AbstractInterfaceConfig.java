package com.dianping.sparrow.rpc.config;

import java.util.List;

/**
 * Created by andy on 17/5/21.
 */
public abstract class AbstractInterfaceConfig extends AbstractMethodConfig {

    private String serviceName;

    protected List<ProtocolConfig> protocols;

    protected List<RegistryConfig> registries;

    protected String application;

    protected String group;

    protected String version;
}
