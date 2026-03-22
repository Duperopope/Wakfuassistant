/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from ced
 */
public final class ced_0
implements aaq_2<csd_0> {
    private static final Logger lRT = Logger.getLogger(ced_0.class);

    @Override
    public boolean a(csd_0 csd_02) {
        csb_1.nEA.fY(false);
        if (csd_02.eBn() != ejv_0.qzL) {
            lRT.error((Object)("[Account chest] Error when moving item in the account chest=" + String.valueOf((Object)csd_02.eBn())));
            csb_1.a(csd_02.eBn());
            return false;
        }
        csb_1.nEA.t(csd_02.eBo(), csd_02.eBp());
        if (csd_02.aaA() == null) {
            return false;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null) {
            return false;
        }
        if (Objects.equals(bky_12.getId(), csd_02.eBq()) && !Objects.equals(csd_02.eBo(), csd_02.eBq())) {
            csb_1.nEA.t(csd_02.eBq(), csd_02.eBr());
            if (!bky_12.jW(csd_02.aaA().LV())) {
                return false;
            }
            boolean bl = csb_1.nEA.eNG().jX(csd_02.aaA().LV());
            if (!bl) {
                lRT.warn((Object)"[Account chest] Error when applying modification to account chest");
            }
            return false;
        }
        ffV ffV2 = fga_0.w(csd_02.aaA());
        if (ffV2 == null) {
            return false;
        }
        boolean bl = csb_1.nEA.eNG().b(ffV2, csd_02.bfE());
        if (!bl) {
            lRT.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12806;
    }
}

