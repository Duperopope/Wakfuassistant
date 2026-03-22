/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cSH
 */
public class csh_2
extends crk_2 {
    private static final boolean nGo = false;
    private static final Logger nGp = Logger.getLogger(csh_2.class);
    private static final csh_2 nGq = new csh_2();
    private bQW nGr;
    private alx_2 ikv;
    private fas_0 mgs;
    private bad_2 nGs;

    public static csh_2 eOr() {
        return nGq;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18750: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                ffV ffV2 = dbl_02.getItem();
                if (!this.bz(ffV2)) {
                    return false;
                }
                this.nGr.bv(ffV2);
                this.K(this.mgs.Lx(), ffV2.avr());
                return false;
            }
            case 19665: {
                this.nGr.bv(null);
                this.K(this.mgs.Lx(), 0);
                return false;
            }
        }
        return true;
    }

    private void K(long l, int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (!(bkb_02 instanceof bkv_1)) {
            return;
        }
        if (!this.aw(bgt_02)) {
            return;
        }
        ckz_0 ckz_02 = new ckz_0(bgt_02.Sn());
        ckz_02.a(new faW(l, n));
        aue_0.cVJ().etu().d(ckz_02);
    }

    private boolean aw(bhJ bhJ2) {
        if (this.mgp.Ya() != bhJ2.Ya()) {
            return false;
        }
        bjn_1 bjn_12 = bhJ2.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bhJ2.Sn());
        if (ezz_12 == null) {
            return false;
        }
        return bjn_12.jR(ezz_12.Xm()).b(eyh_2.rKM);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (this.nGr == null) {
                return;
            }
            this.ikv = new csi_2(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.buildingPanel", cdw_2.class);
            ccj_2.pd("havenWorldBuildingPanelDialog");
            aue_0.cVJ().cVK().ddI().a(this);
            fse_1.gFu().f("selectedBuilding", this.nGr);
        }
        super.a(aye_22, bl);
    }

    @Override
    public fas_0 eMN() {
        return this.mgs;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nGs = null;
            this.nGr = null;
            fyw_0.gqw().b(this.ikv);
            crh_2.eML().bCj();
            fse_1.gFu().vX("selectedBuilding");
            fyw_0.gqw().tl("havenWorldBuildingPanelDialog");
            fyw_0.gqw().tl("buildingEvolutionDialog");
            fyw_0.gqw().tc("wakfu.buildingPanel");
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null) {
                bgt_02.dnY();
                bgt_02.ddI().b(this);
            }
        }
        super.b(aye_22, bl);
    }

    @Override
    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        aue_0.cVJ().b(this);
    }

    @Override
    public void c(faz_0 faz_02) {
        super.c(faz_02);
        long l = this.nGs.ZC();
        this.mgs = faz_02.oM(l);
        if (this.mgs == null) {
            return;
        }
        this.nGr = bRb.kYS.mc(l);
    }

    public boolean bz(ffV ffV2) {
        return this.mgs.erN().Kq(ffV2.avr());
    }

    public void bA(ffV ffV2) {
        if (!aue_0.cVJ().c(csh_2.eOr())) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("havenWorldBuildingPanelDialog");
        boolean bl = this.bz(ffV2);
        faw_2 faw_22 = (faw_2)fhs_22.uH("frontSlot");
        axb_2 axb_22 = bl ? new awx_2(aid_0.dVa.aTn()) : awx_2.dnJ;
        this.a(faw_22, axb_22);
    }

    private void a(faw_2 faw_22, axb_2 axb_22) {
        fys_0 fys_02 = faw_22.getAppearance();
        awx_2 awx_22 = new awx_2(awx_2.dnF.aTn());
        fys_02.x(fsa_2.class);
        fys_02.setModulationColor(awx_22);
        fsa_2 fsa_22 = new fsa_2(awx_22, axb_22, fys_02, 0, 300, -1, abn.cdr);
        fys_02.a(fsa_22);
    }

    public void eOs() {
        if (!aue_0.cVJ().c(csh_2.eOr())) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("havenWorldBuildingPanelDialog");
        faw_2 faw_22 = (faw_2)fhs_22.uH("frontSlot");
        faw_22.getAppearance().x(fsa_2.class);
    }

    public void a(bad_2 bad_22) {
        this.nGs = bad_22;
    }
}

