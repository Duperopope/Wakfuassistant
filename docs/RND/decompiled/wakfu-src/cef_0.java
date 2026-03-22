/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cef
 */
public final class cef_0
implements aaq_2<csf_0> {
    private static final Logger lRV = Logger.getLogger(cef_0.class);

    @Override
    public boolean a(csf_0 csf_02) {
        csb_1.nEA.fY(false);
        if (csf_02.eBn() != ejv_0.qzL) {
            lRV.error((Object)("[Account chest] Error when requesting account chest compartment=" + String.valueOf((Object)csf_02.eBn())));
            csb_1.a(csf_02.eBn());
            return false;
        }
        csb_1.nEA.f(csf_02.eBs());
        return false;
    }

    @Override
    public int bkq() {
        return 12764;
    }
}

