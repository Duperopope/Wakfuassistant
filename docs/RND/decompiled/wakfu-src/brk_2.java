/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRK
 */
class brk_2
implements aeh_2 {
    public static final String lce = "lastTimerChange";
    public static final String lcf = "formatedLastTimerChange";
    public static final String lcg = "iconUrl";
    public static final String lch = "remainingTime";
    public static final String lci = "description";
    public final String[] lcj = new String[]{"description", "iconUrl", "remainingTime"};
    private long lck;
    private boolean lcl = true;
    final /* synthetic */ brj_2 lcm;

    brk_2(brj_2 brj_22) {
        this.lcm = brj_22;
    }

    @Override
    public String[] bxk() {
        return this.lcj;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lce)) {
            return this.lck;
        }
        if (string.equals(lcf)) {
            if (this.lck == 0L) {
                return null;
            }
            boolean bl = this.lck < 0L;
            String string2 = (bl ? "-" : "") + uc_0.k(uz_0.fo(Math.abs(this.lck) / 1000L));
            brj_2.lbY.info((Object)("Formated last timer : " + string2));
            return string2;
        }
        if (string.equals(lcg)) {
            return auc_0.cVq().zG(-1);
        }
        if (string.equals(lci)) {
            return aum_0.cWf().c("nation.pvp.prisonerOf", this.elx());
        }
        if (string.equals(lch)) {
            if (this.lcl) {
                return "-";
            }
            uz_0 uz_02 = uz_0.fo(this.lcm.bVs() / 1000L);
            return uc_0.k(uz_02);
        }
        return null;
    }

    private String elx() {
        return aum_0.cWf().a(39, (long)brj_2.a(this.lcm).gde(), new Object[0]);
    }

    public void iy(boolean bl) {
        this.lcl = bl;
    }

    public void mo(long l) {
        this.lck = l;
        brj_2.lbY.info((Object)("LastTimerChange : " + l));
        fse_1.gFu().a((aef_2)this, lce, lcf);
    }
}

