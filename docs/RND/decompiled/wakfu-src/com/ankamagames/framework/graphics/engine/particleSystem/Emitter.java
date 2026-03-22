/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter$ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

public class Emitter
extends ayq_2 {
    public static final Emitter$ObjectFactory dbP = new Emitter$ObjectFactory();
    public float cdW;
    public float dbQ;
    public float dbR;
    public boolean bYX;
    public boolean dbS;
    public ArrayList<GeometryMesh> dbT;
    public atv_1 dbU;
    public Particle dbV;
    public auw_1 dbW;
    public auxx_1 dbX;
    public Particle dbY;
    private atu_2 dbZ;
    private float dca = 0.0f;

    Emitter() {
        this.clear();
    }

    public void a(auw_1 auw_12) {
        this.dbW = auw_12;
        this.a(auw_12.dbX);
    }

    public void a(ParticleSystem particleSystem, float f2) {
        Object object;
        Object object2;
        int n;
        int n2;
        this.cdW += f2;
        if (this.dbU != null) {
            n2 = this.dbU.bLz();
            for (n = 0; n < n2; ++n) {
                object2 = this.dbU.uy(n);
                if (((Particle)object2).bnq()) continue;
                ((Particle)object2).c(particleSystem);
                ((ayy_2)object2).bsI();
                this.dbU.ux(n);
            }
            this.dbU.bLA();
        }
        if (this.bLp()) {
            this.b(particleSystem, f2);
        }
        if (this.dbX != null) {
            if (this.dbX.bLl()) {
                n = this.dbX.bLm();
                for (n2 = 0; n2 < n; ++n2) {
                    object2 = this.dbX.uw(n2);
                    ((atq_1)object2).a(f2, this.dbV, this.dbY, particleSystem);
                }
            }
            if (this.dbX.bLj()) {
                n = this.dbX.bLk();
                for (n2 = 0; n2 < n; ++n2) {
                    object2 = this.dbX.uv(n2);
                    ((atq_1)object2).a(0.03f, this.dbV, this.dbY, particleSystem);
                }
            }
            this.dbZ.a(f2, this, particleSystem);
        }
        if (this.dbU == null) {
            return;
        }
        n = this.dbU.bLz();
        if (this.dbW.bLj()) {
            if (n != 0) {
                this.dbQ += f2;
            }
            n2 = this.dbW.bLk();
            while (this.dbQ >= 0.03f) {
                for (int i = 0; i < n; ++i) {
                    object = this.dbU.uy(i);
                    float f3 = ((Particle)object).ceh;
                    ((Particle)object).ceh = ((Particle)object).dcl;
                    if (((Particle)object).dcl <= ((Particle)object).cei) {
                        for (int j = 0; j < n2; ++j) {
                            atq_1 atq_12 = this.dbW.uv(j);
                            atq_12.a(0.03f, this.dbV, (Particle)object, particleSystem);
                        }
                    }
                    ((Particle)object).dcl += 0.03f;
                    ((Particle)object).ceh = f3;
                }
                this.dbQ -= 0.03f;
            }
        }
        if (this.dbW.bLl()) {
            int n3;
            n2 = this.dbW.bLm();
            for (n3 = 0; n3 < n2; ++n3) {
                object = this.dbW.uw(n3);
                for (int i = n - 1; i >= 0 && !((atq_1)object).a(f2, this.dbV, this.dbU.uy(i), particleSystem); --i) {
                }
            }
            for (n3 = 0; n3 < n; ++n3) {
                this.dbU.uy(n3).a(particleSystem, f2);
            }
        } else {
            for (n2 = 0; n2 < n; ++n2) {
                this.dbU.uy(n2).a(particleSystem, f2);
            }
        }
    }

    public boolean bnq() {
        if (this.bLo()) {
            return true;
        }
        if (this.bLp()) {
            return true;
        }
        if (this.dbU == null) {
            return false;
        }
        int n = this.dbU.bLz();
        for (int i = 0; i < n; ++i) {
            Particle particle = this.dbU.uy(i);
            if (particle.ceh < particle.cei) {
                return true;
            }
            if (!particle.bLu()) continue;
            Emitter[] emitterArray = particle.dcp;
            int n2 = emitterArray.length;
            for (int j = 0; j < n2; ++j) {
                if (!emitterArray[j].bnq()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean bLo() {
        return this.cdW < this.dbW.deD.aSo();
    }

    public boolean bLp() {
        if (this.dbV != null && this.dbV.ceh <= 0.0f) {
            return false;
        }
        if (this.dbS) {
            return false;
        }
        if (!this.bYX) {
            return false;
        }
        if (this.cdW < this.dbW.deD.aSo()) {
            return false;
        }
        return this.dbW.deD.aSp() == 0.0f || !(this.cdW > this.dbW.deD.aSp());
    }

    public void b(ParticleSystem particleSystem, float f2) {
        if (this.dbW.deD.aSs() == 0.0f) {
            return;
        }
        this.dbR += f2;
        float f3 = this.dbW.deD.aSs() + this.dca;
        if (this.dbU == null) {
            this.dbU = new atv_1(this.dbW.deD.aSq());
        } else {
            if (this.dbR < f3) {
                return;
            }
            if (this.dbU.bLC()) {
                return;
            }
            this.dbR -= f3;
        }
        this.dca = this.dbW.deD.aSt() * GC.aNJ();
        for (int i = 0; i < this.dbW.deD.aSr(); ++i) {
            Particle particle;
            atw_2 atw_22;
            int n = this.dbW.bMq();
            if (n < 0 || (atw_22 = this.dbW.deE.get(n)) == null || (particle = atw_22.d(particleSystem)) == null) continue;
            this.dbU.b(particle);
            particle.dcm = n;
            particle.dco = this;
            this.dbW.a(particleSystem, this.dbV, particle);
            atw_22.c(particle);
            if (particle.bLu()) {
                for (Emitter emitter : particle.dcp) {
                    if (!emitter.bLp()) continue;
                    emitter.b(particleSystem, f2);
                }
            }
            if (this.dbU.bLC()) break;
        }
    }

    public void cU(boolean bl) {
        this.dbS = bl;
        if (this.dbU == null) {
            return;
        }
        int n = this.dbU.bLz();
        for (int i = 0; i < n; ++i) {
            Particle particle = this.dbU.uy(i);
            if (!particle.bLu()) continue;
            for (Emitter emitter : particle.dcp) {
                emitter.cU(bl);
            }
        }
    }

    public void reset() {
        if (this.dbU != null) {
            int n = this.dbU.bLz();
            for (int i = 0; i < n; ++i) {
                Particle particle = this.dbU.uy(i);
                if (particle.bLu()) {
                    Emitter[] emitterArray = particle.dcp;
                    int n2 = emitterArray.length;
                    for (int j = 0; j < n2; ++j) {
                        emitterArray[j].reset();
                    }
                }
                particle.bsI();
            }
            this.dbU.bLB();
        }
        if (this.dbY != null) {
            this.dbY.aPY = 0.0f;
            this.dbY.aPZ = 0.0f;
            this.dbY.aQa = 0.0f;
            this.dbY.ceb = 0.0f;
            this.dbY.cec = 0.0f;
            this.dbY.ced = 0.0f;
            this.dbY.ceh = 0.0f;
            this.dbY.cei = 0.0f;
        }
        this.cdW = 0.0f;
        this.bYX = true;
        this.dbS = false;
        this.dbR = 0.0f;
    }

    public void clear() {
        if (this.dbU != null) {
            int n = this.dbU.bLz();
            for (int i = 0; i < n; ++i) {
                Particle particle = this.dbU.uy(i);
                if (particle.bLu()) {
                    Emitter[] emitterArray = particle.dcp;
                    int n2 = emitterArray.length;
                    for (int j = 0; j < n2; ++j) {
                        emitterArray[j].clear();
                    }
                }
                particle.bsI();
            }
            this.dbU.bLB();
            this.dbU = null;
        }
        if (this.dbT != null) {
            this.dbT.clear();
            this.dbT = null;
        }
        this.a((auxx_1)null);
        this.cdW = 0.0f;
        this.dbQ = 0.0f;
        this.bYX = true;
        this.dbS = false;
        this.dbR = 0.0f;
        this.dca = 0.0f;
        this.dbV = null;
        this.dbW = null;
    }

    public void bLq() {
        if (this.dbX == null || this.dbZ == null) {
            return;
        }
        this.dbZ.bLt();
        this.dbZ = null;
    }

    public void a(auxx_1 auxx_12) {
        if (auxx_12 == this.dbX) {
            return;
        }
        if (this.dbZ != null) {
            this.dbZ.bLt();
            this.dbZ = null;
            this.dbY.reset();
            this.dbY.bsI();
            this.dbY = null;
        }
        this.dbX = auxx_12;
        if (this.dbX != null) {
            this.dbZ = new atu_2(this.dbX);
            this.dbZ.bLs();
            this.dbY = this.dbX.bMr();
            this.dbW.a(this.dbV, this.dbY);
            this.dbY.cei -= 0.1f;
            this.dbY.dbV = this.dbV;
        }
    }

    @Override
    public void brr() {
    }

    @Override
    public void brs() {
        this.clear();
    }
}

