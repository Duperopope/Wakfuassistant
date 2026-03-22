/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evg
 */
public abstract sealed class evg_1
extends Enum<evg_1>
implements euz_2<eve_2>
permits evh_1, evi_1, evj_2 {
    public static final /* enum */ evg_1 osP = new evh_1();
    public static final /* enum */ evg_1 osQ = new evi_1();
    public static final /* enum */ evg_1 osR = new evj_2();
    private static final /* synthetic */ evg_1[] osS;

    public static evg_1[] values() {
        return (evg_1[])osS.clone();
    }

    public static evg_1 valueOf(String string) {
        return Enum.valueOf(evg_1.class, string);
    }

    public abstract boolean a(eve_2 ... var1);

    private static /* synthetic */ evg_1[] fdZ() {
        return new evg_1[]{osP, osQ, osR};
    }

    static {
        osS = evg_1.fdZ();
    }
}

