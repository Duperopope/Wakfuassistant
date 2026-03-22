/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from cYE
 */
public class cye_1
implements adi_1 {
    protected static final Logger nYR = Logger.getLogger(cye_1.class);
    private static final cye_1 nYS = new cye_1();
    private bIZ nYT;
    private fis_1 nYU;
    private final ArrayList<cyg_1> nYV = new ArrayList();
    private final LinkedList<cyf_1> nYW = new LinkedList();

    public static cye_1 eYk() {
        return nYS;
    }

    public void eYl() {
        fse_1.gFu().f("petBubbleMessage", (Object)null);
        if (this.nYU != null) {
            this.nYU.run(null);
            this.nYU = null;
        }
    }

    public fis_1 eYm() {
        return this.nYU;
    }

    public void a(fis_1 fis_12) {
        if (this.nYU != null) {
            nYR.error((Object)"[LD/GD] Attention ! On vient d'\u00e9craser un listener non consum\u00e9 sur le dialogue du g\u00e9lutin !");
        }
        this.nYU = fis_12;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18099: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                boolean bl = dae_02.bCu();
                this.a(string, bl, dae_02.bCp(), bjb_0.Hj(dae_02.bCo()));
                return false;
            }
            case 19225: {
                this.eYp();
                return false;
            }
            case 19389: {
                cAY.eHc().nP(600195L);
                bok_2 bok_22 = (bok_2)fse_1.gFu().vY("tutorialMessageView");
                dcg_0 dcg_02 = (dcg_0)aam_22;
                bok_2 bok_23 = new bok_2(dcg_02.dXz(), dcg_02.bAD(), dcg_02.eGm(), dcg_02.aeV(), dcg_02.egI());
                if (bok_22 != null && bok_22.equals(bok_23)) {
                    return false;
                }
                fse_1.gFu().f("tutorialMessageView", bok_23);
                if (bok_22 != null) {
                    this.b(bok_22);
                }
                this.c(bok_23);
                return false;
            }
            case 17279: {
                bok_2 bok_24 = (bok_2)fse_1.gFu().vY("tutorialMessageView");
                fse_1.gFu().f("tutorialMessageView", (Object)null);
                if (bok_24 != null) {
                    this.b(bok_24);
                }
                return false;
            }
        }
        return true;
    }

    private void b(bok_2 bok_22) {
        int n = bok_22.egI();
        if (n != -1) {
            bqm_0.jbp.b(new brn_1(n));
        }
        for (int i = this.nYV.size() - 1; i >= 0; --i) {
            this.nYV.get(i).b(bok_22);
        }
        this.eYn();
    }

    private void eYn() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("tutorialMessageDialog");
        faw_2 faw_22 = (faw_2)fhs_22.uH("particleContainer");
        faw_22.getAppearance().grb();
    }

    private void c(bok_2 bok_22) {
        for (int i = this.nYV.size() - 1; i >= 0; --i) {
            this.nYV.get(i).c(bok_22);
        }
        this.eYo();
    }

    private void eYo() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("tutorialMessageDialog");
        faw_2 faw_22 = (faw_2)fhs_22.uH("particleContainer");
        faw_22.getAppearance().grb();
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile("6001057.xps");
        fka_12.setAlignment(faa_2.tLK);
        fka_12.setFollowBorders(true);
        fka_12.setSpeed(1000.0f);
        fka_12.setTurnNumber(1);
        faw_22.getAppearance().d(fka_12);
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
            cyf_1 cyf_12;
            fse_1.gFu().f("petBubbleMessage", (Object)null);
            fse_1.gFu().f("tutorialMessageView", (Object)null);
            this.nYT = new bIZ();
            fyw_0.gqw().d("wakfu.petDialog", cgl_2.class);
            while ((cyf_12 = this.nYW.poll()) != null) {
                this.nYT.a(cyf_12);
            }
            ccj_2.g("tutorialMessageDialog", 139280L);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nYV.clear();
            this.nYT.clean();
            this.nYT = null;
            this.nYU = null;
            fyw_0.gqw().tc("wakfu.petDialog");
            fyw_0.gqw().tl("tutorialMessageDialog");
            cdv_0.euj().e(this);
        }
    }

    public void a(String string, boolean bl, long l, bjb_0 bjb_02) {
        if (this.nYT == null) {
            this.nYW.add(new cyf_1(string, bl, l, bjb_02));
            return;
        }
        this.nYT.a(new cyf_1(string, bl, l, bjb_02));
    }

    public void eYp() {
        this.nYT.dZU();
    }

    public bIZ eYq() {
        return this.nYT;
    }

    public boolean a(cyg_1 cyg_12) {
        return this.nYV.add(cyg_12);
    }

    public boolean b(cyg_1 cyg_12) {
        return this.nYV.remove(cyg_12);
    }
}

