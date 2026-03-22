/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYP
 */
public class cyp_2
implements adi_1 {
    protected static final Logger nZn = Logger.getLogger(cyp_2.class);
    private static final cyp_2 nZo = new cyp_2();
    private alx_2 ikv;

    public static cyp_2 eYz() {
        return nZo;
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
            if (!fse_1.gFu().dp("isInExterior")) {
                return;
            }
            this.ikv = new cyq_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("weather.manager", boh_1.ehH());
            ccj_2.g("weatherInfoSmallDialog", 32768L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("weather.manager");
            fyw_0.gqw().tl("weatherInfoSmallDialog");
        }
    }
}

