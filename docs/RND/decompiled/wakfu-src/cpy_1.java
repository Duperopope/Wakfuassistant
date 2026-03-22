/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPY
 */
public final class cpy_1
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.niM;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        nii.info((Object)("Demande de lancement de combat d'arene sur le perso " + String.valueOf(this.cqO)));
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        bgy bgy2 = (bgy)this.cqO;
        bdj_2 bdj_23 = bgy2.ddI();
        int n = bdj_23.bvI();
        int n2 = bdj_23.bvJ();
        short s = (short)bdj_23.getAltitude();
        if (amf_1.c((amg_1)bdj_22, bdj_23) > 25) {
            return;
        }
        if (aPd.a(bgy2.getName(), ejn_0.qzh)) {
            return;
        }
        this.ab(n, n2, s);
        this.cXz();
    }

    private void cXz() {
        aPd.g("fight.invitation", ((bgy)this.cqO).getName());
    }

    private void ab(int n, int n2, short s) {
        ckr ckr2 = new ckr();
        ckr2.mY(((bgy)this.cqO).Sn());
        ckr2.Z(n, n2, s);
        ckr2.dm((byte)2);
        ckr2.jl(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb));
        aue_0.cVJ().etu().d(ckr2);
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bgy)) {
            return false;
        }
        bgy bgy2 = (bgy)this.cqO;
        if (bgy2.djT()) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            return false;
        }
        if (bgt_02.dnw() != null) {
            return false;
        }
        if (bgt_02.dnj()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (bgt_02.b(ezj_0.psx) > 0) {
            return false;
        }
        if (bgy2.a(ezj_0.psz)) {
            return false;
        }
        if (!bgt_02.a(ezj_0.ptZ)) {
            return false;
        }
        return bgy2.a(ezj_0.ptZ);
    }

    @Override
    public String ely() {
        return "castArenaFight";
    }

    @Override
    public cpm_1 eLD() {
        return new cpy_1();
    }

    @Override
    protected int eLB() {
        return cps_1.niy.avZ();
    }
}

