/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.isometric.highlight;

import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class HighLightEntity
extends Entity3D {
    public static final HighLightEntity$ObjectFactory ctS = new HighLightEntity$ObjectFactory();
    public boolean ctT;

    HighLightEntity() {
    }

    @Override
    public void brr() {
        super.brr();
        this.bIZ();
    }

    @Override
    public void clear() {
        super.clear();
        this.ctT = false;
    }
}

