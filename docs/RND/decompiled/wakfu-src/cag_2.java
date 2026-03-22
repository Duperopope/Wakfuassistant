/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cag
 */
public class cag_2
extends fsu {
    private static final Logger lFz = Logger.getLogger(cag_2.class);
    private final cai_2 lFA = new cai_2();
    private final cay_2 lFB = new cay_2(9, 9);
    private cak_1[] lFC;

    public cag_2(int n) {
        super(n);
    }

    @Override
    public void r(apl_1 apl_12) {
        super.r(apl_12);
        this.lFA.r(apl_12);
        this.lFB.r(apl_12);
        this.A(apl_12);
    }

    private void A(apl_1 apl_12) {
        int n = apl_12.aIz() & 0xFFFF;
        this.lFC = new cak_1[n];
        for (int i = 0; i < n; ++i) {
            this.lFC[i] = cak_1.B(apl_12);
        }
    }

    public cai_2 eqT() {
        return this.lFA;
    }

    cay_2 eqU() {
        return this.lFB;
    }

    cak_1[] eqV() {
        return this.lFC;
    }
}

