package com.dianping.sparrow.rpc.config;

import com.dianping.sparrow.rpc.common.Callback;

/**
 * Created by andy on 17/5/21.
 */
public abstract class AbstractMethodConfig extends AbstractConfig {

    // 远程调用超时时间(毫秒)
    protected Integer timeout;

    // 重试次数
    protected Integer retries;

    // 最大并发调用
    protected Integer actives;

    // 负载均衡
    protected String loadbalance;

    // 是否异步
    protected String callType;

    //回调
    protected Callback callback;

    // 服务接口的失败mock实现类名
    protected String mock;

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getActives() {
        return actives;
    }

    public void setActives(Integer actives) {
        this.actives = actives;
    }

    public String getLoadbalance() {
        return loadbalance;
    }

    public void setLoadbalance(String loadbalance) {
        this.loadbalance = loadbalance;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public Callback getCallback() {
        return callback;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public String getMock() {
        return mock;
    }

    public void setMock(String mock) {
        this.mock = mock;
    }
}
