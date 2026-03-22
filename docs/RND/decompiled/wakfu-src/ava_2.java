/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from ava
 */
public final class ava_2 {
    private static final ava_2 dgb = new ava_2();
    private final int[] dgc;
    private final short[] dgd;
    private final float[] dge;
    private final boolean[] dgf;
    private final int[] dgg;
    private final short[] dgh;
    private final float[] dgi;
    private final boolean[] dgj;
    private ati_2 cWI;
    private final axv_1 dgk = new axv_1(0, 0, 0, 0);
    private final Matrix44[] dgl = new Matrix44[auy_2.values().length];
    private boolean dgm;
    private final float[] dgn = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    private final float[] dgo = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN};

    private ava_2() {
        avb_2[] avb_2Array = avb_2.values();
        int n = avb_2Array.length;
        this.dgg = new int[n];
        this.dgi = new float[n];
        this.dgh = new short[n];
        this.dgj = new boolean[n];
        this.dgc = new int[n];
        this.dge = new float[n];
        this.dgd = new short[n];
        this.dgf = new boolean[n];
        for (avb_2 avb_22 : avb_2Array) {
            this.dgg[avb_22.ordinal()] = 0;
            this.dgi[avb_22.ordinal()] = 0.0f;
            this.dgh[avb_22.ordinal()] = 0;
            this.dgj[avb_22.ordinal()] = false;
        }
        for (int i = 0; i < this.dgl.length; ++i) {
            this.dgl[i] = (Matrix44)Matrix44.dAb.bSJ();
        }
        this.dgm = false;
    }

    public static ava_2 bMH() {
        return dgb;
    }

    public void bMI() {
        this.cY(true);
        this.a(auw_2.dfI, auw_2.dfH);
        this.cY(1.0f);
        this.cZ(false);
        this.cZ(1.0f);
        this.da(false);
        this.cN(1.0f);
        this.uI(1);
        this.aD((short)0);
        this.dc(false);
        this.p(0, 0, 0, 0);
        this.db(true);
        this.a(avf_2.dha);
        this.de(false);
    }

    private void i(int n, boolean bl) {
        this.P(n, bl ? 1 : 0);
    }

    private void P(int n, int n2) {
        if (this.dgg[n] == n2) {
            return;
        }
        if (this.dgm) {
            this.dgf[n] = n2 == this.dgc[n];
        }
        this.dgg[n] = n2;
        this.dgj[n] = false;
    }

    private void b(int n, short s) {
        if (this.dgh[n] == s) {
            return;
        }
        if (this.dgm) {
            this.dgf[n] = s == this.dgd[n];
        }
        this.dgh[n] = s;
        this.dgj[n] = false;
    }

    private void a(int n, float f2) {
        if (this.dgi[n] == f2) {
            return;
        }
        if (this.dgm) {
            this.dgf[n] = f2 == this.dge[n];
        }
        this.dgi[n] = f2;
        this.dgj[n] = false;
    }

    public void cY(boolean bl) {
        this.i(avb_2.dgp.ordinal(), bl);
    }

    public void a(auw_2 auw_22, auw_2 auw_23) {
        this.P(avb_2.dgq.ordinal(), auw_22.dfS);
        this.P(avb_2.dgr.ordinal(), auw_23.dfS);
    }

    public void cZ(boolean bl) {
        this.i(avb_2.dgt.ordinal(), bl);
    }

    public void da(boolean bl) {
        this.i(avb_2.dgw.ordinal(), bl);
    }

    public void a(avf_2 avf_22) {
        this.P(avb_2.dgG.ordinal(), avf_22.dhe);
    }

    public void db(boolean bl) {
        this.a(bl, null);
    }

    private void a(boolean bl, ati_2 ati_22) {
        this.P(avb_2.dgH.ordinal(), bl ? 1 : 0);
        this.cWI = ati_22;
    }

    public void dc(boolean bl) {
        this.i(avb_2.dgB.ordinal(), bl);
    }

    public void dd(boolean bl) {
        this.i(avb_2.dgx.ordinal(), bl);
    }

    public void de(boolean bl) {
        this.i(avb_2.dgI.ordinal(), bl);
    }

    public void df(boolean bl) {
        this.i(avb_2.dgJ.ordinal(), bl);
    }

    public void p(int n, int n2, int n3, int n4) {
        this.P(avb_2.dgC.ordinal(), n);
        this.P(avb_2.dgD.ordinal(), n2);
        this.P(avb_2.dgE.ordinal(), n3);
        this.P(avb_2.dgF.ordinal(), n4);
    }

    public void cY(float f2) {
        this.a(avb_2.dgs.ordinal(), f2);
    }

    public void cZ(float f2) {
        this.a(avb_2.dgu.ordinal(), f2);
    }

    public void cN(float f2) {
        this.a(avb_2.dgv.ordinal(), f2);
    }

    public void uI(int n) {
        this.P(avb_2.dgy.ordinal(), n);
    }

    public void aD(short s) {
        this.b(avb_2.dgz.ordinal(), s);
    }

    public void h(GL2 gL2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12 = avb_2.dgH.ordinal();
        if (!this.dgj[n12]) {
            this.dgj[n12] = true;
            if (this.dgg[n12] == 1) {
                gL2.glEnable(3553);
            } else {
                gL2.glDisable(3553);
            }
        }
        if (!this.dgj[n11 = avb_2.dgG.ordinal()]) {
            this.dgj[n11] = true;
            gL2.glTexEnvi(8960, 8704, this.dgg[n11]);
        }
        if (!this.dgj[n10 = avb_2.dgp.ordinal()]) {
            this.dgj[n10] = true;
            if (this.dgg[n10] == 1) {
                gL2.glEnable(3042);
            } else {
                gL2.glDisable(3042);
            }
        }
        int n13 = avb_2.dgq.ordinal();
        int n14 = avb_2.dgr.ordinal();
        if (!this.dgj[n13] || !this.dgj[n14]) {
            this.dgj[n13] = true;
            this.dgj[n14] = true;
            gL2.glBlendFunc(this.dgg[n13], this.dgg[n14]);
        }
        if (!this.dgj[n9 = avb_2.dgt.ordinal()]) {
            this.dgj[n9] = true;
            if (this.dgg[n9] == 1) {
                gL2.glEnable(2832);
            } else {
                gL2.glDisable(2832);
            }
        }
        if (!this.dgj[n8 = avb_2.dgw.ordinal()]) {
            this.dgj[n8] = true;
            if (this.dgg[n8] == 1) {
                gL2.glEnable(2848);
            } else {
                gL2.glDisable(2848);
            }
        }
        if (!this.dgj[n7 = avb_2.dgs.ordinal()]) {
            this.dgj[n7] = true;
            this.a((GL)gL2, 0);
            gL2.glTexEnvf(8960, 8704, 34160.0f);
            gL2.glTexEnvf(8960, 34161, 8448.0f);
            gL2.glTexEnvf(8960, 34176, 5890.0f);
            gL2.glTexEnvf(8960, 34163, this.dgi[n7]);
        }
        if (!this.dgj[n6 = avb_2.dgu.ordinal()]) {
            this.dgj[n6] = true;
            gL2.glPointSize(this.dgi[n6]);
        }
        if (!this.dgj[n5 = avb_2.dgv.ordinal()]) {
            this.dgj[n5] = true;
            gL2.glLineWidth(this.dgi[n5]);
        }
        if (!this.dgj[n4 = avb_2.dgx.ordinal()]) {
            this.dgj[n4] = true;
            if (this.dgg[n4] == 1) {
                gL2.glEnable(2852);
            } else {
                gL2.glDisable(2852);
            }
        }
        int n15 = avb_2.dgy.ordinal();
        int n16 = avb_2.dgz.ordinal();
        if (!this.dgj[n15] || !this.dgj[n16]) {
            this.dgj[n15] = true;
            this.dgj[n16] = true;
            gL2.glLineStipple(this.dgg[n15], this.dgh[n16]);
        }
        if (!this.dgj[n3 = avb_2.dgB.ordinal()]) {
            this.dgj[n3] = true;
            if (this.dgg[n3] == 1) {
                gL2.glEnable(3089);
            } else {
                gL2.glDisable(3089);
            }
        }
        int n17 = avb_2.dgC.ordinal();
        int n18 = avb_2.dgD.ordinal();
        int n19 = avb_2.dgE.ordinal();
        int n20 = avb_2.dgF.ordinal();
        if (!(this.dgj[n17] && this.dgj[n18] && this.dgj[n19] && this.dgj[n20])) {
            this.dgj[n17] = true;
            this.dgj[n18] = true;
            this.dgj[n19] = true;
            this.dgj[n20] = true;
            gL2.glScissor(this.dgg[n17], this.dgg[n18], this.dgg[n19], this.dgg[n20]);
        }
        if (!this.dgj[n2 = avb_2.dgI.ordinal()]) {
            this.dgj[n2] = true;
            if (this.dgg[n2] == 1) {
                gL2.glEnable(2929);
            } else {
                gL2.glDisable(2929);
            }
        }
        if (!this.dgj[n = avb_2.dgJ.ordinal()]) {
            this.dgj[n] = true;
            gL2.glDepthMask(this.dgg[n] == 1);
        }
    }

    public void a(GL gL, int n) {
        int n2 = avb_2.dgK.ordinal();
        if (this.dgg[n2] == n) {
            return;
        }
        this.dgg[n2] = n;
        gL.glActiveTexture(33984 + n);
    }

    public void a(GL2 gL2, int n) {
        int n2 = avb_2.dgL.ordinal();
        if (this.dgg[n2] == n) {
            return;
        }
        this.dgg[n2] = n;
        gL2.glClientActiveTexture(33984 + n);
    }

    public void a(GL2 gL2, auy_2 auy_22) {
        int n = avb_2.dgA.ordinal();
        int n2 = auy_22.dfZ;
        this.dgl[auy_22.ordinal()].B(0.0f, 0.0f, 0.0f);
        if (this.dgg[n] == n2) {
            return;
        }
        this.dgg[n] = n2;
        gL2.glMatrixMode(n2);
    }

    public void a(GL2 gL2, auy_2 auy_22, Matrix44 matrix44) {
        Matrix44 matrix442;
        int n;
        int n2 = avb_2.dgA.ordinal();
        if (this.dgg[n2] != (n = auy_22.dfZ)) {
            this.dgg[n2] = n;
            gL2.glMatrixMode(n);
        }
        if (!(matrix442 = this.dgl[auy_22.ordinal()]).f(matrix44)) {
            matrix442.c(matrix44);
            if (matrix44.bWq()) {
                gL2.glLoadIdentity();
            } else {
                gL2.glLoadMatrixf(matrix44.bQE(), 0);
            }
        }
    }

    public void a(GL gL, ati_2 ati_22) {
        if (this.cWI == ati_22) {
            return;
        }
        if (ati_22 == null) {
            this.a(false, ati_22);
        } else {
            this.a(true, ati_22);
            this.a(ati_22.bPg());
            this.cWI.f(gL);
        }
    }

    public void bMJ() {
        this.dgm = true;
        System.arraycopy(this.dgg, 0, this.dgc, 0, this.dgg.length);
        System.arraycopy(this.dgi, 0, this.dge, 0, this.dgi.length);
        System.arraycopy(this.dgh, 0, this.dgd, 0, this.dgh.length);
        System.arraycopy(this.dgj, 0, this.dgf, 0, this.dgj.length);
    }

    public void bMK() {
        if (this.dgm) {
            System.arraycopy(this.dgc, 0, this.dgg, 0, this.dgg.length);
            System.arraycopy(this.dge, 0, this.dgi, 0, this.dgi.length);
            System.arraycopy(this.dgd, 0, this.dgh, 0, this.dgh.length);
            System.arraycopy(this.dgf, 0, this.dgj, 0, this.dgj.length);
            this.dgm = false;
        }
    }

    public void reset() {
        this.a(false, null);
    }

    public axv_1 bML() {
        return this.dgk.bRH();
    }

    public void bMM() {
        this.dgk.w(0, 0, 0, 0);
    }

    public void a(GL gL, int n, int n2, int n3, int n4) {
        if (this.dgk.x(n, n2, n3, n4)) {
            return;
        }
        gL.glViewport(n, n2, n3, n4);
        this.dgk.w(n, n2, n3, n4);
    }

    public void a(GL2 gL2, axv_1 axv_12) {
        this.a((GL)gL2, axv_12.bRB(), axv_12.bRC(), axv_12.bRD(), axv_12.bRE());
        this.a(gL2, auy_2.dfW);
        gL2.glLoadIdentity();
        float f2 = axv_12.bRF();
        float f3 = axv_12.bRG();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < 1.0f) {
            f3 = 1.0f;
        }
        gL2.glOrtho((double)(-f2), (double)f2, (double)(-f3), (double)f3, 0.0, 65535.0);
    }

    public void a(GL2 gL2, Material material) {
        if (!material.L(this.dgn)) {
            material.M(this.dgn);
            gL2.glMaterialfv(1032, 4609, this.dgn, 0);
        }
        if (!material.Q(this.dgo)) {
            material.R(this.dgo);
            gL2.glMaterialfv(1032, 4610, this.dgo, 0);
        }
    }
}

