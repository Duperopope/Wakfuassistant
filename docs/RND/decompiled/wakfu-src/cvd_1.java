/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cVd
 */
public class cvd_1
implements adi_1 {
    protected static final Logger nOG = Logger.getLogger(cvd_1.class);
    private static final cvd_1 nOH = new cvd_1();
    private fka_1 jjX;
    private ArrayList<fzc> nOI;
    buW nOJ;
    eyb_2 nOK = eyb_2.rJZ;
    private alx_2 ikv;

    public static cvd_1 eTy() {
        return nOH;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17494: {
                short s = (short)(this.nOJ.dJN() - 1);
                this.aW(s);
                return false;
            }
            case 19486: {
                short s = (short)(this.nOJ.dJN() + 1);
                this.aW(s);
                return false;
            }
        }
        return true;
    }

    private fgo_2 getTableModel() {
        fgo_2 fgo_22 = new fgo_2();
        fgo_22.a(new cve_2(this));
        return fgo_22;
    }

    public void aW(short s) {
        ckr_0 ckr_02 = new ckr_0();
        ckr_02.bv(s);
        ckr_02.do(this.nOK == null ? eyb_2.rJZ.aJr() : this.nOK.aJr());
        aue_0.cVJ().etu().d(ckr_02);
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
            if (this.nOJ == null) {
                nOG.error((Object)"Impossible de charger l'affichage du ladder de guilde, il manque les donn\u00e9es !");
                return;
            }
            this.ikv = new cvf_1(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("guildLadder", this.nOJ);
            fse_1.gFu().f("dungeonLadderBackgroundImage", auc_0.cVq().zQ(beV.hOX.d()));
            ccj_2.g("guildLadderDialog", 256L);
            this.bzo();
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("guildLadderDialog");
            if (fhs_22 != null) {
                fgo_2 fgo_22 = this.getTableModel();
                fdq_1 fdq_12 = (fdq_1)fhs_22.uH("ladderTable");
                if (fdq_12 != null) {
                    fdq_12.setTableModel(fgo_22);
                }
            }
            fyw_0.gqw().d("wakfu.guildLadder", cev_2.class);
            cAY.eHc().nP(600120L);
        }
    }

    private void bzo() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("guildLadderDialog");
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        fes_2 fes_22 = (fes_2)fhs_22.uH("background");
        if (fes_22 != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH("closeButton")) != null) {
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
            this.nOJ = null;
            this.nOK = null;
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("guildLadder");
            fse_1.gFu().vX("dungeonLadderBackgroundImage");
            fyw_0.gqw().tl("guildLadderDialog");
            fyw_0.gqw().tc("wakfu.guildLadder");
            cAY.eHc().nP(600121L);
        }
    }

    public void a(buW buW2) {
        this.nOJ = buW2;
        aue_0.cVJ().a(cvd_1.eTy());
    }

    public buW eTz() {
        return this.nOJ;
    }

    public eyb_2 eTA() {
        return this.nOK;
    }
}

