/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.util.Optional;

/*
 * Renamed from awA
 */
public class awa_1 {
    private static final THashMap<awh_2, awx_1> dme = new THashMap();

    public static awh_2 b(awi_2 awi_22, String string, boolean bl) {
        return awn_2.b(awi_22, string, bl);
    }

    public static awx_1 c(awh_2 awh_22) {
        awx_1 awx_12 = (awx_1)dme.get((Object)awh_22);
        if (awx_12 != null) {
            return awx_12;
        }
        if (awh_22.getClass() == awy_1.class) {
            awb_1 awb_12 = new awb_1();
            awb_12.a((awy_1)awh_22);
            dme.put((Object)awh_22, (Object)awb_12);
            return awb_12;
        }
        if (awh_22.getClass() == avo_2.class) {
            avs_2 avs_22 = new avs_2();
            avs_22.a((avo_2)awh_22);
            dme.put((Object)awh_22, (Object)avs_22);
            return avs_22;
        }
        if (awh_22 instanceof avn_2) {
            avn_2 avn_22 = (avn_2)awh_22;
            awm_2 awm_22 = awa_1.a(avn_22.bNj()).map(aww_12 -> new awm_2(avn_22.bNh(), avn_22.bNi(), false, (aww_1)aww_12, avn_22.getDeltaX(), avn_22.getDeltaY())).orElseGet(() -> new awm_2(avn_22.bNh(), avn_22.bNi(), false, avn_22.getDeltaX(), avn_22.getDeltaY()));
            awm_22.bNM();
            awm_22.dh(false);
            dme.put((Object)awh_22, (Object)awm_22);
            return awm_22;
        }
        return null;
    }

    private static Optional<aww_1> a(awl_2 awl_22) {
        if (awl_22 == awl_2.dkJ) {
            return Optional.of(avt_2.dis);
        }
        if (awl_22 == awl_2.dkK) {
            return Optional.of(awt_1.dlE);
        }
        return Optional.empty();
    }
}

