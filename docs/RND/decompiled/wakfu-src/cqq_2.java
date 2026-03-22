/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQQ
 */
public class cqq_2
extends cpm_1
implements adm_0 {
    private fqy_0 nkI;

    @Override
    public cps_1 eLz() {
        return cps_1.njl;
    }

    @Override
    public cpm_1 eLD() {
        return new cqq_2();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bal_0 bal_02 = (bal_0)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bal_02.T(bdj_22.bqg())) {
            this.eMr();
            return;
        }
        bdj_22.b(this);
        nii.info((Object)("Searching path to " + String.valueOf(bal_02)));
        bgt_02.a(czi_2.a(bdj_22, bal_02), true);
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(string);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null) {
            ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.localPlayerBusy", new Object[0])).ceD();
        } else if (!bgt_02.a(evv_1.oxe)) {
            ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.playerNotSubscriptionRight", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null) {
            return false;
        }
        if (!bgt_02.a(evv_1.oxe)) {
            return false;
        }
        return super.isEnabled();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bal_0)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return !bgt_02.dnj() && !bgt_02.djT() && !bsl_0.jfZ.dFs();
    }

    @Override
    public String ely() {
        return this.nkI.giw();
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eMr();
    }

    private void eMr() {
        bkw_1 bkw_12 = new bkw_1((bal_0)this.cqO);
        if (bkw_12.dsn()) {
            bkw_12.bIH();
        }
    }

    public void Mj(int n) {
        this.nkI = fqz_0.giz().YY(n);
    }

    @Override
    protected int eLB() {
        return this.nkI.giv();
    }

    public String toString() {
        return "MRUMarketAction{m_actionVisual=" + String.valueOf(this.nkI) + "}";
    }
}

