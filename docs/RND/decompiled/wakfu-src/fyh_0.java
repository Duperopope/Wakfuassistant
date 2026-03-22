/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fyH
 */
public class fyh_0
extends fkq_2 {
    private static Logger oO = Logger.getLogger(fyh_0.class);
    private fzY tCW = null;

    @Override
    public void setup(fkq_1 fkq_12) {
        if (fkq_12 instanceof fyg_0) {
            ((fyg_0)fkq_12).setAlignment(this.tCW);
        }
    }

    public void setAlignment(fzY fzY2) {
        this.tCW = fzY2;
    }

    public fzY getAlignment() {
        return this.tCW;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fyh_0 fyh_02 = (fyh_0)fhi_22;
        super.a(fhi_22);
        fyh_02.tCW = this.tCW;
    }
}

