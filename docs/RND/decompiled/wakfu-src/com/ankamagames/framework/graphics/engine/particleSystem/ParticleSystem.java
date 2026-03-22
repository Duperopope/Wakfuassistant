/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.graphics.engine.particleSystem;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem$1;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ParticleSystem
extends Entity3D {
    private static final Logger dct = Logger.getLogger(ParticleSystem.class);
    public atx_1 dcu;
    public static final int dcv = 16384;
    public static final short[] dcw = new short[dcv];
    public static final Material dcx;
    public long aJw;
    public int dcy;
    public boolean aNi;
    public byte cjZ;
    public auw_2 bVo = auw_2.dfI;
    public auw_2 dcz = auw_2.dfM;
    protected int dcA;
    public Particle dcB;
    protected ArrayList<auw_1> dcC;
    protected float dcD;
    protected boolean aNe;
    protected long dcE;
    protected float dcF;
    private float cjV;
    private float dcG;
    protected float aPY;
    protected float aPZ;
    protected float aQa;
    private static int dcH;
    private int o;
    private boolean dcI;
    private boolean dcJ;
    private float dcK;
    private boolean dcL = false;
    public String aCH;
    protected final float[] dcM = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    private boolean dcN = false;
    private boolean dcO = false;
    private boolean dcP = true;
    private static final float[] dcQ;
    protected static final float[] dcR;
    private static final float[] dcS;
    private static int cSk;
    private static int cSl;
    private static int cSm;
    protected GeometryMesh dcT = null;
    protected aua_2 dcU = aue_2.bMt();
    private final auj_1 dcV = new auj_1();

    public ParticleSystem(boolean bl) {
        this.brr();
        if (bl) {
            this.dcu = new atx_1(this);
        } else {
            this.dcA = 0;
        }
        this.dcG = 0.0f;
        this.dcE = -2521772799257739264L;
    }

    protected boolean bzp() {
        return this.uz(-1);
    }

    protected final boolean uz(int n) {
        if (!this.isVisible()) {
            return false;
        }
        return age_1.cbv().n(this.dcy, this.o, n, -1);
    }

    public void cW(boolean bl) {
        this.dcP = bl;
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        boolean bl2 = this.isVisible();
        if (bl2) {
            if (!this.dcN) {
                this.bLF();
            }
        } else if (this.dcN && this.dcO) {
            this.bLG();
        }
    }

    @Override
    public void ca(float f2) {
        if (this.dcB == null) {
            return;
        }
        if (this.cjV > 0.0f) {
            if (this.dcG >= this.cjV) {
                this.reset();
                this.start();
            } else {
                this.dcG += f2;
            }
        }
        if (this.dcL && this.isVisible()) {
            this.bLF();
            this.dcL = false;
        }
        this.dcB.a(this, f2);
        if (this.dcD != 0.0f) {
            this.dcF -= f2;
            if (this.dcF <= 0.0f && !this.dcJ) {
                this.bLH();
            }
        }
        if (this.cjV <= 0.0f && !this.dcB.bnq() && !this.dcJ) {
            this.bLH();
        }
        if (!this.dcI) {
            return;
        }
        if (this.dcJ) {
            if (this.dcB.bLu()) {
                Emitter[] emitterArray = this.dcB.dcp;
                int n = emitterArray.length;
                for (int i = 0; i < n; ++i) {
                    if (!emitterArray[i].bnq()) continue;
                    return;
                }
            }
            this.bzu();
        } else {
            this.dcK -= f2;
            if (this.dcK <= 0.0f) {
                this.bzu();
            }
        }
    }

    private void bLF() {
        if (this.dcP && !this.dcN) {
            this.dcO = this.bzp();
            this.dcN = true;
        }
    }

    private void bLG() {
        if (this.dcN) {
            age_1.cbv().h(this.o, this.dcO);
        }
        this.dcO = false;
        this.dcN = false;
    }

    @Override
    public void d(art_1 art_12) {
        if (this.dcB == null || this.dcB.dcp == null) {
            return;
        }
        ava_2.bMH().cY(1.0f);
        super.d(art_12);
    }

    public void start() {
        if (this.dcB == null || this.dcB.dcp == null) {
            return;
        }
        for (Emitter emitter : this.dcB.dcp) {
            emitter.reset();
            emitter.cU(false);
        }
    }

    public void reset() {
        this.dcG = 0.0f;
        this.dcT = null;
        this.dcI = false;
        this.dcJ = false;
        this.dcL = true;
        this.dcP = true;
        this.dcO = false;
        this.dcN = false;
        this.dcU = aue_2.bMt();
    }

    public void bhk() {
        if (this.dcB == null) {
            return;
        }
        if (this.dcB.dcp == null) {
            return;
        }
        Emitter[] emitterArray = this.dcB.dcp;
        int n = emitterArray.length;
        for (int i = 0; i < n; ++i) {
            emitterArray[i].cU(true);
        }
    }

    public void bLH() {
        this.bhk();
        this.dcI = true;
        this.dcJ = true;
    }

    public void uA(int n) {
        this.bhk();
        this.dcK = (float)n / 1000.0f;
        this.dcI = true;
        this.dcJ = false;
    }

    public void bLI() {
        this.dcI = true;
        this.dcJ = false;
    }

    public void bzu() {
        if (this.dcB == null) {
            return;
        }
        int n = this.dcC.size();
        for (int i = 0; i < n; ++i) {
            this.dcC.get(i).reset();
        }
        this.bLG();
        this.dcP = true;
        this.dcB.c(this);
        this.dcB.bsI();
        this.dcB = null;
        this.bsI();
    }

    public boolean isEditable() {
        return this.dcu != null;
    }

    public void b(auw_1 auw_12) {
        this.dcC.add(auw_12);
        if (!this.isEditable()) {
            this.dcA += auw_12.deD.aSq();
        }
    }

    public final int bLJ() {
        return this.o;
    }

    public int bLK() {
        return this.dcy;
    }

    public int getDuration() {
        return (int)(this.dcD * 1000.0f);
    }

    public void setDuration(int n) {
        this.dcD = (float)n / 1000.0f;
        if (this.dcD != 0.0f) {
            this.dcF = this.dcD;
        }
    }

    public boolean aQM() {
        return this.aNe;
    }

    public void aC(boolean bl) {
        this.aNe = bl;
        this.dcB.aNe = bl;
    }

    public ArrayList<auw_1> bLL() {
        return this.dcC;
    }

    public final void T(float[] fArray) {
        System.arraycopy(fArray, 0, this.dcM, 0, fArray.length);
    }

    public final void q(float f2, float f3, float f4, float f5) {
        this.dcM[0] = f2;
        this.dcM[1] = f3;
        this.dcM[2] = f4;
        this.dcM[3] = f5;
    }

    public void cX(float f2) {
        this.cjV = f2;
    }

    public void aw(float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
    }

    public void r(float f2, float f3, float f4) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
    }

    public float aSc() {
        return this.aPY;
    }

    public float aSd() {
        return this.aPZ;
    }

    public float aSe() {
        return this.aQa;
    }

    public void gx(long l) {
        this.dcE = l;
    }

    public final long uB(int n) {
        assert (this.dcE != -2521772799257739264L);
        return this.dcE + (long)n;
    }

    public void bLM() {
        this.dcB.a(this, this.dcC);
    }

    public static int c(auw_1 auw_12) {
        int n = 0;
        n += auw_12.deD.aSq();
        if (auw_12.deF == null) {
            return n;
        }
        int n2 = auw_12.deF.size();
        for (int i = 0; i < n2; ++i) {
            auw_1 auw_13 = auw_12.deF.get(i);
            n += auw_12.deD.aSq() * ParticleSystem.c(auw_13);
        }
        return n;
    }

    public final void d(awk_1 awk_12) {
        assert (!this.isEditable()) : "Initialize should not be called on editable particle systems";
        this.bLN();
        if (this.dcA == 0) {
            return;
        }
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        this.b(gLGeometryMesh);
        gLGeometryMesh.c(this.bVo, this.dcz);
        this.a(gLGeometryMesh, awk_12, dcx);
        gLGeometryMesh.bsI();
        this.dcL = true;
    }

    private void bLN() {
        this.dcA = 0;
        int n = this.dcC.size();
        for (int i = 0; i < n; ++i) {
            auw_1 auw_12 = this.dcC.get(i);
            this.dcA += ParticleSystem.c(auw_12);
        }
    }

    private void b(GeometryMesh geometryMesh) {
        geometryMesh.a(aso_1.cZT, this.dcA * 4, arq_2.cVv);
    }

    public void bLO() {
        this.bLN();
        this.b((GeometryMesh)this.uh(0));
    }

    protected static boolean bLP() {
        return cSk >= dcQ.length;
    }

    protected void a(Particle particle, float f2, float f3) {
        float f4 = 2.0f * particle.aPU * particle.aPD;
        float f5 = 2.0f * particle.aPV * particle.aPE;
        float f6 = GC.H(particle.aQj);
        float f7 = GC.G(particle.aQj);
        float f8 = -particle.aPB * particle.aPD;
        float f9 = (particle.aPC - particle.aPV * 2.0f) * particle.aPE;
        float f10 = f2 + (f6 * f8 - f7 * f9);
        float f11 = f3 + (f7 * f8 + f6 * f9);
        float f12 = f10 - f7 * f5;
        float f13 = f11 + f6 * f5;
        float f14 = f6 * f4;
        float f15 = f7 * f4;
        float f16 = f12 + f14;
        float f17 = f13 + f15;
        float f18 = f10 + f14;
        float f19 = f11 + f15;
        GeometryMesh geometryMesh = this.isEditable() ? particle.dco.dbT.get(particle.dcm) : (GeometryMesh)this.uh(0);
        if (this.dcT != null && this.dcT != geometryMesh) {
            this.bLQ();
        }
        this.dcT = geometryMesh;
        if (f10 == Float.NaN || f11 == Float.NaN || f12 == Float.NaN || f13 == Float.NaN || f16 == Float.NaN || f17 == Float.NaN || f18 == Float.NaN || f19 == Float.NaN) {
            return;
        }
        this.dcV.y(particle.aRg, particle.aRh, particle.aRi);
        float f20 = particle.aPY + f2;
        float f21 = particle.aPZ + f3;
        float f22 = particle.aQa;
        this.dcV.b(f10, f11, 0.0f, f20, f21, 0.0f);
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPY;
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPZ;
        this.dcV.b(f12, f13, 0.0f, f20, f21, 0.0f);
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPY;
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPZ;
        this.dcV.b(f16, f17, 0.0f, f20, f21, 0.0f);
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPY;
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPZ;
        this.dcV.b(f18, f19, 0.0f, f20, f21, 0.0f);
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPY;
        ParticleSystem.dcQ[ParticleSystem.cSk++] = this.dcV.aPZ;
        float f23 = particle.axp * this.dcM[0];
        float f24 = particle.axq * this.dcM[1];
        float f25 = particle.axr * this.dcM[2];
        float f26 = particle.ayP * this.dcM[3];
        ParticleSystem.dcR[ParticleSystem.cSl++] = f23;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f24;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f25;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f26;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f23;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f24;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f25;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f26;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f23;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f24;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f25;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f26;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f23;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f24;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f25;
        ParticleSystem.dcR[ParticleSystem.cSl++] = f26;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLO;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLP;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLO;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLN;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLQ;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLN;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLQ;
        ParticleSystem.dcS[ParticleSystem.cSm++] = particle.aLP;
        if (f10 < (float)this.bro) {
            this.bro = (int)f10;
        }
        if (f11 < (float)this.brp) {
            this.brp = (int)f11;
        }
        if (f16 > (float)this.brq) {
            this.brq = (int)f16;
        }
        if (f17 > (float)this.brr) {
            this.brr = (int)f17;
        }
    }

    protected void bLQ() {
        if (this.dcT == null) {
            return;
        }
        VertexBufferPCT vertexBufferPCT = this.dcT.bKd();
        try {
            int n = cSk / 2;
            vertexBufferPCT.a(dcQ, cSk);
            this.dcU.a(vertexBufferPCT, dcR, cSl);
            vertexBufferPCT.e(dcS, cSm);
            vertexBufferPCT.ud(vertexBufferPCT.bIF() + n);
        }
        catch (BufferOverflowException bufferOverflowException) {
            dct.error((Object)("systemFile=" + this.bLK() + " positionIndex=" + cSk + "  maxVertex=" + vertexBufferPCT.bIG() + "  numVertex=" + vertexBufferPCT.bIF()));
            dct.error((Object)"", (Throwable)bufferOverflowException);
            System.exit(0);
        }
        ParticleSystem.bLR();
    }

    protected static void bLR() {
        cSk = 0;
        cSl = 0;
        cSm = 0;
    }

    private static int bLS() {
        return dcH++;
    }

    public boolean bnq() {
        return !this.dcI;
    }

    public Emitter[] bLT() {
        if (this.dcB != null) {
            return this.dcB.dcp;
        }
        return null;
    }

    public boolean bLU() {
        return this.dcJ;
    }

    public float bLV() {
        return this.dcF;
    }

    public atx_1 bLW() {
        return this.dcu;
    }

    public void d(auw_2 auw_22, auw_2 auw_23) {
        this.bVo = auw_22;
        this.dcz = auw_23;
    }

    @Override
    public void brs() {
        super.brs();
        if (this.dcB != null) {
            this.dcB.reset();
            this.dcB.bsI();
            this.dcB = null;
        }
        this.dcC = null;
        this.dcT = null;
    }

    @Override
    public void brr() {
        super.brr();
        if (this.dcu != null) {
            this.dcu = new atx_1(this);
        } else {
            this.dcA = 0;
        }
        this.dcE = -2521772799257739264L;
        this.dcB = new ParticleSystem$1(this);
        this.dcB.ceh = 0.0f;
        this.dcB.cei = Float.MAX_VALUE;
        this.dcB.aPY = 0.0f;
        this.dcB.aPZ = 0.0f;
        this.dcB.aQa = 0.0f;
        this.dcB.ceb = 0.0f;
        this.dcB.cec = 0.0f;
        this.dcB.ced = 0.0f;
        this.dcC = new ArrayList(1);
        this.o = ParticleSystem.bLS();
        this.aJw = 0L;
        this.dcy = 0;
        this.aNi = false;
        this.cjZ = 0;
        this.bVo = auw_2.dfI;
        this.dcz = auw_2.dfM;
        this.reset();
    }

    public void a(aua_2 aua_22) {
        this.dcU = aua_22;
    }

    public static /* synthetic */ void e(ParticleSystem particleSystem) {
        super.clear();
    }

    static {
        for (int i = 0; i < dcw.length; ++i) {
            ParticleSystem.dcw[i] = (short)i;
        }
        dcx = (Material)Material.daL.bSJ();
        dcx.f(Material.daH);
        dcQ = new float[2 * dcv];
        dcR = new float[4 * dcv];
        dcS = new float[2 * dcv];
        dcH = 1;
        cSk = 0;
        cSl = 0;
        cSm = 0;
    }
}

