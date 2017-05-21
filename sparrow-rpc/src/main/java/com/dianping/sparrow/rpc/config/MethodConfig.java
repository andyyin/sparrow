package com.dianping.sparrow.rpc.config;

/**
 * Created by andy on 17/5/9.
 */
public class MethodConfig extends AbstractMethodConfig {

    // 方法名
    private String name;

    // 超时时间
    private Integer requestTimeout;

    // 失败重试次数（默认为0，不重试）
    private Integer retries;

    // 最大并发调用
    private Integer actives;

    // 参数类型（逗号分隔）
    private String argumentTypes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    @Override
    public Integer getRetries() {
        return retries;
    }

    @Override
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    @Override
    public Integer getActives() {
        return actives;
    }

    @Override
    public void setActives(Integer actives) {
        this.actives = actives;
    }

    public String getArgumentTypes() {
        return argumentTypes;
    }

    public void setArgumentTypes(String argumentTypes) {
        this.argumentTypes = argumentTypes;
    }
}
