/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cee
 */
public final class cee_0
implements aaq_2<cse_0> {
    private static final Logger lRU = Logger.getLogger(cee_0.class);

    @Override
    public boolean a(cse_0 cse_02) {
        csb_1.nEA.fY(false);
        if (cse_02.eBn() != ejv_0.qzL) {
            lRU.error((Object)("[Account chest] Error when removing item from account chest=" + String.valueOf((Object)cse_02.eBn())));
            csb_1.a(cse_02.eBn());
            return false;
        }
        csb_1.nEA.t(cse_02.eBq(), cse_02.eBp());
        if (cse_02.aaA() == null) {
            return false;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null) {
            return false;
        }
        if (!bky_12.jW(cse_02.aaA().LV())) {
            return false;
        }
        boolean bl = csb_1.nEA.eNG().i(cse_02.aaA().LV(), (short)cse_02.aaA().aaD());
        if (!bl) {
            lRU.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13962;
    }
}

