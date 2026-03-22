/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUg
 */
public class cug_1
implements adi_1 {
    protected static final Logger nLt = Logger.getLogger(cug_1.class);
    private static final cug_1 nLu = new cug_1();
    private alx_2 ikv;

    public static cug_1 eRu() {
        return nLu;
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
        if (bl) {
            return;
        }
        fse_1.gFu().f("emotesInventory", bbe_0.hAP);
        this.ikv = new cuh_1(this);
        fyw_0.gqw().a(this.ikv);
        ccj_2.g("emotesInventoryDialog", 32768L);
        fyw_0.gqw().d("wakfu.emotesInventory", cew_1.class);
        cAY.eHc().nP(600012L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().vX("emotesInventory");
        fse_1.gFu().vX("overSmiley");
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl("emotesInventoryDialog");
        fyw_0.gqw().tc("wakfu.emotesInventory");
        cAY.eHc().nP(600013L);
    }

    public void eRv() {
        if (aue_0.cVJ().c(this)) {
            aue_0.cVJ().b(this);
        } else {
            aue_0.cVJ().a(this);
        }
    }
}

