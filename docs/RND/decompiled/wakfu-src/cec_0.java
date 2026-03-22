/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from cec
 */
public final class cec_0
implements aaq_2<csc_0> {
    private static final Logger lRS = Logger.getLogger(cec_0.class);

    @Override
    public boolean a(csc_0 csc_02) {
        csb_1.nEA.fY(false);
        if (csc_02.eBn() != ejv_0.qzL) {
            lRS.error((Object)("[Account chest] Error when adding item to account chest=" + String.valueOf((Object)csc_02.eBn())));
            csb_1.a(csc_02.eBn());
            return false;
        }
        csb_1.nEA.t(csc_02.eBo(), csc_02.eBp());
        if (csc_02.aaA() == null) {
            return false;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null || !Objects.equals(bky_12.getId(), csc_02.eBo())) {
            return false;
        }
        ffV ffV2 = fga_0.w(csc_02.aaA());
        if (ffV2 == null) {
            return false;
        }
        boolean bl = csb_1.nEA.eNG().a(ffV2, csc_02.bfE());
        if (!bl) {
            lRS.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13823;
    }
}

