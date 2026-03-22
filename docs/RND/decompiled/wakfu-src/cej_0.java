/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cej
 */
public final class cej_0
implements aaq_2<csj_0> {
    private static final Logger lRZ = Logger.getLogger(cej_0.class);

    @Override
    public boolean a(csj_0 csj_02) {
        if (csj_02.eBn() != ejv_0.qzL) {
            lRZ.error((Object)("[Account chest] Error when receiving account chest compartment list=" + String.valueOf((Object)csj_02.eBn())));
            csb_1.a(csj_02.eBn());
            return false;
        }
        csb_1.nEA.d(csj_02.eBz());
        csb_1.e(csj_02.eBz());
        return false;
    }

    @Override
    public int bkq() {
        return 12075;
    }
}

