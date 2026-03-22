/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cXu
 */
public class cxu_1
implements adi_1 {
    private static final cxu_1 nWl = new cxu_1();
    private static final Logger nWm = Logger.getLogger(cxu_1.class);
    private final bNC nWn = new cxv_1(this);
    private alx_2 ikv;

    public static cxu_1 eXd() {
        return nWl;
    }

    @Override
    public boolean b(aam_2 aam_22) {
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
            this.ikv = new cxw_1(this);
            fyw_0.gqw().a(this.ikv);
            bNB.kDS.a(this.nWn);
            fse_1.gFu().f("secrets", new bly_2());
            fse_1.gFu().f("passportViewMode", 0);
            fse_1.gFu().f("passportCategory", 0);
            fhv_1 fhv_12 = ccj_2.pd("passportDialog");
            bkt_2 bkt_22 = bkt_2.a(aue_0.cVJ().cVK(), false);
            fse_1.gFu().a("pvpLadderEntry", (Object)bkt_22, fhv_12.getElementMap());
            fyw_0.gqw().d("wakfu.passport", cgj_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tl("passportDialog");
            fyw_0.gqw().b(this.ikv);
            bNB.kDS.b(this.nWn);
            fse_1.gFu().vX("secrets");
            fyw_0.gqw().tc("wakfu.passport");
        }
    }
}

