package com.dianping.sparrow.rpc.common;

import com.dianping.sparrow.common.util.StringUtils;

/**
 * Created by andy on 17/4/20.
 */
public enum CallType {

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
    Callback((byte) 3, "callback"),

    /**
     * oneWay, do not need reply
     */
    OneWay((byte) 4, "oneWay");

    private byte code;

    private String name;

    private CallType(byte code, String name) {
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

    public boolean isOneWay() {
        return this == OneWay;
    }

    public static boolean isOneWay(byte code) {
        return OneWay.getCode() == code;
    }

    public static CallType getType(String name) {
        for (CallType callType : CallType.values()) {

            if (StringUtils.equalsIgnoreCase(callType.getName(), name)) {
                return callType;
            }
        }
        throw new IllegalArgumentException("Illegal call type name " + name);
    }

    public static CallType getType(byte code) {
        for (CallType callType : CallType.values()) {

            if (callType.getCode() == code) {
                return callType;
            }
        }
        throw new IllegalArgumentException("Illegal call type code " + code);
    }

    public byte getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CallType{code=" + code + ", name=" + name + "}";
    }
}
