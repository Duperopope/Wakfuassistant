/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRs
 */
public class crs_1
extends crq_1 {
    public crs_1 eMD() {
        return new crs_1();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.ad(bgt_02)) {
            this.niu.add(1);
            return false;
        }
        return super.isEnabled() && this.niu.isEmpty();
    }

    @Override
    protected void a(rw_0 rw_02, RG rG, ni_1 ni_12) {
        ((bCd)ni_12).a(rG, this.nmh);
    }

    @Override
    public /* synthetic */ cpr_1 eLH() {
        return this.eMD();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMD();
    }
}

