/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evX
 */
public final class evx_1
extends Enum<evx_1> {
    public static final /* enum */ evx_1 oxE = new evx_1(0);
    public static final /* enum */ evx_1 oxF = new evx_1(1);
    public static final /* enum */ evx_1 oxG = new evx_1(2);
    public static final /* enum */ evx_1 oxH = new evx_1(3);
    private final int oxI;
    private static final /* synthetic */ evx_1[] oxJ;

    public static evx_1[] values() {
        return (evx_1[])oxJ.clone();
    }

    public static evx_1 valueOf(String string) {
        return Enum.valueOf(evx_1.class, string);
    }

    private evx_1(int n2) {
        this.oxI = n2;
    }

    public static evx_1 Os(int n) {
        evx_1[] evx_1Array = evx_1.values();
        for (int i = 0; i < evx_1Array.length; ++i) {
            evx_1 evx_12 = evx_1Array[i];
            if (evx_12.oxI != n) continue;
            return evx_12;
        }
        return oxE;
    }

    private static /* synthetic */ evx_1[] feI() {
        return new evx_1[]{oxE, oxF, oxG, oxH};
    }

    static {
        oxJ = evx_1.feI();
    }
}

