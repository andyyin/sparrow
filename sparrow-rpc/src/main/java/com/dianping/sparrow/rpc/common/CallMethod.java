package com.dianping.sparrow.rpc.common;

/**
 * Created by andy on 17/4/20.
 */
public enum CallMethod {
    /**
     * sync invoke
     */
    Sync((byte) 1, "sync"),

    /**
     * future invoke
     */
    Future((byte) 2, "future"),

    /**
     * callback invoke
     */
    Callback((byte) 3, "callback");

    private byte code;

    private String name;

    private CallMethod(byte code, String name) {
        this.code = code;
        this.name = name;
    }


    public boolean isSync() {
        return this == Sync;
    }

    public boolean isFuture() {
        return this == Future;
    }

    public boolean isCallback() {
        return this == Callback;
    }

    public static boolean isSync(byte code) {
        return Sync.getCode() == code;
    }

    public static boolean isFuture(byte code) {
        return Future.getCode() == code;
    }

    public static boolean isCallback(byte code) {
        return Callback.getCode() == code;
    }

    public byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CallMethod{code=" + code + ", name=" + name + "}";
    }
}
