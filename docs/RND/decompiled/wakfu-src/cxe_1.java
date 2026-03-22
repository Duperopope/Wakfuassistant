/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cXE
 */
public class cxe_1
implements adi_1 {
    private static final cxe_1 nWK = new cxe_1();
    private static final Logger nWL = Logger.getLogger(cxe_1.class);

    public static cxe_1 eXq() {
        return nWK;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18865: {
                if (bTl.lnl.ctn() != -1) {
                    nWL.info((Object)"On a push\u00e9 un protecteur statique, on ne l'enl\u00e8ve pas \u00e0 l'entr\u00e9e du territoire (retir\u00e9 manuelllement)");
                    return false;
                }
                this.clear();
                return false;
            }
        }
        return true;
    }

    public void clear() {
        bTj.eno().h(null);
        bTl.lnl.Ck(-1);
    }

    @Override
    public long Sn() {
        return 3L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            boh_1 boh_12 = boh_1.ehH();
            bTj bTj2 = bTl.lnl.ctn() == -1 ? bTj.eno() : bTl.lnl;
            fse_1.gFu().f("weather.manager", boh_12);
            fse_1.gFu().f("protector", bTj2);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().vX("protector");
            cdv_0.euj().e(this);
        }
    }

    public void eXr() {
        if (aue_0.cVJ().c(cyn_1.eYy())) {
            aue_0.cVJ().b(cyn_1.eYy());
        }
        if (aue_0.cVJ().c(cud_2.eRs())) {
            aue_0.cVJ().b(cud_2.eRs());
        }
        fse_1.gFu().f("challengeDetailsVisible", false);
    }
}

