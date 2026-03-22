/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cXD
 */
public class cxd_2
implements adi_1 {
    private static final cxd_2 nWB = new cxd_2();
    private frx_1 nWC;
    private aef_2 nWD;
    private boolean nWE;
    private String nWF;
    private static final String nWG = "spellDetailPopup";
    public static final String nWH = "itemDetailPopup";
    private static final String nWI = "itemSimplePopup";
    private String nWJ = "";

    public static cxd_2 eXp() {
        return nWB;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            aba_2 aba_22 = (aba_2)aam_22;
            abb_2.bUA().hk(aba_22.bUx());
            if (this.nWE) {
                return false;
            }
            this.eHW();
            return false;
        }
        switch (aam_22.d()) {
            case 17603: {
                dco_0 dco_02 = (dco_0)aam_22;
                boolean bl = false;
                if (this.nWC == null || this.nWD == null) {
                    abb_2.bUA().b(this);
                    return false;
                }
                if (this.nWD instanceof bmx_0 && dco_02.fbJ() instanceof bmx_0) {
                    bmx_0 bmx_02 = (bmx_0)this.nWD;
                    bmx_0 bmx_03 = (bmx_0)dco_02.fbJ();
                    bl = ((bmt_0)bmx_02.giP()).d() == ((bmt_0)bmx_03.giP()).d();
                } else {
                    bl = this.nWD.equals(dco_02.fbJ());
                }
                if (bl) {
                    this.nWE = !fyd_0.closePopup(null, this.nWC);
                    fse_1.gFu().vX(this.nWF);
                }
                return false;
            }
            case 16470: {
                dco_0 dco_03 = (dco_0)aam_22;
                this.nWD = dco_03.fbJ();
                if (this.nWD == null) {
                    return false;
                }
                if (dco_03.bCo() > 0) {
                    this.nWE = false;
                    abb_2.bUA().a(this, dco_03.bCo(), -1, 1L);
                } else {
                    this.eHW();
                }
                return false;
            }
        }
        return true;
    }

    private void eHW() {
        this.b(this.nWD);
        if (this.nWC != null) {
            this.nWC.b(this.nWC.getParentOfType(fes_2.class));
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().d("wakfu.popupInfos", cgn_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tc("wakfu.popupInfos");
            this.nWJ = null;
            this.nWD = null;
            this.nWC = null;
        }
    }

    @Override
    public long Sn() {
        return 10L;
    }

    @Override
    public void dC(long l) {
    }

    public void b(aef_2 aef_22) {
        Object object;
        String string = "";
        if (aef_22 instanceof bmx_0) {
            string = nWG;
            this.nWF = "describedSpell";
        } else if (aef_22 instanceof ffV || aef_22 instanceof bgv_2 || aef_22 instanceof bea_0 || aef_22 instanceof btx) {
            ffV ffV2 = null;
            if (aef_22 instanceof ffV) {
                object = (bgv_2)((ffV)aef_22).dOg();
                ffV2 = (ffV)aef_22;
            } else if (aef_22 instanceof bgv_2) {
                object = (bgv_2)aef_22;
            } else if (aef_22 instanceof bea_0) {
                object = (bgv_2)((bea_0)aef_22).getItem().dOg();
            } else if (aef_22 instanceof btx) {
                object = ((btx)aef_22).duo();
            } else {
                return;
            }
            beg_1 beg_12 = ((bgv_2)object).dSz();
            ArrayList<String> arrayList = beg_12.dSI();
            ArrayList<String> arrayList2 = beg_12.dSG();
            string = arrayList2 == null && arrayList == null ? nWI : nWH;
            this.nWF = "itemPopupDetail";
        }
        if (this.nWF != null && !this.nWF.isEmpty() && aef_22 != null && !aef_22.equals(fse_1.gFu().vY(this.nWF))) {
            fse_1.gFu().f(this.nWF, aef_22);
        }
        if (!string.isEmpty() && !string.equals(this.nWJ)) {
            object = fyw_0.gqw().gqC().uR("worldAndFightBarDialog");
            if (object != null) {
                this.nWC = (frx_1)((fhs_2)object).uH(string);
            }
            this.nWJ = string;
        }
    }
}

