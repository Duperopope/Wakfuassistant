/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

/*
 * Renamed from eVv
 */
public final class evv_0
extends Enum<evv_0> {
    public static final /* enum */ evv_0 rAa = new evv_0(0);
    public static final /* enum */ evv_0 rAb = new evv_0(1);
    public static final /* enum */ evv_0 rAc = new evv_0(2);
    public static final /* enum */ evv_0 rAd = new evv_0(3);
    private static final EnumMap<evv_0, evv_0> rAe;
    private final byte rAf;
    private static final /* synthetic */ evv_0[] rAg;

    public static evv_0[] values() {
        return (evv_0[])rAg.clone();
    }

    public static evv_0 valueOf(String string) {
        return Enum.valueOf(evv_0.class, string);
    }

    private evv_0(byte by) {
        this.rAf = by;
    }

    private static EnumMap<evv_0, evv_0> fNe() {
        EnumMap<evv_0, evv_0> enumMap = new EnumMap<evv_0, evv_0>(evv_0.class);
        enumMap.put(rAb, rAc);
        enumMap.put(rAc, rAb);
        enumMap.put(rAd, rAc);
        return enumMap;
    }

    public evv_0 fNf() {
        return rAe.get((Object)this);
    }

    public static evv_0 fI(byte by) {
        evv_0[] evv_0Array = evv_0.values();
        for (int i = 0; i < evv_0Array.length; ++i) {
            evv_0 evv_02 = evv_0Array[i];
            if (evv_02.rAf != by) continue;
            return evv_02;
        }
        return rAa;
    }

    public byte aJr() {
        return this.rAf;
    }

    private static /* synthetic */ evv_0[] fNg() {
        return new evv_0[]{rAa, rAb, rAc, rAd};
    }

    static {
        rAg = evv_0.fNg();
        rAe = evv_0.fNe();
    }
}

