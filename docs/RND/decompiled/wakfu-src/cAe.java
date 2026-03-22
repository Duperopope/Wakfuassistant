/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cAe
implements aaq_2<cpb> {
    private static final Logger mnw = Logger.getLogger(cAe.class);

    @Override
    public boolean a(cpb cpb2) {
        long l = cpb2.KU();
        bgy bgy2 = bvz_0.ju(l);
        if (bgy2 == null || !bgy2.bvY()) {
            mnw.error((Object)"Build sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = cpb2.aKU();
        eIm eIm2 = eIl.ey(byArray);
        bgy2.b(eIm2);
        if (bgy2 instanceof emj_0 && aue_0.cVJ().cVK() != null) {
            ((emj_0)((Object)bgy2)).dmE().a(bgy2.dnK());
        }
        bgy2.f(bgy2.dmQ());
        return false;
    }

    @Override
    public int bkq() {
        return 13661;
    }
}

