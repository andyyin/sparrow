package com.dianping.sparrow.rpc.transport;

import java.net.InetSocketAddress;

/**
 * Created by andy on 17/5/10.
 */
public interface Channel {

    void open();

    void close();

    boolean isAvaliable();

    InetSocketAddress getLocalAddress();

    InetSocketAddress getRemoteAddress();

}
