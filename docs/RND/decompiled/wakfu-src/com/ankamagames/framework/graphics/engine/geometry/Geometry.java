/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.material.Material;

public abstract class Geometry
extends ayq_2 {
    protected auw_2 cZH;
    protected auw_2 cZI;

    public final void c(auw_2 auw_22, auw_2 auw_23) {
        this.cZH = auw_22;
        this.cZI = auw_23;
    }

    public final auw_2 bKb() {
        return this.cZH;
    }

    public final auw_2 bKc() {
        return this.cZI;
    }

    public abstract void c(float var1, float var2, float var3, float var4);

    public void d(Material material) {
    }

    public abstract void ca(float var1);

    public abstract void b(art_1 var1);

    @Override
    public void brr() {
        this.c(auw_2.dfL, auw_2.dfM);
    }
}

