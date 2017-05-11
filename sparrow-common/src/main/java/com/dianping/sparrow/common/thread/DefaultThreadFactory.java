package com.dianping.sparrow.common.thread;

import com.dianping.sparrow.common.Constants;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by andy on 17/5/2.
 */
public class DefaultThreadFactory implements ThreadFactory {

    private static final AtomicInteger poolNumber = new AtomicInteger(1);

    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    private int priority = Thread.NORM_PRIORITY;
    private boolean daemon = false;

    public DefaultThreadFactory() {
        this(Constants.FRAMEWORK_NAME);
    }

    public DefaultThreadFactory(String prefix) {
        this(prefix, true);
    }

    public DefaultThreadFactory(String prefix, boolean daemon) {
        this(prefix, daemon, Thread.NORM_PRIORITY);
    }

    public DefaultThreadFactory(String prefix, boolean daemon, int priority) {
        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.namePrefix = prefix + "-" + poolNumber.getAndIncrement() + "-thread-";
        this.daemon = daemon;
        this.priority = priority;
    }

    public Thread newThread(Runnable r) {
        Thread thread = new Thread(group, r, namePrefix + threadNumber.getAndIncrement());
        thread.setDaemon(daemon);
        thread.setPriority(priority);
        return thread;
    }
}
