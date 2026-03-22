/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.zaap.ZaapParametersSources
 *  org.apache.log4j.Logger
 */
import com.ankama.zaap.ZaapParametersSources;
import org.apache.log4j.Logger;

public class bae {
    static final Logger hyM = Logger.getLogger(bae.class);
    public static final bae hyN = new bae();

    public void cZd() {
        boolean bl = fse_1.gFu().dp("demo");
        if (bl) {
            hyM.info((Object)"Demo mode. Pushing normal auth frame.");
            euG.fdj();
            return;
        }
        if (bMX.kAi.blc()) {
            hyM.info((Object)"Steam mode. Connecting to dispatch");
            euG.eNZ();
            return;
        }
        ZaapParametersSources zaapParametersSources = euG.fdi();
        this.a(zaapParametersSources);
    }

    private void a(ZaapParametersSources zaapParametersSources) {
        hyM.info((Object)"Default mode. Starting connection to Zaap");
        euG.ors.a(new baf(this), zaapParametersSources);
    }
}

