/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQN
 */
public final class cqn_2
extends cpo_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.njt;
    }

    @Override
    protected void eLE() {
        bzz bzz2 = (bzz)this.cqO;
        cul_1.eRH().a(bzz2);
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bzz)) {
            return false;
        }
        bCA bCA2 = (bCA)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bCA2.dNk().Xi();
        if (l == bgt_02.Sn()) {
            return true;
        }
        return cpq_1.og(l);
    }

    @Override
    public String ely() {
        return "manageEquipableDummy";
    }

    @Override
    public cpm_1 eLD() {
        return new cqn_2();
    }

    @Override
    protected int eLB() {
        return crc_2.nmG.nnW;
    }
}

