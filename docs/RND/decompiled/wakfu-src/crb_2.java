/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRb
 */
public class crb_2
extends cpm_1
implements adm_0 {
    @Override
    public cps_1 eLz() {
        return cps_1.nji;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        bJr bJr2 = bhx_02.doD();
        if (bJr2 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.i(false, true)) {
                return;
            }
            fse_1.gFu().f("voteList", true);
            aue_0.cVJ().a(cyk_2.eYu());
        }
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (!(this.cqO instanceof bhx_0)) {
            return false;
        }
        bJr bJr2 = ((bhx_0)this.cqO).doD();
        if (bJr2 == null) {
            return false;
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        int n = bJr2.gfT();
        if (n == 0) {
            return false;
        }
        if (n == 34) {
            return false;
        }
        if (n != fjn_02.Xt()) {
            return false;
        }
        fjo_0 fjo_02 = bJr2.gfR();
        if (fjo_02 == null) {
            return false;
        }
        if (fjo_02.gbx()) {
            return false;
        }
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        return bgt_03.a(evv_1.oxb);
    }

    @Override
    public String getLabel() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        flr_0 flr_02 = (flr_0)bgt_02.ffF();
        return super.getLabel();
    }

    @Override
    public String ely() {
        return "voteList";
    }

    @Override
    public cpm_1 eLD() {
        return new crb_2();
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        aue_0.cVJ().a(cyk_2.eYu());
    }

    @Override
    protected int eLB() {
        return crc_2.nmU.nnW;
    }
}

