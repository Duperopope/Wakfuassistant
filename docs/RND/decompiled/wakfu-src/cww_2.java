/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cWW
 */
public class cww_2
implements adi_1 {
    protected static final Logger nTY = Logger.getLogger(cww_2.class);
    private static final cww_2 nTZ = new cww_2();
    private ArrayList<bsq_2> nUa;
    private alx_2 ikv;

    public static cww_2 eWq() {
        return nTZ;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16891: {
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                String string2 = aum_0.cWf().a(39, (long)n, new Object[0]);
                fiq_2.gCw().d(fik_2.a(string -> {
                    cmn_0 cmn_02 = new cmn_0();
                    cmn_02.Le(n);
                    aue_0.cVJ().etu().d(cmn_02);
                    aue_0.cVJ().b(this);
                }).l("question.nationSelectionConfirm", string2).vG(ccp_2.mRE.byf()));
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
            if (this.nUa == null) {
                nTY.error((Object)"Nations null on ne peut pas afficher le panneau !");
                return;
            }
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            fse_1.gFu().f("nationSelectionList", this.nUa);
            ahv_2 ahv_22 = null;
            if (bgt_02.dnG() < 1) {
                ahv_22 = new ahv_2().e(awx_2.dnJ);
                ahv_22.c(aum_0.cWf().c("levelSup", 1));
            } else if (bgt_02.Xt() != 0) {
                ahv_22 = new ahv_2().e(awx_2.dnJ);
                ahv_22.c(aum_0.cWf().c("nationSelection.alreadySet", new Object[0]));
            }
            fse_1.gFu().f("nationSelectionDisabledMessage", ahv_22 == null ? ahv_22 : ahv_22.ceL());
            fse_1.gFu().f("selectedNation", (Object)null);
            this.ikv = new cwx_1(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("nationSelectionPanelDialog", 256L);
            fyw_0.gqw().d("wakfu.nationSelectionPanel", cfd_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nUa = null;
            fse_1.gFu().vX("nationSelectionList");
            fse_1.gFu().vX("selectedNation");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("nationSelectionPanelDialog");
            fyw_0.gqw().tc("wakfu.nationSelectionPanel");
        }
    }

    public void X(ArrayList<cts_0> arrayList) {
        this.nUa = new ArrayList();
        for (cts_0 cts_02 : arrayList) {
            this.nUa.add(new bsq_2(cts_02.Xt(), cts_02.eCG(), cts_02.eCH(), cts_02.eCI(), cts_02.emI(), cts_02.eCJ()));
        }
    }
}

