/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from abC
 */
public abstract class abc_0
extends abb_0 {
    public float aQr;
    public float cdH;
    protected final Entity3D cdI = (Entity3D)Entity3D.cXb.bSJ();
    protected VertexBufferPCT cdJ;
    protected static final int cdK = 4096;
    protected static final float[] cdL = new float[32768];
    protected static final float[] cdM = new float[65536];
    protected static final float[] cdN = new float[32768];
    protected final abf_0 cdO;
    protected azk_2 cdP;
    protected int cdQ;
    protected int cdR;
    protected int cdS;
    protected TIntArrayList cdT;
    protected abe_0[] cdU;
    protected abg_1 cdV;
    protected float cdW;
    protected float cdX;

    public abc_0(abf_0 abf_02) {
        this.cdO = abf_02;
    }

    private void aD(int n, int n2) {
        int n3;
        n = Math.min(n, 4096);
        this.cdR = 0;
        this.cdQ = 0;
        this.cdS = Math.min(n2, n);
        this.cdU = new abe_0[n];
        for (n3 = 0; n3 < n; ++n3) {
            this.cdU[n3] = this.cdO.btk();
        }
        this.cdP = new azk_2(n);
        this.cdT = new TIntArrayList(n);
        n3 = n * 4;
        this.cdJ = VertexBufferPCT.cWa.ue(n3);
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        gLGeometryMesh.a(aso_1.cZT, this.cdJ, arq_2.cVv);
        gLGeometryMesh.c(auw_2.dfL, auw_2.dfM);
        this.cdI.b(gLGeometryMesh);
        gLGeometryMesh.bsI();
    }

    public void rw(int n) {
        this.aD(n, n);
    }

    public void rA(int n) {
        this.cdS = Math.min(n, this.cdU.length);
    }

    @Override
    public void clear() {
        this.cdI.bsI();
    }

    @Override
    public void reset() {
        this.cdW = 0.0f;
        this.cdX = 0.0f;
        if (this.cdP != null) {
            for (int i = 0; i < this.cdR; ++i) {
                this.cdP.vI(this.cdT.get(i) - 1);
            }
        }
        if (this.cdT != null) {
            this.cdT.clear();
        }
        this.cdR = 0;
    }

    @Override
    public void qF(int n) {
        this.cdW += (float)n;
        if (this.bUu == null) {
            return;
        }
        this.bth();
        float f2 = (float)n / 1000.0f;
        this.cdX += f2;
        this.btg();
        this.bZ(f2);
        this.cdJ.clear();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < this.cdR; ++i) {
            float f3;
            int n6 = this.cdT.getQuick(i) - 1;
            abe_0 abe_02 = this.cdU[n6];
            float f4 = (abe_02.aPY - abe_02.aPZ) * 43.0f;
            float f5 = -(abe_02.aPY + abe_02.aPZ) * 21.5f + abe_02.aQa * 10.0f;
            float f6 = 1.0f;
            if (!this.btj()) {
                f6 = 1.5f / this.bUu.byB();
            }
            float f7 = abe_02.brL * f6;
            float f8 = abe_02.cej * f6;
            if (this.bti()) {
                f3 = GC.H(abe_02.aQj);
                float f9 = GC.G(abe_02.aQj);
                float f10 = f3 * f8;
                float f11 = f9 * f8;
                float f12 = -f9 * f7;
                float f13 = f3 * f7;
                abc_0.cdL[n5++] = f4 - f10 - f12;
                abc_0.cdL[n5++] = f5 - f11 - f13;
                abc_0.cdL[n5++] = f4 - f10 + f12;
                abc_0.cdL[n5++] = f5 - f11 + f13;
                abc_0.cdL[n5++] = f4 + f10 + f12;
                abc_0.cdL[n5++] = f5 + f11 + f13;
                abc_0.cdL[n5++] = f4 + f10 - f12;
                abc_0.cdL[n5++] = f5 + f11 - f13;
            } else {
                abc_0.cdL[n5++] = f4 - f7;
                abc_0.cdL[n5++] = f5 - f8;
                abc_0.cdL[n5++] = f4 - f7;
                abc_0.cdL[n5++] = f5 + f8;
                abc_0.cdL[n5++] = f4 + f7;
                abc_0.cdL[n5++] = f5 + f8;
                abc_0.cdL[n5++] = f4 + f7;
                abc_0.cdL[n5++] = f5 - f8;
            }
            f3 = abe_02.ayP;
            abc_0.cdM[n4++] = abe_02.axp;
            abc_0.cdM[n4++] = abe_02.axq;
            abc_0.cdM[n4++] = abe_02.axr;
            abc_0.cdM[n4++] = f3;
            abc_0.cdM[n4++] = abe_02.axp;
            abc_0.cdM[n4++] = abe_02.axq;
            abc_0.cdM[n4++] = abe_02.axr;
            abc_0.cdM[n4++] = f3;
            abc_0.cdM[n4++] = abe_02.axp;
            abc_0.cdM[n4++] = abe_02.axq;
            abc_0.cdM[n4++] = abe_02.axr;
            abc_0.cdM[n4++] = f3;
            abc_0.cdM[n4++] = abe_02.axp;
            abc_0.cdM[n4++] = abe_02.axq;
            abc_0.cdM[n4++] = abe_02.axr;
            abc_0.cdM[n4++] = f3;
            abc_0.cdN[n3++] = abe_02.aAs;
            abc_0.cdN[n3++] = abe_02.aAt;
            abc_0.cdN[n3++] = abe_02.aAs;
            abc_0.cdN[n3++] = abe_02.aAr;
            abc_0.cdN[n3++] = abe_02.aAu;
            abc_0.cdN[n3++] = abe_02.aAr;
            abc_0.cdN[n3++] = abe_02.aAu;
            abc_0.cdN[n3++] = abe_02.aAt;
            ++n2;
        }
        this.cdJ.a(cdL, n5);
        this.cdJ.c(cdM, n4);
        this.cdJ.e(cdN, n3);
        this.cdJ.ud(n2 * 4);
    }

    private void bZ(float f2) {
        for (int i = 0; i < this.cdR; ++i) {
            int n = this.cdT.getQuick(i) - 1;
            abe_0 abe_02 = this.cdU[n];
            this.a(abe_02, f2);
        }
    }

    private void btg() {
        if (this.cdX > this.aQr) {
            int n = 0;
            while ((float)n < this.cdH && this.cdR < this.cdS) {
                int n2 = this.cdP.bTk();
                this.cdT.add(n2 + 1);
                ++this.cdR;
                abe_0 abe_02 = this.cdU[n2];
                this.a(abe_02);
                ++n;
            }
            this.cdX -= this.aQr;
        }
    }

    private void bth() {
        float f2 = this.bUu.getAltitude();
        int n = 0;
        while (n < this.cdR) {
            int n2 = this.cdT.getQuick(n) - 1;
            abe_0 abe_02 = this.cdU[n2];
            float f3 = abe_02.aQa - f2;
            if (f3 <= this.cdV.bVJ() && f3 >= this.cdV.bVK() && abe_02.ceh <= abe_02.cei) {
                ++n;
                continue;
            }
            --this.cdR;
            this.cdT.removeAt(n);
            this.cdP.vI(n2);
        }
    }

    @Override
    public void b(art_1 art_12) {
        this.cdI.b(art_12);
    }

    public void a(abg_1 abg_12) {
        this.cdV = abg_12;
    }

    protected abstract boolean bti();

    protected abstract boolean btj();

    protected abstract void a(abe_0 var1);

    protected abstract void a(abe_0 var1, float var2);

    public final void rB(int n) {
        float f2 = (float)n / 1000.0f;
        for (int i = 0; i < this.cdR; ++i) {
            int n2 = this.cdT.getQuick(i) - 1;
            if (!(this.cdU[n2].cei > f2)) continue;
            this.cdU[n2].cei = f2;
        }
    }
}

