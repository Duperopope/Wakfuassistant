/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLf
 */
public class flf_1
extends fky_1 {
    private boolean tEj = false;

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110, awg_1 awg_111, awg_1 awg_112, awg_1 awg_113, awg_1 awg_114, awg_1 awg_115, awg_1 awg_116, awg_1 awg_117, awg_1 awg_118) {
        this.uqt = new awg_1[17];
        this.uqt[0] = awg_12;
        this.uqt[1] = awg_13;
        this.uqt[2] = awg_14;
        this.uqt[3] = awg_15;
        this.uqt[4] = awg_16;
        this.uqt[5] = awg_17;
        this.uqt[6] = awg_18;
        this.uqt[7] = awg_19;
        this.uqt[8] = awg_110;
        this.uqt[9] = awg_111;
        this.uqt[10] = awg_112;
        this.uqt[11] = awg_113;
        this.uqt[12] = awg_114;
        this.uqt[13] = awg_115;
        this.uqt[14] = awg_116;
        this.uqt[15] = awg_117;
        this.uqt[16] = awg_118;
    }

    public void setPixmaps(awg_1 awg_12) {
        this.uqt = new awg_1[1];
        this.uqt[0] = awg_12;
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        this.uqt = new awg_1[17];
        this.uqt = awg_1Array;
    }

    public boolean isScaled() {
        return this.tEj;
    }

    public void setScaled(boolean bl) {
        this.tEj = bl;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.right + insets2.right + insets3.right;
        int n3 = insets.top + insets2.top + insets3.top;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        if (this.uqt.length == 1) {
            return;
        }
        this.bRE.clear();
        this.abW(this.uqt.length);
        for (int i = 0; i < this.uqt.length; ++i) {
            int n5 = this.ax(n, n2, i);
            int n6 = this.ay(n4, n3, i);
            int n7 = this.az(n, n2, i);
            int n8 = this.aA(n4, n3, i);
            this.b(n5, n6, n7, n8, this.uqt[i]);
        }
        this.gDj();
    }

    private int ax(int n, int n2, int n3) {
        if (n3 == 0 || n3 == 5 || n3 == 7 || n3 == 10 || n3 == 12) {
            return n;
        }
        if (n3 == 1 || n3 == 8 || n3 == 13) {
            return n + this.uqt[0].getWidth();
        }
        if (n3 == 2 || n3 == 14) {
            return n + this.uqt[0].getWidth() + this.uqt[1].getWidth();
        }
        if (n3 == 3 || n3 == 15) {
            return n2 - this.uqt[3].getWidth() - this.uqt[4].getWidth();
        }
        if (n3 == 4 || n3 == 6 || n3 == 9 || n3 == 11 || n3 == 16) {
            return n2 - this.uqt[4].getWidth();
        }
        assert (false) : "We should never end here";
        return n;
    }

    private int ay(int n, int n2, int n3) {
        if (n3 == 0 || n3 == 1 || n3 == 2 || n3 == 3 || n3 == 4) {
            return n2;
        }
        if (n3 == 5 || n3 == 6 || n3 == 8) {
            return n2 - this.uqt[0].getHeight();
        }
        if (n3 == 7 || n3 == 9) {
            return n2 - this.uqt[0].getHeight() - this.uqt[5].getHeight();
        }
        if (n3 == 10 || n3 == 11) {
            return n + this.uqt[10].getWidth() + this.uqt[12].getWidth();
        }
        if (n3 == 12 || n3 == 13 || n3 == 14 || n3 == 15 || n3 == 16) {
            return n + this.uqt[12].getWidth();
        }
        assert (false) : "We should never end here";
        return n2;
    }

    private int az(int n, int n2, int n3) {
        if (n3 == 2 || n3 == 14) {
            return n2 - n - (this.uqt[0].getWidth() + this.uqt[1].getWidth() + this.uqt[3].getWidth() + this.uqt[4].getWidth());
        }
        if (n3 == 8 && this.tEj) {
            return n2 - n - (this.uqt[7].getWidth() + this.uqt[9].getWidth());
        }
        return this.uqt[n3].getWidth();
    }

    private int aA(int n, int n2, int n3) {
        if (n3 == 7 || n3 == 9) {
            return n2 - n - (this.uqt[0].getHeight() + this.uqt[5].getHeight() + this.uqt[10].getHeight() + this.uqt[12].getHeight());
        }
        if (n3 == 8 && this.tEj) {
            return n2 - n - (this.uqt[2].getHeight() + this.uqt[14].getHeight());
        }
        return this.uqt[n3].getHeight();
    }
}

