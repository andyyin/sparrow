package com.dianping.sparrow.rpc.serialize;

import java.io.IOException;

/**
 * Created by andy on 17/5/10.
 */
public interface Serializer {

    byte[] serialize(Object obj) throws IOException;

    <T> T deserialize(byte[] bytes, Class<T> clz) throws IOException;
}
