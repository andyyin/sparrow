package com.dianping.sparrow.rpc.config;


/**
 * Created by andy on 17/5/13.
 */
public class ReferenceConfig<T> extends AbstractReferenceConfig {

    private String interfaceName;

    private Class<T> interfaceClass;

    private transient T ref;

    public T getRef() {
        if (ref == null) {
            synchronized (this) {
                if (ref == null) {
                    init();
                }
            }
        }
        return ref;
    }

    private void init() {

    }
}
