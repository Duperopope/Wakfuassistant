/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIj
 */
public class cij_1
extends cir_1 {
    private static final Logger ndu = Logger.getLogger(cij_1.class);

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdW;
    }

    @Override
    protected void ey(int n, int n2) {
        fsb_0 fsb_02 = this.nae.getBuildingUnderMouse(n, n2);
        this.kWd = new ciw_1(fsb_02);
        this.nae.d(fsb_02);
    }
}

