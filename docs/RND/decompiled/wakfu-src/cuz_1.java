/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayDeque;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cUZ
 */
public class cuz_1
implements adi_1 {
    private static final Logger nOu = Logger.getLogger(cuz_1.class);
    private static final cuz_1 nOv = new cuz_1();
    public static final int nOw = 2000;
    private static final float nOx = 0.4f;
    private static final float nOy = 1.0f;
    private final ArrayDeque<bom_2> nOz = new ArrayDeque();
    private fig_2 nOA;
    private alx_2 ikv;

    public static cuz_1 eTq() {
        return nOv;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18218: {
                bgt_0 bgt_02;
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                Optional<bom_2> optional = bop_2.egN().Iy(n);
                if (optional.isEmpty()) {
                    return false;
                }
                bom_2 bom_22 = optional.get();
                if (bom_22.egL().isEmpty()) {
                    nOu.warn((Object)("No guide element to display for guide=" + n));
                    return false;
                }
                if (!bol_2.Iw(n)) {
                    bol_2.Iv(n);
                } else if (!bom_22.cnZ()) {
                    return false;
                }
                if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljD) && !bom_22.cnZ()) {
                    return false;
                }
                if (!(bom_22.egJ() == null || (bgt_02 = aue_0.cVJ().cVK()) != null && bom_22.egJ().b(bgt_02, bgt_02, null, bgt_02.bdV()))) {
                    return false;
                }
                this.b(bom_22);
                return false;
            }
            case 19396: {
                dae_0 dae_03 = (dae_0)aam_22;
                int n = dae_03.bCo();
                Optional<bom_2> optional = bop_2.egN().Iy(n);
                if (optional.isEmpty()) {
                    return false;
                }
                bom_2 bom_23 = optional.get();
                if (bom_23.egL().isEmpty()) {
                    nOu.warn((Object)("No guide element to display for guide=" + n));
                    return false;
                }
                this.b(bom_23);
                return false;
            }
            case 16919: {
                dae_0 dae_04 = (dae_0)aam_22;
                bor_2 bor_22 = (bor_2)dae_04.bCv();
                if (bor_22 != null && bor_22.ecM()) {
                    bor_22.dxp();
                }
                return false;
            }
            case 16508: {
                dae_0 dae_05 = (dae_0)aam_22;
                bor_2 bor_23 = (bor_2)dae_05.bCv();
                if (bor_23 != null && bor_23.ecL()) {
                    bor_23.dxo();
                }
                return false;
            }
            case 17027: {
                this.eTr();
                return false;
            }
        }
        return true;
    }

    private void eTr() {
        if (!fyw_0.gqw().to("guidePopupDialog")) {
            return;
        }
        if (this.nOz.isEmpty()) {
            if (!fyw_0.gqw().to("guideListDialog")) {
                fyw_0.gqw().tc("wakfu.guidePopup");
            }
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("guidePopupDialog");
            fse_1.gFu().b("guideViewPopup", (Object)null, "guidePopupDialog");
            fse_1.gFu().b("guidePopupIsClosable", true, "guidePopupDialog");
            ccg_2.eJI().b(this.nOA);
            cAY.eHc().e(1.0f, 1000);
            cAY.eHc().f(1.0f, 1000);
        } else {
            bom_2 bom_22 = this.nOz.poll();
            fse_1.gFu().b("guideViewPopup", new bor_2(bom_22), "guidePopupDialog");
            cuz_1.eTs();
        }
    }

    private void b(bom_2 bom_22) {
        if (fyw_0.gqw().to("guidePopupDialog")) {
            this.nOz.offer(bom_22);
            return;
        }
        fyw_0.gqw().d("wakfu.guidePopup", cer_1.class);
        ccj_2.g("guidePopupDialog", 256L);
        fyw_0.gqw().a(this.ikv);
        cAY.eHc().nP(600211L);
        cAY.eHc().e(0.4f, 1000);
        cAY.eHc().f(0.4f, 1000);
        fse_1.gFu().b("guideViewPopup", new bor_2(bom_22), "guidePopupDialog");
        ccg_2.eJI().a(this.nOA);
        cuz_1.eTs();
    }

    private static void eTs() {
        fse_1.gFu().b("guidePopupIsClosable", false, "guidePopupDialog");
        abg_2.bUP().a(() -> fse_1.gFu().b("guidePopupIsClosable", true, "guidePopupDialog"), 2000L, 1);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.nOA = string -> {
            bor_2 bor_22 = (bor_2)fse_1.gFu().aW("guideViewPopup", "guidePopupDialog");
            if (bor_22 == null) {
                return fif_2.uAv;
            }
            if (bor_22.ecM()) {
                bor_22.dxp();
                return fif_2.uAy;
            }
            boolean bl = fse_1.gFu().aU("guidePopupIsClosable", "guidePopupDialog");
            if (bl) {
                this.eTr();
            }
            return fif_2.uAy;
        };
        this.ikv = string -> {
            if (string.equals("guidePopupDialog")) {
                this.nOz.clear();
                this.eTr();
            }
        };
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.nOA = null;
        this.ikv = null;
        this.nOz.clear();
        cdv_0.euj().e(this);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

