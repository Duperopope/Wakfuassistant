/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVe
 */
class cve_2
implements fgp_2 {
    final /* synthetic */ cvd_1 nOL;

    cve_2(cvd_1 cvd_12) {
        this.nOL = cvd_12;
    }

    @Override
    public void onColumnSortChanged(String string, boolean bl) {
        if ("level".equals(string)) {
            this.nOL.nOK = bl ? eyb_2.rJW : eyb_2.rJX;
        } else if ("guildPoints".equals(string)) {
            this.nOL.nOK = bl ? eyb_2.rJY : eyb_2.rJZ;
        } else if ("conquestPoints".equals(string)) {
            this.nOL.nOK = bl ? eyb_2.rKa : eyb_2.rKb;
        }
        this.nOL.nOJ.bO((short)0);
        this.nOL.aW(this.nOL.nOJ.dJN());
    }
}

