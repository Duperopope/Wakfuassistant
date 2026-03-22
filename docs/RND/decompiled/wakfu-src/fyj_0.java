/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fyJ
 */
public class fyj_0
extends fkq_2 {
    private static Logger oO = Logger.getLogger(fyj_0.class);
    private faa_2 tCX = null;

    @Override
    public void setup(fkq_1 fkq_12) {
        if (fkq_12 instanceof fyi_0) {
            ((fyi_0)fkq_12).setAlign(this.tCX);
        }
    }

    public void setAlignment(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    public faa_2 getAlignment() {
        return this.tCX;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fyj_0 fyj_02 = (fyj_0)fhi_22;
        super.a(fyj_02);
        fyj_02.tCX = this.tCX;
    }
}

