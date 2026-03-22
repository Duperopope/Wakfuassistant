/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQO
 */
public class cqo_1
extends cpm_1
implements adm_0 {
    @Override
    public cps_1 eLz() {
        return cps_1.niJ;
    }

    @Override
    public cpm_1 eLD() {
        return new cqo_1();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bap_0 bap_02 = (bap_0)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (!bap_02.aVP() && bap_02.T(bdj_22.bqg()) || bap_02.aVP() && bdj_22.bqg().L(bap_02.bcC(), bap_02.bcD(), bap_02.bcE())) {
            this.eMr();
        } else {
            bdj_22.b(this);
            nii.info((Object)("Serching path to " + String.valueOf(bap_02.aZw())));
            bgt_02.a(czi_2.a(bdj_22, bap_02), true);
        }
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bap_0)) {
            return false;
        }
        bap_0 bap_02 = (bap_0)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bap_02.Xi() != bgt_02.Sn()) {
            return false;
        }
        if (bgt_02.dnj() || bgt_02.djT() || bsl_0.jfZ.dFs()) {
            return false;
        }
        bkb_0 bkb_02 = bgt_02.dps();
        if (!(bkb_02 instanceof bku_1)) {
            return true;
        }
        bku_1 bku_12 = (bku_1)bkb_02;
        return bku_12.dsy() != this.cqO;
    }

    @Override
    public String ely() {
        return "manageFlea";
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.eMr();
    }

    private void eMr() {
        bku_1 bku_12 = new bku_1((bap_0)this.cqO);
        if (bku_12.dsn()) {
            bku_12.bIH();
        }
    }

    @Override
    protected int eLB() {
        return crc_2.nmp.nnW;
    }
}

