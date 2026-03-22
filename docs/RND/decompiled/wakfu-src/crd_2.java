/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRd
 */
public class crd_2
extends cqf_1 {
    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bbl_1)) {
            return false;
        }
        bbl_1 bbl_12 = (bbl_1)this.cqO;
        if (bbl_12.dPE() != fpR.sQT && bbl_12.dPE() != fpR.sQW) {
            return false;
        }
        return super.bxO();
    }

    @Override
    public boolean isEnabled() {
        if (!(this.cqO instanceof bbl_1)) {
            return false;
        }
        bbl_1 bbl_12 = (bbl_1)this.cqO;
        if (bbl_12.dPE() == fpR.sQW) {
            this.qa(aum_0.cWf().c("pvp.extraction.activate.mru.action.replenishing.phase", new Object[0]));
            return false;
        }
        if (bgt_2.jWG.dUp() <= 0) {
            this.qa(aum_0.cWf().c("pvp.extraction.activate.mru.action.empty.inventory", new Object[0]));
            return false;
        }
        if (aue_0.cVJ().cVK().dkC() == fpu_0.sRd) {
            this.qa(aum_0.cWf().c("pvp.mru.error.no.pact", new Object[0]));
            return false;
        }
        return true;
    }

    @Override
    public String ely() {
        return "pvp.extraction.activate.mru.action";
    }

    @Override
    protected int eLB() {
        return crc_2.nmt.nnW;
    }

    @Override
    public cpm_1 eLD() {
        return new crd_2();
    }

    @Override
    protected rw_0 eLF() {
        return rw_0.bkJ;
    }
}

