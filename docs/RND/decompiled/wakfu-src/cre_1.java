/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRe
 */
public class cre_1
extends cqf_1 {
    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bbl_1)) {
            return false;
        }
        bbl_1 bbl_12 = (bbl_1)this.cqO;
        if (bbl_12.dPE() == fpR.sQT) {
            return false;
        }
        if (bbl_12.dPE() == fpR.sQW) {
            return false;
        }
        return super.bxO();
    }

    @Override
    public boolean isEnabled() {
        if (!(this.cqO instanceof bbl_1)) {
            return false;
        }
        if (aue_0.cVJ().cVK().dkC() == fpu_0.sRd) {
            this.qa(aum_0.cWf().c("pvp.mru.error.no.pact", new Object[0]));
            return false;
        }
        bbl_1 bbl_12 = (bbl_1)this.cqO;
        if (bbl_12.bOK()) {
            this.qa(aum_0.cWf().c("pvp.extraction.extract.mru.action.used", new Object[0]));
            return false;
        }
        if (bbl_12.dPE() == fpR.sQU) {
            this.qa(aum_0.cWf().c("pvp.extraction.extract.mru.action.activating", new Object[0]));
            return false;
        }
        if (bgt_2.jWG.dUp() <= 0) {
            this.qa(aum_0.cWf().c("pvp.extraction.extract.mru.action.empty.inventory", new Object[0]));
            return false;
        }
        return !bbl_12.bOK();
    }

    @Override
    public void run() {
        if (!(this.cqO instanceof bbl_1)) {
            return;
        }
        bbl_1 bbl_12 = (bbl_1)this.cqO;
        bND.a(new crf_1(this, bbl_12));
        super.run();
    }

    @Override
    public String ely() {
        return "pvp.extraction.extract.mru.action";
    }

    @Override
    protected int eLB() {
        return crc_2.nnz.nnW;
    }

    @Override
    public cpm_1 eLD() {
        return new cre_1();
    }

    @Override
    protected rw_0 eLF() {
        return rw_0.blo;
    }
}

