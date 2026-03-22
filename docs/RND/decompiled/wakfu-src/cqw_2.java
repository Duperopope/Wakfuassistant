/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQW
 */
public class cqw_2
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.niV;
    }

    @Override
    public cpm_1 eLD() {
        return new cqw_2();
    }

    private static boolean dQO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02.dnw() == bgt_02.dnx();
    }

    private cvh_1 dQP() {
        if (cqw_2.dQO()) {
            return ctp_2.eQZ();
        }
        return cvp_2.eTJ();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        aue_0.cVJ().cVK().i(false, true);
        cvh_1 cvh_12 = this.dQP();
        bCA bCA2 = (bCA)this.cqO;
        bDh bDh2 = bCA2.dNj();
        cvh_12.b(bDh2);
        cvh_12.y(() -> bDh2.dQz().dQI());
        cvh_12.x(() -> bDh2.dQz().k(cvh_12.eRa()));
        cvh_12.z(() -> {});
        cvh_12.a(cvi_2.nQo);
        aue_0.cVJ().a(cvh_12);
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnj() || bgt_02.djT() || bsl_0.jfZ.dFs()) {
            return false;
        }
        if (!(this.cqO instanceof bCA)) {
            return false;
        }
        bDh bDh2 = ((bCA)this.cqO).dNk();
        return bDh2.Xi() == bgt_02.Sn() || cpq_1.og(bDh2.Xi());
    }

    @Override
    public String ely() {
        return "move";
    }

    @Override
    protected int eLB() {
        return crc_2.nmA.nnW;
    }
}

