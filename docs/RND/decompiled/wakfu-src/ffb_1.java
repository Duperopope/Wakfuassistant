/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;

/*
 * Renamed from fFB
 */
public final class ffb_1
extends ffz_1 {
    private final awg_1[] uqt = new awg_1[9];
    private boolean uqu = false;
    private Entity3D bRE;
    private ffa_1 uqv;
    private ash_2 uqw;

    @Override
    protected void gwq() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.chO == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.chO.aIU();
            f3 = this.chO.aIV();
            f4 = this.chO.aIW();
            f5 = this.chO.aIX();
        }
        if (this.ncL != null) {
            f2 *= this.ncL.aIU();
            f3 *= this.ncL.aIV();
            f4 *= this.ncL.aIW();
            f5 *= this.ncL.aIX();
        }
        this.bRE.c(f2, f3, f4, f5);
    }

    public awg_1 gwr() {
        return this.uqt[5];
    }

    public void f(awg_1 awg_12) {
        this.uqt[5] = awg_12;
        this.gwA();
    }

    public awg_1 gws() {
        return this.uqt[1];
    }

    public void g(awg_1 awg_12) {
        this.uqt[1] = awg_12;
        this.gwA();
    }

    public awg_1 gwt() {
        return this.uqt[2];
    }

    public void h(awg_1 awg_12) {
        this.uqt[2] = awg_12;
        this.gwA();
    }

    public awg_1 gwu() {
        return this.uqt[0];
    }

    public void i(awg_1 awg_12) {
        this.uqt[0] = awg_12;
        this.gwA();
    }

    public awg_1 gwv() {
        return this.uqt[7];
    }

    public void j(awg_1 awg_12) {
        this.uqt[7] = awg_12;
        this.gwA();
    }

    public awg_1 gww() {
        return this.uqt[8];
    }

    public void k(awg_1 awg_12) {
        this.uqt[8] = awg_12;
        this.gwA();
    }

    public awg_1 gwx() {
        return this.uqt[6];
    }

    public void l(awg_1 awg_12) {
        this.uqt[6] = awg_12;
        this.gwA();
    }

    public awg_1 gwy() {
        return this.uqt[3];
    }

    public void m(awg_1 awg_12) {
        this.uqt[3] = awg_12;
        this.gwA();
    }

    public awg_1 gwz() {
        return this.uqt[4];
    }

    public void n(awg_1 awg_12) {
        this.uqt[4] = awg_12;
        this.gwA();
    }

    @Override
    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110) {
        this.uqt[0] = awg_12;
        this.uqt[1] = awg_13;
        this.uqt[2] = awg_14;
        this.uqt[3] = awg_15;
        this.uqt[4] = awg_16;
        this.uqt[5] = awg_17;
        this.uqt[6] = awg_18;
        this.uqt[7] = awg_19;
        this.uqt[8] = awg_110;
        this.gwA();
    }

    public void setPixmaps(awg_1 awg_12) {
        this.uqt[5] = awg_12;
        this.gwA();
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        this.uqt[0] = awg_1Array[0];
        this.uqt[1] = awg_1Array[1];
        this.uqt[2] = awg_1Array[2];
        this.uqt[3] = awg_1Array[3];
        this.uqt[4] = awg_1Array[4];
        this.uqt[5] = awg_1Array[5];
        this.uqt[6] = awg_1Array[6];
        this.uqt[7] = awg_1Array[7];
        this.uqt[8] = awg_1Array[8];
        this.gwA();
    }

    private void gwA() {
        if (this.uqt[4] == null) {
            this.uqu = false;
            return;
        }
        int n = 0;
        for (int i = this.uqt.length - 1; i >= 0; --i) {
            if (this.uqt[i] == null) continue;
            ++n;
        }
        if (n != 1 && n != 9) {
            this.uqu = false;
            return;
        }
        this.uqu = true;
        this.uqv.setPixmap(this.uqt[4]);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        if (!this.uqu) {
            return;
        }
        this.bRE.clear();
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        nArray[0] = this.uqt[0].getWidth();
        nArray[2] = this.uqt[2].getWidth();
        nArray[1] = Math.max(0, n3 - (nArray[0] + nArray[2]));
        nArray2[0] = this.uqt[0].getHeight();
        nArray2[2] = this.uqt[6].getHeight();
        nArray2[1] = Math.max(0, n4 - (nArray2[0] + nArray2[2]));
        this.aaX(9);
        int n5 = n4 + n2;
        for (int i = 0; i < 3; ++i) {
            int n6 = n;
            for (int j = 0; j < 3; ++j) {
                this.a(n6, n5, nArray[j], nArray2[i], this.uqt[i * 3 + j]);
                n6 += nArray[j];
            }
            n5 -= nArray2[i];
        }
        this.bJr();
        this.fP(f2);
    }

    private void fP(float f2) {
        float f3 = (float)Math.PI * 2 * f2;
        float f4 = (float)Math.PI * 2;
        this.uqv.fN(f3);
        this.uqv.fO((float)Math.PI * 2);
    }

    @Override
    public final Entity getEntity() {
        return this.bRE;
    }

    @Override
    public final void aVI() {
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        try {
            this.uqv = new ffa_1();
            this.bRE.a(this.uqv.bJY(), this.uqv.bJZ(), this.uqv.bJT());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public final void aVH() {
        super.aVH();
        this.bRE.bsI();
        this.bRE = null;
        this.chO = null;
        if (this.uqw != null) {
            this.uqw.bJq();
            this.uqw = null;
        }
    }

    private void a(int n, int n2, int n3, int n4, awg_1 awg_12) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.uqw.a(n, n2, n3, n4, awg_12, null);
    }

    private void aaX(int n) {
        if (this.uqw == null) {
            this.uqw = new ash_2();
        }
        this.uqw.a(this.bRE, n);
    }

    private void bJr() {
        this.uqw.bJr();
    }
}

