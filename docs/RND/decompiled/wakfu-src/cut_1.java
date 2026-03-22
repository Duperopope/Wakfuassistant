/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.lang.runtime.SwitchBootstraps;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from cUT
 */
public class cut_1
implements adi_1 {
    private static final Logger nOb = LoggerFactory.getLogger(cut_1.class);
    private static final cut_1 nOc = new cut_1();
    private static final String nOd = "rotateCheckBox";
    private static final String nOe = "destroyCheckBox";
    private but_0 nOf = but_0.jpq;

    public static cut_1 eTd() {
        return nOc;
    }

    private cut_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19574: {
                dae_0 dae_02 = (dae_0)aam_22;
                Object t = dae_02.bCv();
                if (!(t instanceof but_0)) {
                    nOb.error("[Furniture] Furniture select mode was received, but no associated mode was defined");
                    return false;
                }
                but_0 but_02 = (but_0)((Object)t);
                cvh_1 cvh_12 = bDr.dQP();
                if (aue_0.cVJ().c(cvh_12)) {
                    aue_0.cVJ().b(cvh_12);
                }
                switch (but_02) {
                    case jpr: {
                        if (this.eTj() == but_0.jpr) {
                            this.eTe();
                            break;
                        }
                        this.a(but_0.jpr);
                        this.b(cut_1.eTf(), nOd);
                        this.eTi();
                        cut_1.eTh();
                        break;
                    }
                    case jps: {
                        if (this.eTj() == but_0.jps) {
                            this.eTe();
                            break;
                        }
                        this.a(but_0.jps);
                        this.b(cut_1.eTf(), nOe);
                        this.eTi();
                        cut_1.eTg();
                    }
                }
                return false;
            }
            case 16902: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                if (!dcm_02.fch()) {
                    this.eTe();
                    return true;
                }
                if (this.nOf == but_0.jpq) {
                    return true;
                }
                aIs aIs2 = (aIs)aie_0.cfn().bmC();
                ZH zH = aIs2.cgz();
                if (!(zH instanceof afk_0)) {
                    return false;
                }
                afk_0 afk_02 = (afk_0)zH;
                bCA bCA2 = (bCA)afk_02.aVD();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (bCA2 == null) {
                    return false;
                }
                but_0 but_03 = this.nOf;
                int n = 0;
                switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"DESTROY", "ROTATE"}, (but_0)but_03, n)) {
                    case 0: {
                        boolean bl = this.a(bCA2, bgt_02);
                        if (!bl) {
                            nOb.error("[FURNITURE] Error while trying to destroy {} for player {} (owner id = {})", new Object[]{bCA2.Sn(), bgt_02.Sn(), bgt_02.Xi()});
                        }
                        return false;
                    }
                    case 1: {
                        boolean bl = this.a((ni_1)bCA2, bgt_02);
                        if (!bl) {
                            nOb.error("[FURNITURE] Error while trying to rotate {} for player {} (owner id = {})", new Object[]{bCA2.Sn(), bgt_02.Sn(), bgt_02.Xi()});
                        }
                        return false;
                    }
                }
                nOb.warn("Unknown furniture management mode {}", (Object)this.nOf);
                return false;
            }
        }
        return true;
    }

    private void b(fhv_1 fhv_12, String string) {
        if (fhv_12 == null) {
            return;
        }
        fhv_1 fhv_13 = fhv_12.getChildWithId(string);
        cut_1.g(fhv_13);
    }

    public void eTe() {
        this.a(but_0.jpq);
        this.eTi();
        fhv_1 fhv_12 = cut_1.eTf();
        if (fhv_12 == null) {
            return;
        }
        this.b(fhv_12, nOd);
        this.b(fhv_12, nOe);
    }

    private static fhv_1 eTf() {
        return fyw_0.gqw().th("sundialDialog");
    }

    private static void g(fhv_1 fhv_12) {
        if (!(fhv_12 instanceof fdd_2)) {
            return;
        }
        fdd_2 fdd_22 = (fdd_2)fhv_12;
        fdd_22.setSelected(false);
    }

    private boolean a(ni_1 ni_12, bgt_0 bgt_02) {
        if (ArrayUtils.contains((Object[])ni_12.bea(), (Object)rw_0.blm)) {
            return ni_12.a(rw_0.blm, bgt_02);
        }
        return false;
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
        if (bl) {
            return;
        }
        fyw_0.gqw().d("wakfu.furniture.management", ceo_2.class);
        this.eTi();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(false);
        this.eTe();
        fyw_0.gqw().tc("wakfu.furniture.management");
    }

    private static void eTg() {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(true);
    }

    private static void eTh() {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(false);
    }

    private boolean a(bCA bCA2, bgt_0 bgt_02) {
        boolean bl;
        boolean bl2 = ArrayUtils.contains((Object[])bCA2.bea(), (Object)rw_0.blg);
        boolean bl3 = bl = bCA2.dNk() == null || bCA2.dNk().dNb();
        if (bl2 && bl) {
            return bCA2.a(rw_0.blg, bgt_02);
        }
        return false;
    }

    public void a(but_0 but_02) {
        this.nOf = but_02;
    }

    private void eTi() {
        switch (this.nOf) {
            case jpr: {
                fhn_1.gzT().a(fzo_0.tHw, true);
                break;
            }
            case jps: {
                fhn_1.gzT().a(fzo_0.tHO, true);
                break;
            }
            default: {
                fhn_1.gzT().bYz();
            }
        }
    }

    public but_0 eTj() {
        return this.nOf;
    }
}

