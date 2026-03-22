/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKl
 */
public class bkl_0
extends bkq_0 {
    public static final String kmZ = "temperatureIconUrl";
    public static final String kna = "windIconUrl";
    private final int knb;
    private final String knc;
    private final String knd;
    private int[] kne;

    public bkl_0(bkn_0 bkn_02, int n) {
        super(bkn_02);
        this.knb = n;
        wd_0 wd_02 = ejx_0.qzT.Qc(this.knb);
        if (wd_02 != null) {
            this.knc = aum_0.cWf().a(52, (long)this.knb, new Object[0]);
            this.knd = aum_0.cWf().a(53, (long)this.knb, new Object[0]);
            this.kne = new int[2];
            this.kne[0] = wd_02.blu() > 0.0f ? 0 : (wd_02.blu() < 0.0f ? 1 : -1);
            this.kne[1] = wd_02.blv() > 0.0f ? 4 : (wd_02.blv() < 0.0f ? 5 : -1);
        } else {
            this.knc = "";
            this.knd = "";
        }
    }

    @Override
    public String getName() {
        return this.knc;
    }

    @Override
    public fpf ebf() {
        return fpf.sNz;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("description")) {
            return this.knd;
        }
        if (string.equals("name")) {
            return this.knc;
        }
        if (string.equals("nameWithRemainingTime")) {
            Object object = this.ebl();
            if (object == null) {
                return this.getName();
            }
            return new StringBuilder(this.knc).append(" (").append(object).append(")");
        }
        if (string.equals("nameWithDuration")) {
            return new StringBuilder(this.knc).append(" (").append(this.ebm()).append(")");
        }
        if (string.equals("iconUrl")) {
            return null;
        }
        if (string.equals(kmZ)) {
            if (this.kne[0] == -1) {
                return null;
            }
            return auc_0.cVq().a("climateBonusIconsPath", "defaultIconPath", this.kne[0]);
        }
        if (string.equals(kna)) {
            if (this.kne[1] == -1) {
                return null;
            }
            return auc_0.cVq().a("climateBonusIconsPath", "defaultIconPath", this.kne[1]);
        }
        return super.eu(string);
    }

    public int ebg() {
        return this.knb;
    }
}

