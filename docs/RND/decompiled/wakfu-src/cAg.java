/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cAg
implements aaq_2<cpd> {
    private static final Logger mnx = Logger.getLogger(cAg.class);

    @Override
    public boolean a(cpd cpd2) {
        long l = cpd2.KU();
        bgy bgy2 = bvz_0.ju(l);
        if (bgy2 == null || !bgy2.bvY()) {
            mnx.error((Object)"Build sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = cpd2.aKU();
        eIj eIj2 = eIl.ez(byArray);
        eIj eIj3 = bgy2.dnK().PR(eIj2.wp());
        if (eIj3 == null) {
            mnx.error((Object)"Build sheet notification message received for an unknown sheet");
            return false;
        }
        eIj3.a(eIj2);
        if (eIj3.wp() == bgy2.dnK().wM()) {
            bgy2.f(bgy2.dmQ());
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12789;
    }
}

