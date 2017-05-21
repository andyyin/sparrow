package com.dianping.sparrow.rpc.config;

/**
 * Created by andy on 17/5/21.
 */
public abstract class AbstractReferenceConfig extends AbstractInterfaceConfig {

    // 优先从JVM内获取引用实例
    protected Boolean injvm;

    // lazy create connection
    protected Boolean lazy;

    protected Boolean sticky;

    // 是否共享 channel
    protected Integer connections;

    public Boolean getInjvm() {
        return injvm;
    }

    public void setInjvm(Boolean injvm) {
        this.injvm = injvm;
    }

    public Boolean getLazy() {
        return lazy;
    }

    public void setLazy(Boolean lazy) {
        this.lazy = lazy;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }
}
