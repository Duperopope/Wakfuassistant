/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

public final class Particle$ObjectFactory
extends ayr_2<Particle> {
    public Particle$ObjectFactory() {
        super(Particle.class);
    }

    public Particle bLy() {
        return new Particle();
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.bLy();
    }
}

