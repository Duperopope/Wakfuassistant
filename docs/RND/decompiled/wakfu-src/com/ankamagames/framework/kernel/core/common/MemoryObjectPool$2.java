/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.kernel.core.common;

public class MemoryObjectPool$2
extends ayr_2 {
    final /* synthetic */ Class duv;

    public MemoryObjectPool$2(Class clazz, Class clazz2) {
        this.duv = clazz2;
        super(clazz);
    }

    public ayq_2 bru() {
        try {
            return (ayq_2)this.duv.newInstance();
        }
        catch (InstantiationException instantiationException) {
            ays_2.dup.error((Object)"", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException(this.duv.toString(), illegalAccessException);
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException(String.valueOf(this.duv) + " n'est pas de type MemoryObject");
        }
        return null;
    }
}

