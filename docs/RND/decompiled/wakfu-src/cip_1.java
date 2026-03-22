/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cIp
 */
public class cip_1
extends cir_1
implements cpe_1 {
    private static final Logger ndH = Logger.getLogger(cip_1.class);

    @Inject
    public cip_1() {
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdW;
    }

    @Override
    protected void ey(int n, int n2) {
        fsb_0 fsb_02 = this.nae.getBuildingUnderMouse(n, n2);
        this.nae.c(fsb_02);
        if (fsb_02 == null) {
            return;
        }
        this.kWd = new cib_1(fsb_02);
    }
}

