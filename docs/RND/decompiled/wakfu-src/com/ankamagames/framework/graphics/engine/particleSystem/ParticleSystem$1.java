/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

class ParticleSystem$1
extends Particle {
    final /* synthetic */ ParticleSystem dcX;

    ParticleSystem$1(ParticleSystem particleSystem) {
        this.dcX = particleSystem;
    }

    @Override
    public float aSc() {
        return this.aNe ? 0.0f : this.dcX.aSc();
    }

    @Override
    public float aSd() {
        return this.aNe ? 0.0f : this.dcX.aSd();
    }

    @Override
    public float aSe() {
        return this.aNe ? 0.0f : this.dcX.aSe();
    }
}

