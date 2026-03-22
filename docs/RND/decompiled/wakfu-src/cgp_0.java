/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgP
 */
final class cgp_0
implements aaq_2<cyc> {
    private static final Logger lTQ = Logger.getLogger(cgp_0.class);

    cgp_0() {
    }

    @Override
    public boolean a(cyc cyc2) {
        long l = cyc2.EW();
        long l2 = cyc2.Ya();
        long l3 = cyc2.HP();
        bhJ bhJ2 = (bhJ)fcL.rUh.sw(l);
        if (bhJ2 == null) {
            return false;
        }
        if (l2 == 0L) {
            bhJ2.dpI().clear();
            bhJ2.jK(0L);
        } else {
            bhJ2.dpI().jQ(l2);
            bhJ2.jK(l3);
        }
        bvk.dJZ().bkZ();
        fse_1.gFu().a((aef_2)bhJ2, "hasGuild");
        return false;
    }

    @Override
    public int bkq() {
        return 15269;
    }
}

