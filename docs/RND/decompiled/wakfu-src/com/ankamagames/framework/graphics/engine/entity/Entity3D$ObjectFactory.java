/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public final class Entity3D$ObjectFactory
extends ayr_2<Entity3D> {
    public Entity3D$ObjectFactory() {
        super(Entity3D.class);
    }

    public Entity3D bJg() {
        return new Entity3D();
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.bJg();
    }
}

