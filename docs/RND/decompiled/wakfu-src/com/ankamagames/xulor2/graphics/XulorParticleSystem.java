/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.xulor2.graphics;

import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public final class XulorParticleSystem
extends ParticleSystem {
    private static final float uJA = (float)(Math.sqrt(3.0) / 2.0);
    private static final float uJB = -0.5f;
    private static final float uJC = 0.2f;
    private static final float uJD = 46.0f;
    private boolean uGM = false;

    public XulorParticleSystem() {
        super(false);
    }

    public void b(EntityGroup entityGroup) {
        double d2 = this.aSc();
        double d3 = this.aSd();
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (this.aNe) {
            f2 = (float)((double)f2 + d2);
            f3 = (float)((double)f3 + d3);
        }
        if (this.bJf() == 0) {
            return;
        }
        entityGroup.g(this);
        for (int i = 0; i < this.bJf(); ++i) {
            GeometryMesh geometryMesh = (GeometryMesh)this.uh(i);
            geometryMesh.bKd().clear();
        }
        this.a(this.dcB, f2, f3, 0);
        this.bLQ();
        this.dcT = null;
    }

    private void a(Particle particle, float f2, float f3, int n) {
        if (XulorParticleSystem.bLP()) {
            return;
        }
        if (particle != this.dcB && particle.ayP > 0.004f) {
            float f4;
            float f5;
            if (this.uGM) {
                acb_1 acb_12 = XulorParticleSystem.d(particle);
                f5 = acb_12.aPY;
                f4 = acb_12.aPZ;
            } else {
                f5 = particle.aPY;
                f4 = particle.aPZ;
            }
            this.a(particle, f5 + f2, f4 + f3);
        }
        if (particle.dcp == null) {
            return;
        }
        for (Emitter emitter : particle.dcp) {
            Particle particle2;
            int n2;
            atv_1 atv_12 = emitter.dbU;
            if (atv_12 == null) continue;
            int n3 = atv_12.bLz();
            if (emitter.dbW.deD.aQM()) {
                for (n2 = 0; n2 < n3; ++n2) {
                    particle2 = atv_12.uy(n2);
                    this.a(particle2, particle.aPY + f2, particle.aPZ + f3, n + 1);
                }
                continue;
            }
            for (n2 = 0; n2 < n3; ++n2) {
                particle2 = atv_12.uy(n2);
                this.a(particle2, f2, f3, n + 1);
            }
        }
    }

    @Override
    public void a(aua_2 aua_22) {
        this.dcU = aue_2.bMt();
    }

    public boolean gEG() {
        return this.uGM;
    }

    public void setApply3DTo2DProjection(boolean bl) {
        this.uGM = bl;
    }

    private static acb_1 d(Particle particle) {
        float f2 = uJA * (particle.bLv() - particle.bLw());
        float f3 = -0.5f * (particle.bLv() + particle.bLw()) + 0.2f * particle.bLx();
        return new acb_1(46.0f * f2, 46.0f * f3);
    }
}

