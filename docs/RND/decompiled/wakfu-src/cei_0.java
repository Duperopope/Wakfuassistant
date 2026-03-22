/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from cei
 */
public final class cei_0
implements aaq_2<csi_0> {
    private static final Logger lRY = Logger.getLogger(cei_0.class);

    @Override
    public boolean a(csi_0 csi_02) {
        csb_1.nEA.fY(false);
        if (csi_02.eBn() != ejv_0.qzL) {
            lRY.error((Object)("[Account chest] Error when swapping items in account chest=" + String.valueOf((Object)csi_02.eBn())));
            csb_1.a(csi_02.eBn());
            return false;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null || !Objects.equals(bky_12.getId(), csi_02.eBq())) {
            return false;
        }
        boolean bl = bky_12.q(csi_02.eBx(), csi_02.eBy());
        if (!bl) {
            lRY.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13598;
    }
}

