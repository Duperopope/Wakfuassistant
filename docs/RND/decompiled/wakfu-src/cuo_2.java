/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cUO
 */
public class cuo_2
implements adi_1 {
    protected static final Logger nNT = Logger.getLogger(cuo_2.class);
    private static final cuo_2 nNU = new cuo_2();
    private int nNV;
    private alx_2 ikv;

    public static cuo_2 eSX() {
        return nNU;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void MZ(int n) {
        if (this.nNV == n) {
            return;
        }
        this.nNV = n;
        this.eSY();
    }

    private void eSY() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("frescoDialog");
        if (fhs_22 == null) {
            nNT.warn((Object)"Impossible de trouver l'elementMap");
            return;
        }
        fbn_2 fbn_22 = (fbn_2)fhs_22.uH("multipleImage");
        try {
            fbn_22.setParticlePath(auc_0.cVq().zt(800248));
            String string = String.format(auc_0.cVq().bS("frescoPath"), this.nNV);
            fbn_22.setImagePath(string);
        }
        catch (fu_0 fu_02) {
            nNT.warn((Object)"Probl\u00e8me de Property", (Throwable)fu_02);
        }
    }

    private void ah(int n, int n2, int n3) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("frescoDialog");
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        fes_2 fes_22 = (fes_2)fhs_22.uH("closeButton");
        if (fes_22 != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH("multipleImage")) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH("leftArrowContainer")) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH("rightArrowContainer")) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH("mainWindow")) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if (fes_22 != null) {
            awx_2 awx_22 = new awx_2(n);
            awx_2 awx_23 = new awx_2(n2);
            fes_22.a(new fsz_2(awx_22, awx_23, arrayList, 0, n3, 1, abn.cdr));
        }
    }

    private void eSZ() {
        this.ah(awx_2.dnC.aTn(), awx_2.dnF.aTn(), 1000);
        cAY.eHc().f(0.2f, 1000);
        cAY.eHc().e(0.4f, 1000);
    }

    private void eTa() {
        this.ah(awx_2.dnF.aTn(), awx_2.dnC.aTn(), 250);
        cAY.eHc().f(1.0f, 300);
        cAY.eHc().e(1.0f, 300);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cup_2(this);
            fyw_0.gqw().a(this.ikv);
            fhv_1 fhv_12 = ccj_2.g("frescoDialog", 256L);
            fhs_2 fhs_22 = fhv_12.getElementMap();
            fbn_2 fbn_22 = (fbn_2)fhs_22.uH("multipleImage");
            fes_2 fes_22 = (fes_2)fhs_22.uH("leftArrowContainer");
            fes_2 fes_23 = (fes_2)fhs_22.uH("rightArrowContainer");
            fbn_22.setImageListener(new cuq_2(this, fes_22, fes_23));
            fes_22.setVisible(false);
            this.eSY();
            this.eSZ();
            fyw_0.gqw().d("wakfu.fresco", cem_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            this.eTa();
            fyw_0.gqw().tc("wakfu.fresco");
            abg_2.bUP().a((Runnable)new cur_2(this), 250L, 1);
        }
    }
}

