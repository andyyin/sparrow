package com.dianping.sparrow.rpc.common;

/**
 * Created by andy on 17/4/20.
 */
public enum CallType {
    /**
     * oneWay, do not need reply
     */
    OneWay((byte) 1, "oneWay"),

    /**
     * twoWay, need reply
     */
    TwoWay((byte) 2, "twoWay");

    private byte code;
    private String name;

    private CallType(byte code, String name) {
        this.code = code;
        this.name = name;
    }

    public boolean isOneWay() {
        return this == OneWay;
    }

    public boolean isTwoWay() {
        return this == TwoWay;
    }

    public static boolean isOneWay(byte code) {
        return OneWay.getCode() == code;
    }

    public static boolean isTwoWay(byte code) {
        return TwoWay.getCode() == code;
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
