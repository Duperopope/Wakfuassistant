/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from ccu
 */
public final class ccu_1
implements adi_1 {
    private static final ccu_1 lOS = new ccu_1();

    public static ccu_1 etC() {
        return lOS;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 22461: {
                cyp_0 cyp_02 = (cyp_0)aam_22;
                Map<Integer, Integer[]> map = cyp_02.eFG();
                brt_1.ekR().Je(cyp_02.eFD());
                brt_1.ekR().Jf(cyp_02.eFE());
                brt_1.ekR().Jg(cyp_02.eFF());
                brt_1.ekR().Jh(cyp_02.eFH());
                brt_1.ekR().Ji(cyp_02.eFI());
                brt_1.ekR().Jj(cyp_02.eFJ());
                EnumMap<evt_1, Integer[]> enumMap = new EnumMap<evt_1, Integer[]>(evt_1.class);
                for (Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
                    enumMap.put(evt_1.Oq(entry.getKey()), entry.getValue());
                }
                brt_1.ekR().a(enumMap);
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

