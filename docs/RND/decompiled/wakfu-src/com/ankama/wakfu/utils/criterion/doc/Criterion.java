/*
 * Decompiled with CFR 0.152.
 */
package com.ankama.wakfu.utils.criterion.doc;

import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Criterion {
    public String description();

    public Signature[] signatures() default {@Signature};
}

