/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPW
 */
public class cpw_1
extends cpm_1
implements adm_0 {
    protected acd_1 njX;

    @Override
    public cps_1 eLz() {
        return cps_1.nje;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            return;
        }
        acd_1 acd_12 = this.eLP();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.njX = acd_12;
        if (!bgt_02.i(false, true)) {
            return;
        }
        bgt_02.ddI().b(this);
        if (!bgt_02.c(this.njX, false, true)) {
            bgt_02.ddI().c(this);
            acd_1 acd_13 = bgt_02.ddI().bqg();
            if (Math.abs(acd_13.getX() - this.njX.getX()) <= 1 && Math.abs(acd_13.getY() - this.njX.getY()) <= 1) {
                this.eLQ();
                this.eLO();
                return;
            }
            aPd.e("fight.no.path.to.border", new Object[0]);
        }
    }

    private void eLO() {
        int n = ((bgy)this.cqO).bqo();
        if (aJP.cig().cih() == n) {
            return;
        }
        ckk_0 ckk_02 = new ckk_0();
        ckk_02.pu(n);
        aue_0.cVJ().etu().d(ckk_02);
    }

    public acd_1 eLP() {
        bgy bgy2 = (bgy)this.cqO;
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        if (bsS2 == null) {
            return null;
        }
        acd_1 acd_12 = this.w(bsS2);
        return acd_12;
    }

    private acd_1 w(bsS bsS2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        acd_1 acd_12 = bgt_02.aZw();
        acd_1 acd_13 = new acd_1(acd_12);
        int n = Integer.MAX_VALUE;
        rh_0 rh_02 = bsS2.bag();
        int n2 = rh_02.bgm();
        int n3 = rh_02.bgn();
        acd_1 acd_14 = new acd_1();
        block0: for (int i = n2; i < n2 + rh_02.getWidth(); ++i) {
            for (int j = n3; j < n3 + rh_02.getHeight(); ++j) {
                short s;
                int n4;
                if (!rh_02.R(i, j) || (n4 = acd_12.P(i, j, s = rh_02.Z(i, j))) >= n) continue;
                acd_14.Q(i, j, s);
                this.b(bsS2, acd_14);
                if (acd_14.cF(i, j) || !wa_0.j(acd_14.getX(), acd_14.getY(), acd_14.bdi())) continue;
                n = n4;
                acd_13.C(acd_14);
                if (n == 0) continue block0;
            }
        }
        return acd_13;
    }

    private acd_1 b(bsS bsS2, acd_1 acd_12) {
        rh_0 rh_02 = bsS2.bag();
        if (!rh_02.T(acd_12.getX() + 1, acd_12.getY())) {
            acd_12.w(1, 0, 0);
        } else if (!rh_02.T(acd_12.getX(), acd_12.getY() + 1)) {
            acd_12.w(0, 1, 0);
        } else if (!rh_02.T(acd_12.getX() - 1, acd_12.getY())) {
            acd_12.M(1, 0, 0);
        } else if (!rh_02.T(acd_12.getX(), acd_12.getY() - 1)) {
            acd_12.M(0, 1, 0);
        }
        return acd_12;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        if (this.njX.getX() != n || this.njX.getY() != n2) {
            return;
        }
        this.eLQ();
        this.eLO();
    }

    private void eLQ() {
        abi_1 abi_12;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = (bgy)this.cqO;
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        if (bsS2 != null && (abi_12 = bgt_02.aZw().x(bsS2.bag().bdO())) != null) {
            bgt_02.ddI().h(abi_12);
        }
    }

    @Override
    public boolean bxO() {
        if (!ewo_0.oBF.k(ewr_0.oDB)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        if (bgt_02.dmV() != null) {
            return false;
        }
        if (this.cqO instanceof bgy) {
            return ((bgy)this.cqO).djT() && !((bgy)this.cqO).doP();
        }
        return false;
    }

    @Override
    public String ely() {
        return "becameFightSpectator";
    }

    @Override
    public cpm_1 eLD() {
        return new cpw_1();
    }

    @Override
    protected int eLB() {
        return crc_2.nnu.nnW;
    }
}

