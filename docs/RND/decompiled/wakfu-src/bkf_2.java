/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkF
 */
public class bkf_2
extends bkb_0 {
    protected static final Logger irv = Logger.getLogger(bkf_2.class);
    private fqy_0 ipI;
    private long cwe;
    private final acd_1 irw;

    public bkf_2(int n, int n2, short s) {
        this.irw = new acd_1(n, n2, s);
    }

    public long Tz() {
        return this.cwe;
    }

    public void fY(long l) {
        this.cwe = l;
    }

    @Override
    public short dsm() {
        return 26;
    }

    @Override
    public boolean dsn() {
        return true;
    }

    @Override
    public void bIH() {
        irv.info((Object)"Lancement occupation SEARCH_TREASURE");
        cxs_2.nXl.dsI();
        this.iqd.i(false, true);
        fqy_0 fqy_02 = fqz_0.giz().YY(this.ipI.clf());
        if (fqy_02 != null) {
            bdj_2 bdj_22 = this.iqd.ddI();
            abi_1 abi_12 = bdj_22.bqg().y(this.irw);
            bdj_22.a(abi_12);
            blq_0.a(bdj_22, fqy_02);
        }
        this.iqd.dcM().lG(this.cwe);
        this.iqd.a(this);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        this.e((byte)3, bl2);
        return true;
    }

    @Override
    public boolean dsd() {
        this.e((byte)2, true);
        return true;
    }

    private void e(byte by, boolean bl) {
        Object object;
        cxs_2.nXl.dsI();
        if (bl) {
            object = new cmo_0();
            ((cmo_0)object).dw(by);
            ((cmo_0)object).cD((short)26);
            aue_0.cVJ().etu().d(object);
        }
        if (((ads_0)(object = this.iqd.ddI())).bvF() == null) {
            blq_0.b((ads_0)object, this.ipI);
        }
        irv.info((Object)"On termine l'occupation SEARCH_TREASURE");
        this.iqd.dcM().ebM();
    }

    public void b(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }
}

