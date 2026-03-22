/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from ceg
 */
public class ceg_0
implements aaq_2<csg_0> {
    private static final Logger lRW = Logger.getLogger(ceg_0.class);

    @Override
    public boolean a(csg_0 csg_02) {
        csb_1.nEA.fY(false);
        if (csg_02.eBn() != ejv_0.qzL) {
            lRW.error((Object)("[Account chest] Error when stacking items to account chest= " + String.valueOf((Object)csg_02.eBn())));
            return false;
        }
        String string = csg_02.eBo();
        csb_1.nEA.t(string, csg_02.eBp());
        if (csg_02.eBu()) {
            return false;
        }
        bky_1 bky_12 = csb_1.nEA.eNG();
        if (bky_12 == null || !Objects.equals(bky_12.getId(), string)) {
            return false;
        }
        HashMap<kW, Short> hashMap = csg_02.eBt();
        for (Map.Entry entry : hashMap.entrySet()) {
            short s;
            Optional<ffV> optional;
            kW kW2 = (kW)entry.getKey();
            Short s2 = (Short)entry.getValue();
            ffV ffV2 = fga_0.w(kW2);
            if (ffV2 == null || (optional = csb_1.nEA.eNG().Dz(s2.shortValue())).isPresent() && (s = optional.get().bfd()) > ffV2.bfd() || (s = (short)(csb_1.nEA.eNG().a(ffV2, s2.shortValue()) ? 1 : 0)) != 0) continue;
            lRW.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12190;
    }
}

