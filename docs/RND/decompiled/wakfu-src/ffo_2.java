/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import java.util.ArrayList;

/*
 * Renamed from fFo
 */
public class ffo_2 {
    private final ArrayList<ffl_2> upB = new ArrayList();
    private final ffp_2 upC;
    private int bro;
    private int brp = Integer.MAX_VALUE;
    private int brq;
    private int brr;
    private int upD;
    private int upE;
    private float bRL;
    private awg_1 tEC;

    public ffo_2(ffp_2 ffp_22) {
        this.bro = Integer.MAX_VALUE;
        this.brr = Integer.MIN_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.upC = ffp_22;
    }

    public ffp_2 dXN() {
        return this.upC;
    }

    public void a(ffl_2 ffl_22) {
        this.upB.add(ffl_22);
    }

    public void b(ffl_2 ffl_22) {
        this.upB.remove(ffl_22);
    }

    public ArrayList<ffl_2> getChildren() {
        return this.upB;
    }

    public void cz(float f2) {
        this.bRL = f2;
    }

    public ffm_2 gM(int n, int n2) {
        for (int i = this.upB.size() - 1; i >= 0; --i) {
            ffm_2 ffm_22;
            ffl_2 ffl_22 = this.upB.get(i);
            if (!ffl_22.isVisible() || (ffm_22 = ffl_22.gM(n, n2)) == null) continue;
            return ffm_22;
        }
        return null;
    }

    public void gvK() {
        for (int i = this.upB.size() - 1; i >= 0; --i) {
            ffl_2 ffl_22 = this.upB.get(i);
            if (!ffl_22.isVisible()) continue;
            this.bro = Math.min(this.bro, ffl_22.bgm());
            this.brp = Math.min(this.brp, ffl_22.bgn());
            this.brq = Math.max(this.brq, ffl_22.bgo());
            this.brr = Math.max(this.brr, ffl_22.bgp());
        }
    }

    public void qy(int n) {
        int n2 = this.upB.size();
        for (int i = 0; i < n2; ++i) {
            ffl_2 ffl_22 = this.upB.get(i);
            ffl_22.aaR(n);
        }
    }

    public float[] gwh() {
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        int n = (int)((float)this.upC.dZr() * 10.0f);
        int n2 = this.upB.size();
        for (int i = 0; i < n2; ++i) {
            ffl_2 ffl_22 = this.upB.get(i);
            if (!ffl_22.isVisible()) continue;
            for (int j = ffl_22.bgm() - 1; j < ffl_22.bgo() + 1; ++j) {
                for (int i2 = ffl_22.bgn() - 1; i2 < ffl_22.bgp() + 1; ++i2) {
                    boolean bl;
                    ffm_2 ffm_22 = ffl_22.gM(j, i2);
                    boolean bl2 = ffl_22.gM(j, i2 + 1) == null && this.gM(j, i2 + 1) != null;
                    boolean bl3 = bl = ffl_22.gM(j + 1, i2) == null && this.gM(j + 1, i2) != null;
                    if (ffm_22 == null) continue;
                    if (bl2) {
                        tFloatArrayList.add(ffm_22.upq);
                        tFloatArrayList.add(ffm_22.dzg + (float)n);
                        tFloatArrayList.add(ffm_22.upv);
                        tFloatArrayList.add(ffm_22.upw + (float)n);
                    }
                    if (!bl) continue;
                    tFloatArrayList.add(ffm_22.upt);
                    tFloatArrayList.add(ffm_22.upu + (float)n);
                    tFloatArrayList.add(ffm_22.upv);
                    tFloatArrayList.add(ffm_22.upw + (float)n);
                }
            }
        }
        return tFloatArrayList.toArray();
    }

    public float[] gwi() {
        float f2 = 1.0f / this.bRL;
        float f3 = f2 / 2.0f;
        int n = (int)((float)this.upC.dZr() * 10.0f);
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int i = this.bro; i < this.brq + 1; ++i) {
            for (int j = this.brp; j < this.brr + 1; ++j) {
                ffm_2 ffm_22 = this.gM(i, j);
                if (ffm_22 == null) continue;
                ffm_2 ffm_23 = this.gM(i + 1, j);
                ffm_2 ffm_24 = this.gM(i, j + 1);
                ffm_2 ffm_25 = this.gM(i, j - 1);
                ffm_2 ffm_26 = this.gM(i - 1, j);
                ffm_2 ffm_27 = this.gM(i + 1, j - 1);
                ffm_2 ffm_28 = this.gM(i + 1, j + 1);
                ffm_2 ffm_29 = this.gM(i - 1, j - 1);
                ffm_2 ffm_210 = this.gM(i - 1, j + 1);
                float f4 = ffm_22.upq + 2.0f * f2 + (ffm_26 != null ? -f2 : 0.0f) + (ffm_24 != null ? -f2 : 0.0f);
                float f5 = ffm_22.dzg + (float)n + (ffm_26 != null ? f3 : 0.0f) + (ffm_24 != null ? -f3 : 0.0f);
                float f6 = ffm_22.upt - 2.0f * f2 - (ffm_23 != null ? -f2 : 0.0f) - (ffm_25 != null ? -f2 : 0.0f);
                float f7 = ffm_22.upu + (float)n - (ffm_23 != null ? f3 : 0.0f) - (ffm_25 != null ? -f3 : 0.0f);
                float f8 = ffm_22.upr + (ffm_26 != null ? -f2 : 0.0f) + (ffm_25 != null ? f2 : 0.0f);
                float f9 = ffm_22.ups + (float)n - 2.0f * f3 + (ffm_26 != null ? f3 : 0.0f) + (ffm_25 != null ? f3 : 0.0f);
                float f10 = ffm_22.upv + (ffm_23 != null ? f2 : 0.0f) + (ffm_24 != null ? -f2 : 0.0f);
                float f11 = ffm_22.upw + (float)n + 2.0f * f3 - (ffm_23 != null ? f3 : 0.0f) - (ffm_24 != null ? f3 : 0.0f);
                if (ffm_25 == null) {
                    if (ffm_27 != null && ffm_23 != null) {
                        f6 = ffm_22.upt;
                        f7 = ffm_22.upu - 2.0f * f3 + (float)n;
                    }
                    if (ffm_29 != null && ffm_26 != null) {
                        f8 = ffm_22.upr - 2.0f * f2;
                        f9 = ffm_22.ups + (float)n;
                    }
                }
                if (ffm_24 == null) {
                    if (ffm_210 != null && ffm_26 != null) {
                        f4 = ffm_22.upq;
                        f5 = ffm_22.dzg + 2.0f * f3 + (float)n;
                    }
                    if (ffm_28 != null && ffm_23 != null) {
                        f10 = ffm_22.upv + 2.0f * f2;
                        f11 = ffm_22.upw + (float)n;
                    }
                }
                if (ffm_26 == null) {
                    if (ffm_29 != null && ffm_25 != null) {
                        f8 = ffm_22.upr + 2.0f * f2;
                        f9 = ffm_22.ups + (float)n;
                    }
                    if (ffm_210 != null && ffm_24 != null) {
                        f4 = ffm_22.upq;
                        f5 = ffm_22.dzg - 2.0f * f3 + (float)n;
                    }
                }
                if (ffm_23 == null) {
                    if (ffm_27 != null && ffm_25 != null) {
                        f6 = ffm_22.upt;
                        f7 = ffm_22.upu + 2.0f * f3 + (float)n;
                    }
                    if (ffm_28 != null && ffm_24 != null) {
                        f10 = ffm_22.upv - 2.0f * f2;
                        f11 = ffm_22.upw + (float)n;
                    }
                }
                if (ffm_24 == null) {
                    tFloatArrayList.add(f4);
                    tFloatArrayList.add(f5);
                    tFloatArrayList.add(f10);
                    tFloatArrayList.add(f11);
                }
                if (ffm_25 == null) {
                    tFloatArrayList.add(f8);
                    tFloatArrayList.add(f9);
                    tFloatArrayList.add(f6);
                    tFloatArrayList.add(f7);
                }
                if (ffm_23 == null) {
                    tFloatArrayList.add(f6);
                    tFloatArrayList.add(f7);
                    tFloatArrayList.add(f10);
                    tFloatArrayList.add(f11);
                }
                if (ffm_26 != null) continue;
                tFloatArrayList.add(f8);
                tFloatArrayList.add(f9);
                tFloatArrayList.add(f4);
                tFloatArrayList.add(f5);
            }
        }
        return tFloatArrayList.toArray();
    }

    public axb_2 getColor() {
        return this.upC.dYq();
    }

    public int gwj() {
        return this.upC.gvC();
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public void setPixmap(awg_1 awg_12) {
        this.tEC = awg_12;
    }

    public int gwk() {
        return this.upD;
    }

    public int gwl() {
        return this.upE;
    }

    public void bmX() {
        for (int i = this.upB.size() - 1; i >= 0; --i) {
            ffl_2 ffl_22 = this.upB.get(i);
            if (ffl_22 == null || ffl_22.getPixmap() == null || ffl_22.getPixmap().bHg() == null) continue;
            ffl_22.bmX();
        }
    }
}

