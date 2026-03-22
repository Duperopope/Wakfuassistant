/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRg
 */
public class crg_1
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.niU;
    }

    @Override
    public cpm_1 eLD() {
        return new crg_1();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        aue_0.cVJ().cVK().i(false, true);
        if (this.cqO instanceof bCA) {
            bCA bCA2 = (bCA)this.cqO;
            ((ni_1)bCA2).a(rw_0.blg, aue_0.cVJ().cVK());
        } else {
            nii.error((Object)("Cannot REPACK a non-itemizable element of type " + this.getClass().getName()));
        }
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
        if (bDh2.Xi() != bgt_02.Sn() && !cpq_1.og(bDh2.Xi())) {
            return false;
        }
        this.setEnabled(bDh2.dNb());
        return true;
    }

    @Override
    public String ely() {
        bDh bDh2 = this.dNk();
        if (bDh2 != null && bDh2.dNl()) {
            return "remove";
        }
        if (this.isEnabled()) {
            return "repack";
        }
        return "repack.impossible";
    }

    private bDh dNk() {
        if (this.cqO instanceof bDh) {
            return (bxb_0)this.cqO;
        }
        if (this.cqO instanceof bCA) {
            return ((bCA)this.cqO).dNj();
        }
        return null;
    }

    @Override
    protected int eLB() {
        return crc_2.nmV.nnW;
    }
}

