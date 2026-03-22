/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from ewl
 */
public final class ewl_0 {
    private static final EnumMap<ewr_0, Object> oBB = new EnumMap(ewr_0.class);
    private static final EnumMap<ewr_0, Object> oBC = new EnumMap(ewr_0.class);

    private ewl_0() {
    }

    public static Map<ewr_0, Object> le(boolean bl) {
        return bl ? oBB : oBC;
    }

    static {
        oBB.put(ewr_0.oEg, (Object)false);
        oBB.put(ewr_0.oDy, (Object)false);
        oBB.put(ewr_0.oDg, (Object)false);
        oBB.put(ewr_0.oDk, (Object)false);
        oBB.put(ewr_0.oEr, (Object)0);
        oBB.put(ewr_0.oEs, (Object)0);
        oBB.put(ewr_0.oEt, (Object)0);
        oBB.put(ewr_0.oCL, (Object)1);
        oBB.put(ewr_0.oCM, (Object)true);
        oBB.put(ewr_0.oCN, (Object)true);
        oBB.put(ewr_0.oCP, (Object)true);
        oBB.put(ewr_0.oCQ, (Object)true);
        oBB.put(ewr_0.oCS, (Object)1);
        oBB.put(ewr_0.oCT, (Object)1);
        oBB.put(ewr_0.oCU, (Object)true);
        for (ewr_0 ewr_02 : oBB.keySet()) {
            oBC.put(ewr_02, ewr_02.getDefaultValue());
        }
    }
}

