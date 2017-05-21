package com.dianping.sparrow.common.logger;

import java.io.Serializable;

/**
 * Created by andy on 17/5/14.
 */
public class Slf4jLogger implements Logger, Serializable {

    private final org.slf4j.Logger logger;

    public Slf4jLogger(org.slf4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void trace(String msg) {
        this.logger.trace(msg);
    }

    @Override
    public void trace(Throwable e) {
        this.logger.trace(e.getMessage(), e);
    }

    @Override
    public void trace(String msg, Throwable e) {
        this.logger.trace(msg, e);
    }

    @Override
    public void debug(String msg) {
        this.logger.debug(msg);
    }

    @Override
    public void debug(Throwable e) {
        this.logger.debug(e.getMessage(), e);
    }

    @Override
    public void debug(String msg, Throwable e) {
        this.logger.debug(msg, e);
    }

    @Override
    public void info(String msg) {
        this.logger.info(msg);
    }

    @Override
    public void info(Throwable e) {
        this.logger.info(e.getMessage(), e);
    }

    @Override
    public void info(String msg, Throwable e) {
        this.logger.info(msg, e);
    }

    @Override
    public void warn(String msg) {
        this.logger.warn(msg);
    }

    @Override
    public void warn(Throwable e) {
        this.logger.warn(e.getMessage(), e);
    }

    @Override
    public void warn(String msg, Throwable e) {
        this.logger.warn(msg, e);
    }

    @Override
    public void error(String msg) {
        this.logger.error(msg);
    }

    @Override
    public void error(Throwable e) {
        this.logger.error(e.getMessage(), e);
    }

    @Override
    public void error(String msg, Throwable e) {
        this.logger.error(msg, e);
    }

    @Override
    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }
}
