/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQK
 */
public class cqk_1
extends cpm_1 {
    @Override
    public cpm_1 eLD() {
        return new cqk_1();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bnv_2 bnv_22 = aue_0.cVJ().cVK().dnw();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bnv_22 == null) {
            return false;
        }
        if (bnv_22.Xi() != aue_0.cVJ().cVK().Sn()) {
            return false;
        }
        if (bgt_02.dnj()) {
            return false;
        }
        return !bgt_02.djT();
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        cmW cmW2 = new cmW();
        cmW2.db(bhJ2.Sn());
        aue_0.cVJ().etu().d(cmW2);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niB;
    }

    @Override
    public String ely() {
        return "kick";
    }

    @Override
    protected int eLB() {
        return crc_2.nmD.nnW;
    }
}

