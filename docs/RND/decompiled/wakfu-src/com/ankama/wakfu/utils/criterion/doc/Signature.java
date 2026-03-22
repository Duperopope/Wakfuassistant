/*
 * Decompiled with CFR 0.152.
 */
package com.ankama.wakfu.utils.criterion.doc;

import com.ankama.wakfu.utils.criterion.doc.Parameter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.TYPE})
public @interface Signature {
    public String description() default "";

    public Parameter[] params() default {};
}

