/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLh
 */
public class flh_1
extends fkz_1 {
    private final awg_1[] uIb = new awg_1[16];
    private boolean uqu;

    public void a(awg_1 awg_12, fzw_0 fzw_02) {
        switch (fzw_02) {
            case tKY: {
                this.uIb[0] = awg_12;
                break;
            }
            case tKZ: {
                this.uIb[1] = awg_12;
                break;
            }
            case tLa: {
                this.uIb[2] = awg_12;
                break;
            }
            case tLb: {
                this.uIb[3] = awg_12;
                break;
            }
            case tLc: {
                this.uIb[4] = awg_12;
                break;
            }
            case tLd: {
                this.uIb[5] = awg_12;
                break;
            }
            case tLe: {
                this.uIb[6] = awg_12;
                break;
            }
            case tLf: {
                this.uIb[7] = awg_12;
                break;
            }
            case tLh: {
                this.uIb[8] = awg_12;
                break;
            }
            case tLi: {
                this.uIb[9] = awg_12;
                break;
            }
            case tLj: {
                this.uIb[10] = awg_12;
                break;
            }
            case tLk: {
                this.uIb[11] = awg_12;
                break;
            }
            case tLl: {
                this.uIb[12] = awg_12;
                break;
            }
            case tLm: {
                this.uIb[13] = awg_12;
                break;
            }
            case tLn: {
                this.uIb[14] = awg_12;
                break;
            }
            case tLo: {
                this.uIb[15] = awg_12;
            }
        }
        this.gwA();
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110, awg_1 awg_111, awg_1 awg_112, awg_1 awg_113, awg_1 awg_114, awg_1 awg_115, awg_1 awg_116, awg_1 awg_117) {
        this.uIb[0] = awg_12;
        this.uIb[1] = awg_13;
        this.uIb[2] = awg_14;
        this.uIb[3] = awg_15;
        this.uIb[4] = awg_16;
        this.uIb[5] = awg_17;
        this.uIb[6] = awg_18;
        this.uIb[7] = awg_19;
        this.uIb[8] = awg_110;
        this.uIb[9] = awg_111;
        this.uIb[10] = awg_112;
        this.uIb[11] = awg_113;
        this.uIb[12] = awg_114;
        this.uIb[13] = awg_115;
        this.uIb[14] = awg_116;
        this.uIb[15] = awg_117;
        this.gwA();
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        this.uIb[0] = awg_1Array[0];
        this.uIb[1] = awg_1Array[1];
        this.uIb[2] = awg_1Array[2];
        this.uIb[3] = awg_1Array[3];
        this.uIb[4] = awg_1Array[4];
        this.uIb[5] = awg_1Array[5];
        this.uIb[6] = awg_1Array[6];
        this.uIb[7] = awg_1Array[7];
        this.uIb[8] = awg_1Array[8];
        this.uIb[9] = awg_1Array[9];
        this.uIb[10] = awg_1Array[10];
        this.uIb[11] = awg_1Array[11];
        this.uIb[12] = awg_1Array[12];
        this.uIb[13] = awg_1Array[13];
        this.uIb[14] = awg_1Array[14];
        this.uIb[15] = awg_1Array[15];
        this.gwA();
    }

    public final boolean gDo() {
        return this.uqu;
    }

    public void a(Insets insets) {
        if (insets != null) {
            insets.top = Math.max(this.uIb[0].getHeight(), Math.max(this.uIb[2].getHeight(), Math.max(this.uIb[4].getHeight(), Math.max(this.uIb[1].getHeight(), this.uIb[3].getHeight()))));
            insets.bottom = Math.max(this.uIb[11].getHeight(), Math.max(this.uIb[13].getHeight(), Math.max(this.uIb[15].getHeight(), Math.max(this.uIb[12].getHeight(), this.uIb[14].getHeight()))));
            insets.left = Math.max(this.uIb[0].getWidth(), Math.max(this.uIb[7].getWidth(), Math.max(this.uIb[11].getWidth(), Math.max(this.uIb[5].getWidth(), this.uIb[9].getWidth()))));
            insets.right = Math.max(this.uIb[4].getWidth(), Math.max(this.uIb[8].getWidth(), Math.max(this.uIb[15].getWidth(), Math.max(this.uIb[6].getWidth(), this.uIb[10].getWidth()))));
        }
    }

    @Override
    public final void aVH() {
        this.bRE.bsI();
        this.bRE = null;
    }

    @Override
    public final void aVI() {
        this.gwA();
        assert (this.bRE == null);
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        if (!this.uqu) {
            return;
        }
        this.bRE.clear();
        this.abX(this.uIb.length);
        for (int i = 0; i < this.uIb.length; ++i) {
            int n = this.a(dimension, insets, insets2, i);
            int n2 = this.b(dimension, insets, insets2, i);
            int n3 = this.c(dimension, insets, insets2, i);
            int n4 = this.d(dimension, insets, insets2, i);
            this.c(n, n2, n3, n4, this.uIb[i]);
        }
        this.gDk();
    }

    private int a(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 5 || n == 7 || n == 9 || n == 11) {
            return insets.left;
        }
        if (n == 1 || n == 12) {
            return insets.left + insets2.left;
        }
        if (n == 2 || n == 13) {
            return insets.left + insets2.left + this.uIb[n - 1].getWidth();
        }
        if (n == 3 || n == 14) {
            return dimension.width - insets.left - insets.right - insets2.right - this.uIb[n].getWidth();
        }
        if (n == 4 || n == 6 || n == 8 || n == 10 || n == 15) {
            return dimension.width - insets.left - insets.right - insets2.right;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int b(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3 || n == 4) {
            return dimension.height - insets.top;
        }
        if (n == 5 || n == 6) {
            return dimension.height - (insets.top + insets2.top);
        }
        if (n == 7 || n == 8) {
            return dimension.height - (insets.top + insets2.top + this.uIb[n - 2].getHeight());
        }
        if (n == 9 || n == 10) {
            return insets.bottom + insets2.bottom + this.uIb[n].getHeight();
        }
        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15) {
            return insets.bottom + insets2.bottom;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int c(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 5 || n == 7 || n == 9 || n == 11) {
            return insets2.left;
        }
        if (n == 1 || n == 12) {
            return this.uIb[n].getWidth();
        }
        if (n == 2) {
            return dimension.width - insets.left - insets.right - insets2.left - insets2.right - this.uIb[1].getWidth() - this.uIb[3].getWidth();
        }
        if (n == 13) {
            return dimension.width - insets.left - insets.right - insets2.left - insets2.right - this.uIb[12].getWidth() - this.uIb[14].getWidth();
        }
        if (n == 3 || n == 14) {
            return this.uIb[n].getWidth();
        }
        if (n == 4 || n == 6 || n == 8 || n == 10 || n == 15) {
            return insets2.right;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private int d(Dimension dimension, Insets insets, Insets insets2, int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3 || n == 4) {
            return insets2.top;
        }
        if (n == 5 || n == 6) {
            return this.uIb[n].getHeight();
        }
        if (n == 7) {
            return dimension.height - insets.top - insets.bottom - insets2.top - insets2.bottom - this.uIb[5].getHeight() - this.uIb[9].getHeight();
        }
        if (n == 8) {
            return dimension.height - insets.top - insets.bottom - insets2.top - insets2.bottom - this.uIb[6].getHeight() - this.uIb[10].getHeight();
        }
        if (n == 9 || n == 10) {
            return this.uIb[n].getHeight();
        }
        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15) {
            return insets2.bottom;
        }
        assert (false) : "We should never end here";
        return 0;
    }

    private void gwA() {
        for (int i = this.uIb.length - 1; i >= 0; --i) {
            if (this.uIb[i] != null) continue;
            this.uqu = false;
            return;
        }
        this.uqu = true;
    }
}

