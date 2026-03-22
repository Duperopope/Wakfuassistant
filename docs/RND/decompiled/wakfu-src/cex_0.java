/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cex
 */
final class cex_0
implements aaq_2<cpr_0> {
    private static final Logger lSj = Logger.getLogger(cex_0.class);

    cex_0() {
    }

    @Override
    public boolean a(cpr_0 cpr_02) {
        long l = cpr_02.KU();
        eMW eMW2 = eMX.eC(cpr_02.exI());
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            return false;
        }
        if (!((exP)t).doa().isPresent()) {
            return false;
        }
        fte_0 fte_02 = ((exP)t).doa().get();
        fte_02.a(eMW2);
        bog.iMI.dAz();
        return false;
    }

    @Override
    public int bkq() {
        return 13538;
    }
}

