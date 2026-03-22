/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQc
 */
public class cqc_1
extends cpm_1 {
    private final acd_1 nkE;
    private boolean htg = false;
    private int lYp = 2;
    private boolean lYq = true;
    private byte lYr = eud_0.rrS.aJr();
    private acd_1 lYs = null;
    private acd_1 lYu = null;
    private acd_1 lYv = null;
    private int[] lYt = null;

    public cqc_1() {
        this.nkE = new acd_1();
    }

    public cqc_1(acd_1 acd_12, boolean bl, int n, boolean bl2, byte by, acd_1 acd_13, int[] nArray, acd_1 acd_14, acd_1 acd_15) {
        this.nkE = acd_12;
        this.htg = bl;
        this.lYp = n;
        this.lYq = bl2;
        this.lYr = by;
        this.lYs = acd_13;
        this.lYt = nArray;
        this.lYu = acd_14;
        this.lYv = acd_15;
    }

    @Override
    public cpm_1 eLD() {
        return new cqc_1(this.nkE, this.htg, this.lYp, this.lYq, this.lYr, this.lYs, this.lYt, this.lYu, this.lYv);
    }

    public void aa(acd_1 acd_12) {
        this.lYs = acd_12;
    }

    public void dn(byte by) {
        this.lYr = by;
    }

    public void F(int[] nArray) {
        this.lYt = nArray;
    }

    public void KW(int n) {
        this.lYp = n;
    }

    public void fa(boolean bl) {
        this.htg = bl;
    }

    public void jn(boolean bl) {
        this.lYq = bl;
    }

    public void ab(acd_1 acd_12) {
        this.lYu = acd_12;
    }

    public void ac(acd_1 acd_12) {
        this.lYv = acd_12;
    }

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
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        bdj_2 bdj_23 = ((bgy)this.cqO).ddI();
        int n = bdj_23.bvI();
        int n2 = bdj_23.bvJ();
        short s = (short)bdj_23.getAltitude();
        int n3 = bdj_22.bcC();
        int n4 = bdj_22.bcD();
        if (Math.abs(n - n3) <= 10 && Math.abs(n2 - n4) <= 10) {
            ckG ckG2 = new ckG();
            ckG2.fg(((bgy)this.cqO).Sn());
            ckG2.Y(n, n2, s);
            ckG2.aa(this.lYs);
            ckG2.dn(this.lYr);
            ckG2.F(this.lYt);
            ckG2.KW(this.lYp);
            ckG2.fa(this.htg);
            ckG2.jn(this.lYq);
            ckG2.ab(this.lYu);
            ckG2.ac(this.lYv);
            aue_0.cVJ().etu().d(ckG2);
        }
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bgy)) {
            return false;
        }
        if (((bgy)this.cqO).djT()) {
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
        return !((bgy)this.cqO).a(ezj_0.psz);
    }

    @Override
    public String ely() {
        return "trainingFightStart";
    }

    @Override
    protected int eLB() {
        return cps_1.niy.avZ();
    }
}

