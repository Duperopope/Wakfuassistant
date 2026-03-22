/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bRa {
    private static final Logger kYP = Logger.getLogger(bRa.class);

    public static String a(fbz_0 fbz_02) {
        aum_0 aum_02 = aum_0.cWf();
        short s = fbz_02.fSr();
        if (fbz_02 instanceof fby_0) {
            return aum_02.a(122, (long)s, new Object[0]);
        }
        if (fbz_02 instanceof fcb_0) {
            return aum_02.a(124, (long)s, new Object[0]);
        }
        if (fbz_02 instanceof fca_0) {
            return aum_02.c("haven.world.partition", new Object[0]);
        }
        kYP.error((Object)("Type de catalog entry inconnu " + String.valueOf(fbz_02.getClass())));
        return "<unknow>";
    }

    public static String a(fsd_0 fsd_02) {
        return bRa.a(fsd_02.ekD());
    }
}

