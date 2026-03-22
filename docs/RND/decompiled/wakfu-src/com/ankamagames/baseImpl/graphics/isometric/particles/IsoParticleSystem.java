/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.isometric.particles;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public abstract class IsoParticleSystem
extends ParticleSystem
implements agn_1,
acx_0,
agV {
    public static final aci_1 cve = new aci_1(-512, 512, -512, 512);
    private short bVE;
    private int cbR;
    private byte cjZ;
    private final aci_1 cvf = new aci_1(cve);
    private boolean cvg = true;

    protected IsoParticleSystem(boolean bl) {
        super(bl);
        agX.c(this);
    }

    public void g(afV afV2) {
        float f2;
        float f3;
        float f4;
        int n = this.bJf();
        if (n == 0) {
            return;
        }
        this.T(afV2.brf().a(this));
        if (this.dcM[3] < 0.004f) {
            return;
        }
        afV2.a(this, this.azR > 0.0f);
        for (int i = 0; i < n; ++i) {
            GeometryMesh geometryMesh = (GeometryMesh)this.uh(i);
            geometryMesh.bKd().clear();
        }
        float f5 = this.aSc();
        float f6 = this.aSd();
        float f7 = this.aSe();
        this.cWN = f5;
        this.cWO = f6;
        this.cWP = f7;
        this.cej = 0.0f;
        this.bro = Integer.MAX_VALUE;
        this.brp = Integer.MAX_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.brr = Integer.MIN_VALUE;
        if (this.aNe) {
            f4 = f5;
            f3 = f6;
            f2 = f7;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.a(this.dcB, f4, f3, f2, afV2, 0);
        this.bLQ();
        this.dcT = null;
    }

    public final int bzs() {
        return this.a(this.dcB);
    }

    private int a(Particle particle) {
        Emitter[] emitterArray;
        int n = 0;
        if (particle == null) {
            return n;
        }
        if (particle != this.dcB && particle.ayP > 0.004f) {
            ++n;
        }
        if ((emitterArray = particle.dcp) == null) {
            return n;
        }
        int n2 = emitterArray.length;
        for (int i = 0; i < n2; ++i) {
            atv_1 atv_12 = emitterArray[i].dbU;
            if (atv_12 == null) continue;
            int n3 = atv_12.bLz();
            for (int j = 0; j < n3; ++j) {
                Particle particle2 = atv_12.uy(j);
                n += this.a(particle2);
            }
        }
        return n;
    }

    private void a(Particle particle, float f2, float f3, float f4, afV afV2, int n) {
        Emitter[] emitterArray;
        if (particle == null) {
            return;
        }
        if (IsoParticleSystem.bLP()) {
            return;
        }
        if (particle != this.dcB && particle.ayP > 0.004f) {
            float f5 = particle.aPY + f2;
            float f6 = particle.aPZ + f3;
            float f7 = particle.aQa + f4;
            float f8 = afV2.aM(f5, f6);
            float f9 = afV2.j(f5, f6, f7);
            this.a(particle, f8, f9);
        }
        if ((emitterArray = particle.dcp) == null) {
            return;
        }
        for (Emitter emitter : emitterArray) {
            float f10;
            float f11;
            float f12;
            atv_1 atv_12 = emitter.dbU;
            if (atv_12 == null) continue;
            if (!emitter.dbW.deD.aQM()) {
                f12 = f2;
                f11 = f3;
                f10 = f4;
            } else {
                f12 = f2 + particle.aPY;
                f11 = f3 + particle.aPZ;
                f10 = f4 + particle.aQa;
            }
            int n2 = atv_12.bLz();
            for (int i = 0; i < n2; ++i) {
                Particle particle2 = atv_12.uy(i);
                this.a(particle2, f12, f11, f10, afV2, n + 1);
            }
        }
    }

    @Override
    public final int bqh() {
        return this.cbR;
    }

    @Override
    public final short bqi() {
        return this.bVE;
    }

    @Override
    public final void a(int n, short s) {
        this.cbR = n;
        this.bVE = s;
    }

    public final byte bzt() {
        return this.cjZ;
    }

    public final void au(byte by) {
        this.cjZ = by;
    }

    @Override
    public void bzu() {
        super.bzu();
        agr.ctK.b(this);
    }

    @Override
    public float bpl() {
        return this.aSc() - this.aSd();
    }

    @Override
    public float bpm() {
        return -(this.aSc() + this.aSd());
    }

    @Override
    public float bpn() {
        return this.aSe() / 4.8f;
    }

    @Override
    public boolean bpo() {
        return false;
    }

    @Override
    public int bpp() {
        return this.bqh();
    }

    @Override
    public void brr() {
        super.brr();
        agX.c(this);
        this.bJa();
        this.cvg = true;
    }

    public boolean bzq() {
        return agX.d(this);
    }

    public int bzr() {
        return this.aNi ? afX.csn.byy() : afX.cst.byy();
    }

    public boolean f(afV afV2) {
        return afV2.a(this, this, this.bcC(), this.bcD(), this.bcE(), this.bzr(), true);
    }

    @Override
    public int bcC() {
        return GC.A(this.aSc());
    }

    @Override
    public int bcD() {
        return GC.A(this.aSd());
    }

    @Override
    public short bcE() {
        return (short)GC.B(this.aSe());
    }

    @Override
    public void p(float[] fArray) {
        this.dcU.U(fArray);
    }

    public aci_1 bty() {
        return this.cvf;
    }

    public boolean bzv() {
        return this.cvg;
    }

    public void cq(boolean bl) {
        this.cvg = bl;
    }
}

