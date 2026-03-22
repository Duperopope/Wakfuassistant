/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSr
 */
public class bsr_2
extends bso_2 {
    public static final String lgt = "territoriesCount";
    public static final String lgu = "territoriesRatio";
    public static final String lgv = "territoriesRatioPerc";
    public static final String[] lgw = new String[]{"territoriesCount", "territoriesRatio", "territoriesRatioPerc"};
    private int lgx;

    public bsr_2(int n) {
        super(n);
    }

    @Override
    public String[] bxk() {
        return lgw;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lgt)) {
            return this.emI();
        }
        if (string.equals(lgu)) {
            return Float.valueOf(this.emH());
        }
        if (string.equals(lgv)) {
            int n = this.lgx - this.emI();
            float f2 = (n == 0 ? (float)this.emJ() / 2.0f : (float)n + (float)this.emI() / 2.0f) / (float)brx_1.elI().elW() * 100.0f;
            return new ftc_1(f2);
        }
        return super.eu(string);
    }

    private float emH() {
        return (float)this.lgx / (float)brx_1.elI().elW();
    }

    public int emI() {
        return brx_1.elI().Jq(this.lfQ);
    }

    public void Js(int n) {
        this.lgx = n;
    }

    public int emJ() {
        return this.lgx;
    }
}

