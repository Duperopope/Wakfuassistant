/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bky
 */
public class bky_0
extends bkb_0 {
    protected static final Logger ire = Logger.getLogger(bky_0.class);
    private fqy_0 ipI;
    private long cwe;
    private int ejc;
    private final acd_1 irf;

    public bky_0(int n, int n2) {
        this.irf = new acd_1(n, n2);
    }

    public long Tz() {
        return this.cwe;
    }

    public void fY(long l) {
        this.cwe = l;
    }

    public void Dy(int n) {
        this.ejc = n;
    }

    @Override
    public short dsm() {
        return 2;
    }

    @Override
    public boolean dsn() {
        return true;
    }

    @Override
    public void bIH() {
        ire.info((Object)"Lancement occupation PLANT");
        cxt_2.eXB().dsI();
        this.iqd.i(false, true);
        fqy_0 fqy_02 = fqz_0.giz().YY(this.ipI.clf());
        if (fqy_02 != null) {
            bdj_2 bdj_22 = this.iqd.ddI();
            abi_1 abi_12 = bdj_22.bqg().y(this.irf);
            bdj_22.a(abi_12);
            blq_0.a(bdj_22, fqy_02);
        }
        this.iqd.dcM().C(this.cwe, this.ejc);
        this.iqd.a(this);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        this.e((byte)3, bl2);
        aue_0.cVJ().b(cxt_2.eXB());
        return true;
    }

    @Override
    public boolean dsd() {
        this.e((byte)2, true);
        return true;
    }

    private void e(byte by, boolean bl) {
        Object object;
        cxt_2.eXB().dsI();
        if (bl) {
            object = new cmo_0();
            ((cmo_0)object).dw(by);
            ((cmo_0)object).cD((short)2);
            aue_0.cVJ().etu().d(object);
        }
        if (((ads_0)(object = this.iqd.ddI())).bvF() == null) {
            blq_0.b((ads_0)object, this.ipI);
        }
        ire.info((Object)"On termine l'occupation PLANT");
        this.iqd.dcM().ebM();
    }

    public void b(fqy_0 fqy_02) {
        this.ipI = fqy_02;
    }
}

