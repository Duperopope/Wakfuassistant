/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQV
 */
public class cqv_2
extends cpm_1
implements adm_0 {
    private int asK;
    private acd_1 njX;

    public cqv_2() {
    }

    public cqv_2(int n) {
        this.asK = n;
    }

    public cqv_2 eMw() {
        return new cqv_2(this.asK);
    }

    @Override
    public String ely() {
        return "followMonster";
    }

    @Override
    public boolean bxO() {
        if (aue_0.cVJ().cVK().djT()) {
            return false;
        }
        return !bsl_0.jfZ.dFs();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bhx_0 bhx_02 = (bhx_0)this.cqO;
        this.njX = bhx_02.aZw();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.i(false, true)) {
            return;
        }
        bgt_02.ddI().b(this);
        if (!aue_0.cVJ().cVK().c(this.njX, true, true)) {
            aue_0.cVJ().cVK().ddI().c(this);
            if (Math.abs(bgt_02.ddI().bqg().getX() - this.njX.getX()) <= 1 && Math.abs(bgt_02.ddI().bqg().getY() - this.njX.getY()) <= 1) {
                cje_0 cje_02 = new cje_0();
                cje_02.lT(this.asK);
                aue_0.cVJ().etu().d(cje_02);
            }
        }
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niS;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        cje_0 cje_02 = new cje_0();
        cje_02.lT(this.asK);
        aue_0.cVJ().etu().d(cje_02);
    }

    @Override
    protected int eLB() {
        return crc_2.nna.nnW;
    }

    public void lT(int n) {
        this.asK = n;
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMw();
    }
}

