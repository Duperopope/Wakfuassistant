/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle$ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.util.ArrayList;

public class Particle
extends ayq_2 {
    public static final Particle$ObjectFactory dce = new Particle$ObjectFactory();
    public float aPY;
    public float aPZ;
    public float aQa;
    public float dcf;
    public float dcg;
    public float dch;
    public float ceb;
    public float cec;
    public float ced;
    public float aRg;
    public float aRh;
    public float aRi;
    public float dci;
    public float dcj;
    public float dck;
    public float dcl;
    public float ceh;
    public float cei;
    public float aQj;
    public float aPD;
    public float aPE;
    public float axp;
    public float axq;
    public float axr;
    public float ayP;
    public float aPU;
    public float aPV;
    public float aPB;
    public float aPC;
    public float aLN;
    public float aLO;
    public float aLP;
    public float aLQ;
    public int dcm;
    public atw_2 dcn;
    public Particle dbV;
    public Emitter dco;
    public boolean aNe;
    public Emitter[] dcp;

    Particle() {
        this.aPg();
    }

    public void reset() {
        if (this.dcp != null) {
            for (Emitter emitter : this.dcp) {
                emitter.clear();
                emitter.bsI();
            }
            this.dcp = null;
        }
        this.dcn = null;
    }

    public void a(ParticleSystem particleSystem, ArrayList<auw_1> arrayList) {
        int n = arrayList.size();
        if (this.dcp == null) {
            this.dcp = new Emitter[n];
        }
        if (particleSystem.isEditable()) {
            atx_1 atx_12 = particleSystem.bLW();
            for (int i = 0; i < n; ++i) {
                auw_1 auw_12 = arrayList.get(i);
                Emitter emitter = (Emitter)Emitter.dbP.bSK();
                emitter.a(auw_12);
                emitter.dbV = this;
                this.dcp[i] = emitter;
                atx_12.a(emitter);
            }
        } else {
            for (int i = 0; i < n; ++i) {
                auw_1 auw_13 = arrayList.get(i);
                Emitter emitter = (Emitter)Emitter.dbP.bSK();
                emitter.a(auw_13);
                emitter.dbV = this;
                this.dcp[i] = emitter;
            }
        }
    }

    public void a(ParticleSystem particleSystem, float f2) {
        Object object;
        this.ceh += f2;
        this.aPY += this.ceb * f2;
        this.aPZ += this.cec * f2;
        this.aQa += this.ced * f2;
        if (this.dcn != null && this.dcn.bLE()) {
            object = (aug_1)this.dcn;
            TextureCoords textureCoords = ((aug_1)object).uF((int)(1000.0f * f2));
            this.aLN = textureCoords.top();
            this.aLO = textureCoords.left();
            this.aLP = textureCoords.bottom();
            this.aLQ = textureCoords.right();
        }
        if (this.dcp == null) {
            return;
        }
        object = this.dcp;
        int n = ((Emitter[])object).length;
        for (int i = 0; i < n; ++i) {
            ((Emitter)object[i]).a(particleSystem, f2);
        }
    }

    public boolean bnq() {
        if (this.ceh <= this.cei && this.cei != Float.MAX_VALUE) {
            return true;
        }
        if (this.dcp != null && this.dbV == null) {
            Emitter[] emitterArray = this.dcp;
            int n = emitterArray.length;
            for (int i = 0; i < n; ++i) {
                if (!emitterArray[i].bnq()) continue;
                return true;
            }
        }
        return false;
    }

    public void c(ParticleSystem particleSystem) {
        if (this.dcp == null) {
            return;
        }
        for (Emitter emitter : this.dcp) {
            atv_1 atv_12;
            int n;
            emitter.bLq();
            if (emitter.dbT != null) {
                int n2 = emitter.dbT.size();
                for (n = 0; n < n2; ++n) {
                    GeometryMesh geometryMesh = emitter.dbT.get(n);
                    particleSystem.c(geometryMesh);
                }
                emitter.dbT.clear();
            }
            if ((atv_12 = emitter.dbU) != null) {
                int n3 = atv_12.bLz();
                for (n = 0; n < n3; ++n) {
                    atv_12.uy(n).c(particleSystem);
                }
            }
            emitter.bsI();
        }
        this.dcp = null;
    }

    public final boolean bLu() {
        return this.dcp != null;
    }

    public float aSc() {
        if (this.aNe || this.dbV == null || this.dbV.aNe) {
            return this.aPY;
        }
        return this.dbV.aNe ? this.dbV.aSc() : 0.0f;
    }

    public float aSd() {
        if (this.aNe || this.dbV == null || this.dbV.aNe) {
            return this.aPZ;
        }
        return this.dbV.aNe ? this.dbV.aSd() : 0.0f;
    }

    public float aSe() {
        if (this.aNe || this.dbV == null || this.dbV.aNe) {
            return this.aQa;
        }
        return this.dbV.aNe ? this.dbV.aSe() : 0.0f;
    }

    public float bLv() {
        if (!this.aNe || this.dbV == null) {
            return this.aPY;
        }
        return this.aPY + this.dbV.bLv();
    }

    public float bLw() {
        if (!this.aNe || this.dbV == null) {
            return this.aPZ;
        }
        return this.aPZ + this.dbV.bLw();
    }

    public float bLx() {
        if (!this.aNe || this.dbV == null) {
            return this.aQa;
        }
        return this.aQa + this.dbV.bLx();
    }

    @Override
    public void brr() {
        this.aPg();
    }

    @Override
    public void brs() {
        this.reset();
        this.dbV = null;
        this.dco = null;
    }

    private void aPg() {
        this.dcf = Float.NaN;
        this.dcg = Float.NaN;
        this.dch = Float.NaN;
        this.dcl = 0.0f;
    }
}

