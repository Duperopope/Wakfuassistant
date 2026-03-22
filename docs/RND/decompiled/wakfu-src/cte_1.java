/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTe
 */
public class cte_1
implements adi_1 {
    private static final Logger nIh = Logger.getLogger(cte_1.class);
    private static final cte_1 nIi = new cte_1();
    private int nIj = 0;
    private alx_2 ikv;

    public static cte_1 ePp() {
        return nIi;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16394: {
                fiq_2.gCw().d(fik_2.a(string -> this.end()).l("question.restoreChatOptions", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
        }
        return true;
    }

    public void end() {
        aue_0.cVJ().b(csz_1.ePn());
        ((bsg_1)aie_0.cfn().bmH()).end();
        aPt.cAg().cAx();
        try {
            aym_0.cYm();
        }
        catch (Exception exception) {
            nIh.error((Object)"immpossible de r\u00e9tablir les param\u00e8tres par d\u00e9faut de chat !", (Throwable)exception);
        }
        aue_0.cVJ().a(csz_1.ePn());
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
            this.ikv = new ctf_1(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("chat.editedView", (Object)null);
            fse_1.gFu().f("chat.viewOver", (Object)null);
            fse_1.gFu().f("chat.colorEditedObject", (Object)null);
            fhv_1 fhv_12 = ccj_2.g("chatOptionsDialog", 256L);
            if (fhv_12 != null) {
                ((fdh_1)fhv_12.getElementMap().uH("tabbedContainer")).setSelectedTabIndex(this.nIj);
            }
            fyw_0.gqw().d("wakfu.chatOptions", cdq_1.class);
            csz_1.ePn().kf(true);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            csz_1.ePn().kf(false);
            this.nIj = 0;
            fse_1.gFu().vX("chat.editedView");
            fse_1.gFu().vX("chat.viewOver");
            fse_1.gFu().vX("chat.colorEditedObject");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("chatOptionsDialog");
            fyw_0.gqw().tc("wakfu.chatOptions");
        }
    }

    public void setSelectedTabIndex(int n) {
        this.nIj = n;
    }
}

