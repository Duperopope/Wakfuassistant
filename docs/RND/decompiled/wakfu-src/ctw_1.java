/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTW
 */
public class ctw_1
implements adi_1 {
    private static final Logger nLb = Logger.getLogger(ctw_1.class);
    private static final ctw_1 nLc = new ctw_1();
    private alx_2 ikv;
    private long nLd;
    private Runnable nLe;
    private frx_1 nJs;
    private final fte_1 nLf = new fte_1();
    private bco_0 nLg;

    public static ctw_1 eRl() {
        return nLc;
    }

    public void c(bco_0 bco_02) {
        this.nLg = bco_02;
        biu_2.kgz.lw(bco_02.Sn());
        aue_0.cVJ().a(this);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17491: {
                dae_0 dae_02 = (dae_0)aam_22;
                bif_2.dYO().dYi().k(dae_02.bCn(), dae_02.bCu());
                return false;
            }
            case 17115: {
                boolean bl = ((dae_0)aam_22).bCu();
                bif_2.dYO().dYi().hP(bl);
                cfl_1.setDisplayTerritories(bl);
                return false;
            }
            case 19803: {
                float f2 = bif_2.dYO().getZoomScale();
                float f3 = f2 + 0.1f;
                f2 = 1.0f < f3 ? 1.0f : f3;
                bif_2.dYO().setZoomScale(f2);
                return false;
            }
            case 16502: {
                float f4 = bif_2.dYO().getZoomScale();
                float f5 = f4 - 0.1f;
                f4 = 0.0f > f5 ? 0.0f : f5;
                bif_2.dYO().setZoomScale(f4);
                return false;
            }
            case 16821: {
                dae_0 dae_03 = (dae_0)aam_22;
                bif_2.dYO().setZoomScale((float)dae_03.bCr());
                return false;
            }
            case 18468: {
                dae_0 dae_04 = (dae_0)aam_22;
                long l = dae_04.bCp();
                frj_0 frj_02 = frb_0.sYO.uI(l);
                if (frj_02 == null) {
                    nLb.warn((Object)"On essaye de se t\u00e9l\u00e9porter sur une drago d'id inconnue ?");
                    return false;
                }
                long l2 = aue_0.cVJ().cVO().xl();
                if (!frz.a(l2, zd_2.aoD, (int)l)) {
                    return false;
                }
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bNY bNY2 = (bNY)frz.a(fre_0.sZa);
                bNY2.c(bgt_02, this.nLg, l);
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    public final void b(fln_2 fln_22) {
        fse_1.gFu().f("mapPopupDescription", fln_22.gEi().getName());
        fbb_2 fbb_22 = (fbb_2)fln_22.gBE();
        this.nLf.ace(fln_22.gEe() + fbb_22.getScreenX() - fln_22.gEg() / 2);
        this.nLf.acf(fln_22.gEf() + fbb_22.getScreenY() - fln_22.gEh() / 2);
        this.nLf.setWidth(fln_22.gEg());
        this.nLf.setHeight(fln_22.gEh());
        this.nJs.b(this.nLf);
    }

    public final void eRm() {
        fbj_1.getInstance().getPopupContainer().eKH();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    void eRn() {
        long l = System.currentTimeMillis();
        if (l - this.nLd > 30000L) {
            this.nLd = l;
            cnz cnz2 = new cnz();
            aue_0.cVJ().etu().d(cnz2);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (aue_0.cVJ().c(cwh_1.eVi())) {
                aue_0.cVJ().b(cwh_1.eVi());
            }
            this.ikv = new ctx_1(this);
            fyw_0.gqw().a(this.ikv);
            bif_2.dYO().dYi().a(biu_2.kgz);
            bif_2.dYO().dYi().a(new bRm());
            bif_2.dYO().dXL();
            bif_2.dYO().setDisplayTerritories(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljx));
            bif_2.dYO().dZa();
            big_2.hQ(false);
            ccj_2.g("dragoMapPopup", 8200L);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("dragoMapPopup");
            if (fhs_22 != null) {
                this.nJs = (frx_1)fhs_22.uH("popup");
            }
            fes_2 fes_22 = (fes_2)ccj_2.pd("dragoMapDialog");
            fhs_2 fhs_23 = fyw_0.gqw().gqC().uR("dragoMapDialog");
            if (fhs_23 != null) {
                fbh_2 fbh_22 = (fbh_2)fhs_23.uH("map");
                fbh_22.a(new cty_2(this, fes_22));
                bif_2.dYO().a(fbh_22);
            }
            this.nLf.l(fhs_23);
            ceq_1.reset();
            fyw_0.gqw().d("wakfu.dragoMap", ceq_1.class);
            cAY.eHc().nP(600021L);
            this.eRn();
            this.nLe = new ctz_1(this);
            abg_2.bUP().a(this.nLe, 30000L, -1);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("dragoMapDialog");
            fyw_0.gqw().tl("dragoMapPopup");
            this.nJs = null;
            this.nLf.l(null);
            bif_2.dYO().a((fbh_2)null);
            bRq.ekK().ekM();
            ceq_1.setCurrentWorldPositionMarker(null);
            ceq_1.setCurrentNote(null);
            fyw_0.gqw().tc("wakfu.dragoMap");
            cAY.eHc().nP(600022L);
            fhn_1.gzT().bYz();
            abg_2.bUP().h(this.nLe);
            this.nLe = null;
            ceq_1.reset();
            bif_2.dYO().dZa();
            this.nLg = null;
        }
    }
}

