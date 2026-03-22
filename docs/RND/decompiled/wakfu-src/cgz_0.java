/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgZ
 */
final class cgz_0
implements aaq_2<crs_0> {
    private static final Logger lTV = Logger.getLogger(cgz_0.class);

    cgz_0() {
    }

    @Override
    public boolean a(crs_0 crs_02) {
        long l = crs_02.aXi();
        long l2 = crs_02.aXj();
        bgy bgy2 = bgg_0.dlO().ju(l);
        bgy bgy3 = bgg_0.dlO().ju(l2);
        if (bgy2 != null) {
            bgy2.gc(true);
            bgy2.fM(false);
        }
        if (bgy3 != null) {
            bgy3.gc(false);
            bgy3.fM(true);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13229;
    }
}

