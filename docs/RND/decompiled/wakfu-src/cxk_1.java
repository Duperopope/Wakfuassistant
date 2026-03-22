/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cXK
 */
public class cxk_1
implements adi_1 {
    private static final cxk_1 nWQ = new cxk_1();
    public static final int nWR = 0;
    public static final int nWS = 1;
    public static final int nWT = 2;
    private static final Logger nWU = Logger.getLogger(cxk_1.class);
    private bJr jmi;
    private alx_2 ikv;
    private adp_0 nRy;

    public static cxk_1 eXu() {
        return nWQ;
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

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.nRy = new cxl_2(this);
            bgt_02.ddI().a(this.nRy);
            this.ikv = new cxm_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("protectorViewMode", 0);
            ccj_2.g("protectorViewDialog", 32768L);
            fyw_0.gqw().d("wakfu.protectorView", cgq_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().cVK().ddI().b(this.nRy);
            this.nRy = null;
            fse_1.gFu().vX("protectorViewMode");
            fyw_0.gqw().tc("wakfu.protectorView");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("protectorViewDialog");
        }
    }
}

