/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public final class GLGeometrySprite$ObjectFactory
extends ayr_2<GLGeometrySprite> {
    public GLGeometrySprite$ObjectFactory() {
        super(GLGeometrySprite.class);
    }

    public final GLGeometrySprite bLa() {
        return new GLGeometrySprite();
    }

    public final String toString() {
        return "Factory pour les GLGeometrySprite";
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.bLa();
    }
}

