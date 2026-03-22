/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.zaap.ZaapParametersSources
 *  org.apache.log4j.Logger
 */
import com.ankama.zaap.ZaapParametersSources;
import org.apache.log4j.Logger;

/*
 * Renamed from baF
 */
public class baf_0
implements afl<aie_0> {
    static final Logger hyY = Logger.getLogger(baf_0.class);
    public static final baf_0 hyZ = new baf_0();
    aie_0 hza;

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.zaapUserInfo", new Object[0]);
    }

    @Override
    public void a(aie_0 aie_02) {
        this.hza = aie_02;
        boolean bl = fse_1.gFu().dp("demo");
        if (bl) {
            hyY.info((Object)"Demo mode. No zaap available");
            this.hza.b(this);
            return;
        }
        if (bMX.kAi.blc()) {
            hyY.info((Object)("Steam mode." + String.valueOf(euN.class) + " are useless"));
            this.hza.b(this);
            return;
        }
        ZaapParametersSources zaapParametersSources = euG.fdi();
        this.a(zaapParametersSources);
    }

    @Override
    private void a(ZaapParametersSources zaapParametersSources) {
        hyY.info((Object)("Default mode. Retrieve " + String.valueOf(euN.class)));
        baf_0 baf_02 = this;
        euG.ors.a(new bag_0(this, baf_02), zaapParametersSources);
    }
}

