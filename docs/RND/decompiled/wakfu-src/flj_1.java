/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLj
 */
public class flj_1
extends fkz_1 {
    public flj_1() {
        this.uqt = new awg_1[8];
    }

    @Override
    public void setInsets(Insets insets) {
    }

    public awg_1 gwr() {
        return this.uqt[4];
    }

    public void f(awg_1 awg_12) {
        this.uqt[4] = awg_12;
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
        return this.uqt[6];
    }

    public void j(awg_1 awg_12) {
        this.uqt[6] = awg_12;
        this.gwA();
    }

    public awg_1 gww() {
        return this.uqt[7];
    }

    public void k(awg_1 awg_12) {
        this.uqt[7] = awg_12;
        this.gwA();
    }

    public awg_1 gwx() {
        return this.uqt[5];
    }

    public void l(awg_1 awg_12) {
        this.uqt[5] = awg_12;
        this.gwA();
    }

    public awg_1 gwy() {
        return this.uqt[3];
    }

    public void m(awg_1 awg_12) {
        this.uqt[3] = awg_12;
        this.gwA();
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19) {
        this.uqt[0] = awg_12;
        this.uqt[1] = awg_13;
        this.uqt[2] = awg_14;
        this.uqt[3] = awg_15;
        this.uqt[4] = awg_16;
        this.uqt[5] = awg_17;
        this.uqt[6] = awg_18;
        this.uqt[7] = awg_19;
        this.gwA();
    }

    public boolean gwN() {
        return this.uqu;
    }

    public void a(Insets insets) {
        if (insets != null) {
            insets.top = Math.max(this.uqt[0].getHeight(), Math.max(this.uqt[1].getHeight(), this.uqt[2].getHeight()));
            insets.bottom = Math.max(this.uqt[5].getHeight(), Math.max(this.uqt[6].getHeight(), this.uqt[7].getHeight()));
            insets.left = Math.max(this.uqt[0].getWidth(), Math.max(this.uqt[3].getWidth(), this.uqt[5].getWidth()));
            insets.right = Math.max(this.uqt[2].getWidth(), Math.max(this.uqt[4].getWidth(), this.uqt[7].getWidth()));
        }
    }

    private void gwA() {
        for (int i = this.uqt.length - 1; i >= 0; --i) {
            if (this.uqt[i] != null) continue;
            this.uqu = false;
            return;
        }
        this.uqu = true;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        this.bRE.clear();
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int n5 = insets.left;
        int n6 = dimension.height - insets.top;
        nArray[0] = insets2.left;
        nArray[1] = dimension.width - n - n2;
        nArray[2] = insets2.right;
        nArray2[0] = insets2.top;
        nArray2[1] = dimension.height - n3 - n4;
        nArray2[2] = insets2.bottom;
        int n7 = n6;
        int n8 = 0;
        this.abX(9);
        for (int i = 0; i < 3; ++i) {
            int n9 = n5;
            for (int j = 0; j < 3; ++j) {
                if (j != 1 || i != 1) {
                    this.c(n9, n7, nArray[j], nArray2[i], this.uqt[n8]);
                    ++n8;
                }
                n9 += nArray[j];
            }
            n7 -= nArray2[i];
        }
        this.gDk();
    }
}

