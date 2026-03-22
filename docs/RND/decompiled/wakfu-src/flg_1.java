/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLg
 */
public class flg_1
extends fky_1 {
    private boolean tEj = false;
    private boolean uIa = false;

    public flg_1() {
        this.uqt = new awg_1[9];
    }

    public boolean isScaled() {
        return this.tEj;
    }

    public void setScaled(boolean bl) {
        this.tEj = bl;
    }

    public boolean isRepeated() {
        return this.uIa;
    }

    public void setRepeated(boolean bl) {
        this.uIa = bl;
    }

    public awg_1 gwr() {
        return this.uqt[5];
    }

    public void f(awg_1 awg_12) {
        this.uqt[5] = awg_12;
    }

    public awg_1 gws() {
        return this.uqt[1];
    }

    public void g(awg_1 awg_12) {
        this.uqt[1] = awg_12;
    }

    public awg_1 gwt() {
        return this.uqt[2];
    }

    public void h(awg_1 awg_12) {
        this.uqt[2] = awg_12;
    }

    public awg_1 gwu() {
        return this.uqt[0];
    }

    public void i(awg_1 awg_12) {
        this.uqt[0] = awg_12;
    }

    public awg_1 gwv() {
        return this.uqt[7];
    }

    public void j(awg_1 awg_12) {
        this.uqt[7] = awg_12;
    }

    public awg_1 gww() {
        return this.uqt[8];
    }

    public void k(awg_1 awg_12) {
        this.uqt[8] = awg_12;
    }

    public awg_1 gwx() {
        return this.uqt[6];
    }

    public void l(awg_1 awg_12) {
        this.uqt[6] = awg_12;
    }

    public awg_1 gwy() {
        return this.uqt[3];
    }

    public void m(awg_1 awg_12) {
        this.uqt[3] = awg_12;
    }

    public awg_1 gwz() {
        return this.uqt[4];
    }

    public void n(awg_1 awg_12) {
        this.uqt[4] = awg_12;
    }

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
    }

    public void setPixmaps(awg_1 awg_12) {
        this.uqt[4] = awg_12;
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
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        this.bRE.clear();
        if (this.uqt[0] == null) {
            this.a(dimension, n, n2, n3, n4);
            return;
        }
        if (this.uIa) {
            this.b(dimension, insets);
        } else {
            this.a(dimension, insets);
        }
    }

    private void a(Dimension dimension, Insets insets) {
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        int n = insets.left;
        int n2 = dimension.height - insets.top;
        nArray[0] = this.uqt[0].getWidth();
        nArray[2] = this.uqt[2].getWidth();
        nArray[1] = dimension.width - (nArray[0] + nArray[2] + insets.left + insets.right);
        nArray2[0] = this.uqt[0].getHeight();
        nArray2[2] = this.uqt[6].getHeight();
        nArray2[1] = dimension.height - (nArray2[0] + nArray2[2] + insets.top + insets.bottom);
        nArray3[0] = n;
        nArray3[1] = nArray3[0] + nArray[0];
        nArray3[2] = nArray3[1] + nArray[1];
        nArray4[0] = n2;
        nArray4[1] = nArray4[0] - nArray2[0];
        nArray4[2] = nArray4[1] - nArray2[1];
        this.abW(9);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == 1 && j == 1 && !this.tEj) {
                    awg_1 awg_12 = this.uqt[i * 3 + j];
                    int n3 = n + (dimension.width - (insets.left + insets.right) - awg_12.getWidth()) / 2;
                    int n4 = n2 - (dimension.height - (insets.top + insets.bottom) + awg_12.getHeight()) / 2;
                    this.b(n3, n4, awg_12.getWidth(), awg_12.getHeight(), awg_12);
                    continue;
                }
                this.b(nArray3[j], nArray4[i], nArray[j], nArray2[i], this.uqt[i * 3 + j]);
            }
        }
        this.gDj();
    }

    private void a(Dimension dimension, int n, int n2, int n3, int n4) {
        if (this.tEj) {
            int n5 = dimension.width - n2 - n;
            int n6 = dimension.height - n3 - n4;
            this.abW(1);
            this.b(n, dimension.height - n3, n5, n6, this.uqt[4]);
            this.gDj();
        } else if (this.uqt[4] != null) {
            int n7 = this.uqt[4].getWidth();
            int n8 = this.uqt[4].getHeight();
            int n9 = (dimension.width - n2 - n - n7) / 2;
            int n10 = (dimension.height - n3 - n4 - n8) / 2;
            this.abW(1);
            this.b(n + n9, dimension.height - n3 - n10, n7, n8, this.uqt[4]);
            this.gDj();
        }
    }

    private void b(Dimension dimension, Insets insets) {
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        nArray[0] = this.uqt[0].getWidth();
        nArray[2] = this.uqt[2].getWidth();
        nArray[1] = Math.max(dimension.width - (nArray[0] + nArray[2] + insets.left + insets.right), -nArray[0]);
        nArray2[0] = this.uqt[0].getHeight();
        nArray2[2] = this.uqt[6].getHeight();
        nArray2[1] = Math.max(dimension.height - (nArray2[0] + nArray2[2] + insets.top + insets.bottom), -nArray2[0]);
        if (!this.tEj) {
            if (this.uqt[1].getWidth() > 0) {
                nArray[1] = nArray[1] - nArray[1] % this.uqt[1].getWidth();
            }
            if (this.uqt[3].getHeight() > 0) {
                nArray2[1] = nArray2[1] - nArray2[1] % this.uqt[3].getHeight();
            }
        }
        nArray3[0] = insets.left;
        nArray3[1] = nArray3[0] + nArray[0];
        nArray3[2] = nArray3[1] + nArray[1];
        nArray4[0] = dimension.height - insets.top;
        nArray4[1] = nArray4[0] - nArray2[0];
        nArray4[2] = nArray4[1] - nArray2[1];
        int n = nArray2[1] > 0 && this.uqt[5].getHeight() > 0 ? nArray2[1] / this.uqt[5].getHeight() : 0;
        int n2 = nArray2[1] > 0 && this.uqt[3].getHeight() > 0 ? nArray2[1] / this.uqt[3].getHeight() : 0;
        int n3 = nArray[1] > 0 && this.uqt[1].getWidth() > 0 ? nArray[1] / this.uqt[1].getWidth() : 0;
        int n4 = nArray[1] > 0 && this.uqt[7].getWidth() > 0 ? nArray[1] / this.uqt[7].getWidth() : 0;
        int n5 = 5 + n + n2 + n3 + n4;
        this.abW(n5);
        this.b(nArray3[0], nArray4[0], nArray[0], nArray2[0], this.uqt[0]);
        this.b(n3, nArray3[1], nArray4[0], this.uqt[1].getWidth(), nArray2[0], this.uqt[1]);
        this.b(nArray3[2], nArray4[0], nArray[2], nArray2[0], this.uqt[2]);
        this.a(n2, nArray3[0], nArray4[1], nArray[0], this.uqt[3].getHeight(), this.uqt[3]);
        this.b(nArray3[1], nArray4[1], nArray[1], nArray2[1], this.uqt[4]);
        this.a(n, nArray3[2], nArray4[1], nArray[2], this.uqt[5].getHeight(), this.uqt[5]);
        this.b(nArray3[0], nArray4[2], nArray[0], nArray2[2], this.uqt[6]);
        this.b(n4, nArray3[1], nArray4[2], this.uqt[7].getWidth(), nArray2[2], this.uqt[7]);
        this.b(nArray3[2], nArray4[2], nArray[2], nArray2[2], this.uqt[8]);
        this.gDj();
    }

    private void a(int n, int n2, int n3, int n4, int n5, awg_1 awg_12) {
        int n6 = n3;
        for (int i = 0; i < n; ++i) {
            this.b(n2, n6, n4, n5, awg_12);
            n6 -= n5;
        }
    }

    private void b(int n, int n2, int n3, int n4, int n5, awg_1 awg_12) {
        int n6 = n2;
        for (int i = 0; i < n; ++i) {
            this.b(n6, n3, n4, n5, awg_12);
            n6 += n4;
        }
    }
}

