/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public final class EntitySprite$ObjectFactory
extends ayr_2<EntitySprite> {
    public EntitySprite$ObjectFactory() {
        super(EntitySprite.class);
    }

    public EntitySprite bJo() {
        return new EntitySprite();
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.bJo();
    }
}

