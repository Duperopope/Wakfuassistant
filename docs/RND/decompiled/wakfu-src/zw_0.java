/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from ZW
 */
public final class zw_0
extends Enum<zw_0> {
    public static final /* enum */ zw_0 bXd = new zw_0(ei_2.class, new ZN());
    public static final /* enum */ zw_0 bXe = new zw_0(ej_1.class, new ZO());
    public static final /* enum */ zw_0 bXf = new zw_0(ek_1.class, new ZP());
    public static final /* enum */ zw_0 bXg = new zw_0(el_1.class, new ZQ());
    public static final /* enum */ zw_0 bXh = new zw_0(em_1.class, new ZR());
    public static final /* enum */ zw_0 bXi = new zw_0(en_1.class, new zs_0());
    public static final /* enum */ zw_0 bXj = new zw_0(eo_1.class, new zt_0());
    public static final /* enum */ zw_0 bXk = new zw_0(ep_1.class, new zu_0());
    public static final /* enum */ zw_0 bXl = new zw_0(eq_1.class, new zv_0());
    public static final /* enum */ zw_0 bXm = new zw_0(er_1.class, new zx_0());
    private static final Map<Class<? extends eh_2>, ark_2<? extends eh_2>> bXn;
    private final Class<? extends eh_2> bXo;
    private final ark_2<? extends eh_2> bXp;
    private static final /* synthetic */ zw_0[] bXq;

    public static zw_0[] values() {
        return (zw_0[])bXq.clone();
    }

    public static zw_0 valueOf(String string) {
        return Enum.valueOf(zw_0.class, string);
    }

    private <A extends eh_2> zw_0(Class<A> clazz, ark_2<A> ark_22) {
        this.bXo = clazz;
        this.bXp = ark_22;
    }

    public static <A extends eh_2, R extends ark_2<A>> R l(Class<? extends eh_2> clazz) {
        return (R)bXn.get(clazz);
    }

    private static Map<Class<? extends eh_2>, ark_2<? extends eh_2>> bqz() {
        zw_0[] zw_0Array;
        HashMap<Class<? extends eh_2>, ark_2<? extends eh_2>> hashMap = new HashMap<Class<? extends eh_2>, ark_2<? extends eh_2>>();
        for (zw_0 zw_02 : zw_0Array = zw_0.values()) {
            hashMap.put(zw_02.bXo, zw_02.bXp);
        }
        return hashMap;
    }

    private static /* synthetic */ zw_0[] bqA() {
        return new zw_0[]{bXd, bXe, bXf, bXg, bXh, bXi, bXj, bXk, bXl, bXm};
    }

    static {
        bXq = zw_0.bqA();
        bXn = Collections.unmodifiableMap(zw_0.bqz());
    }
}

