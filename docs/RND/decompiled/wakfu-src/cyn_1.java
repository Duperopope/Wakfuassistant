/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYN
 */
public class cyn_1
implements adi_1 {
    protected static final Logger nZl = Logger.getLogger(cyn_1.class);
    private static final cyn_1 nZm = new cyn_1();
    private alx_2 ikv;

    public static cyn_1 eYy() {
        return nZm;
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
            if (!fse_1.gFu().dp("isInExterior") || bTj.eno().enj()) {
                return;
            }
            this.ikv = new cyo_1(this);
            boh_1.ehH().ehL();
            aue_0.cVJ().etu().d(new cjv_0());
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("weather.manager", boh_1.ehH());
            ccj_2.g("weatherInfoDialog", 32768L);
            fyw_0.gqw().d("wakfu.weatherInformation", chv_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("weatherInfoDialog");
            fyw_0.gqw().tc("wakfu.weatherInformation");
        }
    }
}

