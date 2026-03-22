/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRF
 */
public class brf_2
implements aeh_2 {
    public static final String lbr = "score";
    public static final String lbs = "rankDescription";
    public static final String lbt = "rankLongDescription";
    public static final String lbu = "color";
    private final int lbv;
    private int lbw;

    public brf_2(int n) {
        this.lbv = n;
    }

    public int Xt() {
        return this.lbv;
    }

    public int elc() {
        return this.lbw;
    }

    public void Jm(int n) {
        this.lbw = n;
        fse_1.gFu().a((aef_2)this, lbr, lbs, lbt, lbu);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lbr)) {
            try {
                return new ahv_2().yx(this.lbw).c(" ").ceC().a(auk_0.zU(9), 15, 15, null).ceL();
            }
            catch (fu_0 fu_02) {
                return this.lbw;
            }
        }
        if (string.equals(lbt)) {
            if (this.lbv == 0) {
                return aum_0.cWf().c("map.territories.noNation", new Object[0]);
            }
            ahv_2 ahv_22 = new ahv_2();
            String string2 = aum_0.cWf().c("nation.short." + this.lbv, new Object[0]);
            ahv_22.ceu().c(aum_0.cWf().c("citizen.score.with.nation", new Object[0])).cev().yx(this.lbw).c(" (").c(string2).k(')').ceH();
            ahv_22.ceu().c(this.elf()).cev();
            return ahv_22.ceL();
        }
        if (string.equals(lbs)) {
            if (this.lbv == 0) {
                return aum_0.cWf().c("map.territories.noNation", new Object[0]);
            }
            return this.elf();
        }
        if (string.equals(lbu)) {
            fkd_0 fkd_02;
            float f2 = this.eld();
            float f3 = Math.abs(f2);
            fkd_0 fkd_03 = this.ele();
            awx_2 awx_22 = awx_2.gD(fkd_03.ajo());
            fkd_0 fkd_04 = fkd_02 = f2 > 0.0f ? fkf_0.gcc().b(fkd_03) : fkf_0.gcc().a(fkd_03);
            if (fkd_02 == null) {
                fkd_02 = fkd_03;
            }
            awx_2 awx_23 = awx_2.gD(fkd_02.ajo());
            return String.valueOf(GC.a(awx_22.aIU(), awx_23.aIU(), f3)) + "," + GC.a(awx_22.aIV(), awx_23.aIV(), f3) + "," + GC.a(awx_22.aIW(), awx_23.aIW(), f3);
        }
        return null;
    }

    private float eld() {
        int n = this.elc();
        float f2 = 0.0f;
        fkd_0 fkd_02 = this.ele();
        if (n > 0) {
            f2 = (float)n / (float)fkd_02.clW();
        } else if (n < 0) {
            fkd_0 fkd_03 = fkf_0.gcc().a(fkd_02);
            f2 = -((float)n / (float)(fkd_03 == null ? fkd_02.clW() : fkd_03.clW()));
        }
        return f2;
    }

    private fkd_0 ele() {
        return fkf_0.gcc().WJ(this.elc());
    }

    private String elf() {
        return aum_0.cWf().c(fkf_0.gcc().WJ(this.lbw).clY(), new Object[0]);
    }
}

