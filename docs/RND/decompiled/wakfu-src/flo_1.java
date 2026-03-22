/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLo
 */
public class flo_1
extends flg_1 {
    boolean tMi = true;
    boolean kuf = true;

    public flo_1() {
        this.uqt = new awg_1[1];
    }

    public awg_1 gDv() {
        return this.uqt[0];
    }

    public void setPixmap(awg_1 awg_12) {
        this.uqt[0] = awg_12;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    public void setVertical(boolean bl) {
        this.kuf = bl;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        int n5 = dimension.width - n - n2;
        int n6 = dimension.height - n3 - n4;
        this.bRE.clear();
        if (this.uqt[0] != null) {
            int n7;
            int n8;
            int n9 = this.tMi ? this.uqt[0].getWidth() : n5;
            int n10 = this.kuf ? this.uqt[0].getHeight() : n6;
            float f2 = (float)n5 / (float)n9;
            float f3 = (float)n6 / (float)n10;
            int n11 = this.tMi ? n5 / n9 + (n5 % n9 > 0 ? 1 : 0) : (n8 = 1);
            int n12 = this.kuf ? n6 / n10 + (n6 % n10 > 0 ? 1 : 0) : 1;
            int n13 = n;
            int n14 = n7 = dimension.height - n3;
            this.abW(n12 * n8);
            for (int i = 0; i < n12; ++i) {
                int n15 = n13;
                float f4 = i == n12 - 1 ? f3 - (float)i : 1.0f;
                for (int j = 0; j < n8; ++j) {
                    float f5 = j == n8 - 1 ? f2 - (float)j : 1.0f;
                    this.a(n15, n14, (int)((float)n9 * f5), (int)((float)n10 * f4), f5, f4, this.uqt[0]);
                    n15 += n9;
                }
                n14 -= n10;
            }
            this.gDj();
        }
    }

    protected void a(int n, int n2, int n3, int n4, float f2, float f3, awg_1 awg_12) {
        if (n3 == 0 || n4 == 0 || awg_12 == null || awg_12.bHg() == null) {
            return;
        }
        float f4 = awg_12.aKs() - awg_12.aKq();
        float f5 = awg_12.aKr() - awg_12.aKp();
        float f6 = awg_12.aKq() + f4 * (awg_12.getRotation().bKt() ? f3 : f2);
        float f7 = awg_12.aKp() + f5 * (awg_12.getRotation().bKt() ? f2 : f3);
        this.a(n, n2, n3, n4, awg_12, awg_12.aKp(), awg_12.aKq(), f7, f6);
    }
}

