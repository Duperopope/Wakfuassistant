/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQC
 */
public class cqc_2
extends cpm_1 {
    @Override
    public cpm_1 eLD() {
        return new cqc_2();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        boolean bl = caf_2.lFq.eqR();
        if (!bl) {
            return false;
        }
        long l = caf_2.lFq.eqJ().Ya();
        long l2 = bhJ2.Ya();
        long l3 = aue_0.cVJ().cVK().Ya();
        return l == l3 && l != l2;
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        cky_0 cky_02 = new cky_0();
        cky_02.db(bhJ2.Sn());
        aue_0.cVJ().etu().d(cky_02);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njC;
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

