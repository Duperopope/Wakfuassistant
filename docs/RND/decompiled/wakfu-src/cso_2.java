/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cSo
 */
public class cso_2
implements adi_1 {
    protected static final Logger nFt = Logger.getLogger(cso_2.class);
    private static final cso_2 nFu = new cso_2();
    private beW nFv;
    private boolean nFw;
    private alx_2 ikv;

    public static cso_2 eOa() {
        return nFu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17836: {
                this.nFv.dfp();
                this.ka(true);
                return false;
            }
            case 16306: {
                this.nFv.dfq();
                this.ka(true);
                return false;
            }
        }
        return true;
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
            if (this.nFv == null) {
                nFt.error((Object)"Impossible de charger l'affichage, il manque les donn\u00e9es !");
                return;
            }
            this.ikv = new csp_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("backgroundDisplay", this.nFv);
            ccj_2.g("backgroundDisplayDialog", 256L);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("backgroundDisplayDialog");
            beV beV2 = this.nFv.dff();
            fzv fzv2 = (fzv)fhs_22.uH("margin1");
            this.a(fzv2, beV2.dfi(), beV2.dfj());
            fzv fzv3 = (fzv)fhs_22.uH("margin2");
            this.a(fzv3, beV2.dfj(), beV2.dfi());
            this.ka(false);
            fyw_0.gqw().d("wakfu.background", cdq_2.class);
            cAY.eHc().nP(beV2.dfk());
        }
    }

    private void a(fzv fzv2, int n, int n2) {
        if (fzv2 != null && this.nFv != null) {
            Insets insets = new Insets(50, n, 50, n2);
            faw_2 faw_22 = fzv2.getParentOfType(faw_2.class);
            faw_22.getAppearance().setMargin(insets);
            faw_22.getContainer().getLayoutManager().a(faw_22);
        }
    }

    private void ka(boolean bl) {
        int n;
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("backgroundDisplayDialog");
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        fes_2 fes_22 = null;
        if (!bl) {
            fes_22 = (fes_2)fhs_22.uH("background");
            if (fes_22 != null) {
                arrayList.add(fes_22.getAppearance());
            }
            if ((fes_22 = (fes_2)fhs_22.uH("closeButton")) != null) {
                arrayList.add(fes_22.getAppearance());
            }
            if ((fes_22 = (fes_2)fhs_22.uH("previousButton")) != null) {
                arrayList.add(fes_22.getAppearance());
            }
            if ((fes_22 = (fes_2)fhs_22.uH("nextButton")) != null) {
                arrayList.add(fes_22.getAppearance());
            }
        }
        for (n = 1; n <= 10; ++n) {
            fes_22 = (fes_2)fhs_22.uH("text" + n);
            if (fes_22 == null) continue;
            arrayList.add(fes_22.getAppearance());
        }
        for (n = 1; n <= 6; ++n) {
            fes_22 = (fes_2)fhs_22.uH("image" + n);
            if (fes_22 == null) continue;
            arrayList.add(fes_22.getAppearance());
        }
        if (fes_22 != null) {
            awx_2 awx_22 = new awx_2(awx_2.dnC.aTn());
            awx_2 awx_23 = new awx_2(awx_2.dnF.aTn());
            fes_22.a(new fsz_2(awx_22, awx_23, arrayList, 0, 500, 1, abn.cdr));
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            int n = this.nFv != null ? this.nFv.dff().dfl() : 600149;
            this.nFv = null;
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("backgroundDisplay");
            fyw_0.gqw().tl("backgroundDisplayDialog");
            fyw_0.gqw().tc("wakfu.background");
            cAY.eHc().nP(n);
        }
    }

    public void Mr(int n) {
        this.I(n, true);
    }

    public void I(int n, boolean bl) {
        this.nFw = bl;
        beT beT2 = beU.hOR.BG(n);
        if (beT2 == null) {
            return;
        }
        beY[] beYArray = beT2.dfg();
        beZ[] beZArray = new beZ[beYArray.length];
        for (beY beY2 : beYArray) {
            beZArray[beY2.bEr()] = new beZ(beY2.d(), beY2.bEr(), beY2.aVt(), beY2.dfs());
        }
        this.nFv = new beW(beT2.dff(), beZArray);
    }
}

