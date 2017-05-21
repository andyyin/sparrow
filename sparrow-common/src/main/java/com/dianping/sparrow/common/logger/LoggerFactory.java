package com.dianping.sparrow.common.logger;

/**
 * Created by andy on 17/5/13.
 */
public class LoggerFactory {

    private static volatile LoggerAdapter loggerAdapter;

    static {
        loggerAdapter = new Slf4jLoggerAdapter();
    }

    public static Logger getLogger(String key) {
        return loggerAdapter.getLogger(key);
    }


    public static Logger getLogger(Class<?> key) {
        return loggerAdapter.getLogger(key);
    }
}
