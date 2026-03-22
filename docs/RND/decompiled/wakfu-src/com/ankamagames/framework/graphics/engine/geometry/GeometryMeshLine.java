/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

public abstract class GeometryMeshLine
extends GeometryMesh {
    protected float cZV = 1.0f;
    protected boolean cZW;

    public float bKh() {
        return this.cZV;
    }

    public void cN(float f2) {
        this.cZV = f2;
    }

    public boolean bKi() {
        return this.cZW;
    }

    public void cR(boolean bl) {
        this.cZW = bl;
    }

    @Override
    public void brr() {
        super.brr();
        this.cZV = 1.0f;
        this.cZW = false;
    }
}

