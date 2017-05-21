package com.dianping.sparrow.common;

import java.util.Map;

/**
 * Created by andy on 17/5/14.
 */
public class URL {

    private String protocol;

    private String host;

    private int port;

    // interfaceName
    private String path;

    private Map<String, String> parameters;

    private Map<String,Number> numbers;

    public URL() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Map<String, Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(Map<String, Number> numbers) {
        this.numbers = numbers;
    }
}
