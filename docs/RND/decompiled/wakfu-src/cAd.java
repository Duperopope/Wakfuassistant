/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cAd
implements aaq_2<coy_0> {
    private static final Logger mnv = Logger.getLogger(cAd.class);

    @Override
    public boolean a(coy_0 coy_02) {
        long l = coy_02.KU();
        bgy bgy2 = bvz_0.ju(l);
        if (bgy2 == null || !bgy2.bvY()) {
            mnv.error((Object)"Aptitude sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = coy_02.aKU();
        eHZ eHZ2 = eHN.ex(byArray);
        bgy2.a(eHZ2);
        bgy2.f(bgy2.dmQ());
        return false;
    }

    @Override
    public int bkq() {
        return 13132;
    }
}

