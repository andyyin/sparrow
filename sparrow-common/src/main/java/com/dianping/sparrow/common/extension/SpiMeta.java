package com.dianping.sparrow.common.extension;

import java.lang.annotation.*;

/**
 * Created by andy on 17/5/2.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SpiMeta {

    String name() default "";

}
