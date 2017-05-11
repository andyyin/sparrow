package com.dianping.sparrow.rpc.transport;

/**
 * Created by andy on 17/5/10.
 */
public interface Channel {

    boolean isAvaliable();

    void open();

    void close();

}
