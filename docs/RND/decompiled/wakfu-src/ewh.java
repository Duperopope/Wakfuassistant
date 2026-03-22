/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ewh
extends WK {
    private static final Logger oyi = Logger.getLogger(ewh.class);
    private static final wt_0[] oyj = wt_0.blX();
    private int brs;
    private int brt;

    @Override
    public void a(apl_1 apl_12) {
        super.a(apl_12);
        this.brs = apl_12.aIy() & 0xFF;
        this.brt = apl_12.aIy() & 0xFF;
    }

    @Override
    public int bmm() {
        return this.brs;
    }

    @Override
    public int bmn() {
        return this.brt;
    }

    public boolean fb(int n, int n2) {
        int n3 = this.a(n, n2, oyj, 0);
        if (n3 == 0) {
            return true;
        }
        if (n3 == 1) {
            return ewh.oyj[0].ban == 0;
        }
        return false;
    }
}

