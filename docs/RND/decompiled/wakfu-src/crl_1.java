/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRl
 */
public class crl_1
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.niW;
    }

    @Override
    public cpm_1 eLD() {
        return new crl_1();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        bCA bCA2 = (bCA)this.cqO;
        bCA2.a(rw_0.blm, aue_0.cVJ().cVK());
        cAY.eHc().nP(600044L);
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
        return "rotate";
    }

    @Override
    protected int eLB() {
        return crc_2.nnI.nnW;
    }
}

