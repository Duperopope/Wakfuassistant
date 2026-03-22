/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cdt
 */
public class cdt_0
implements adi_1 {
    protected static final Logger lQD = Logger.getLogger(cdt_0.class);
    private static final cdt_0 lQE = new cdt_0();

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13503: {
                ctu ctu2 = (ctu)aam_22;
                aUQ.cWp().ts(ctu2.exS());
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public static cdt_0 eub() {
        return lQE;
    }
}

