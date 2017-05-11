package com.dianping.sparrow.common.extension;

import java.util.Comparator;

/**
 * Created by andy on 17/5/3.
 */
public class ActivationComparetor<T> implements Comparator<T> {

    public int compare(T o1, T o2) {
        Activation a1 = o1.getClass().getAnnotation(Activation.class);
        Activation a2 = o2.getClass().getAnnotation(Activation.class);

        int sequence1 = a1 == null ? 0 : a1.sequence();
        int sequence2 = a2 == null ? 0 : a2.sequence();
        return sequence1 - sequence2;
    }
}
