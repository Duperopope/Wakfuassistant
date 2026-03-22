/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVY
 */
final class cvy_1
extends Enum<cvy_1> {
    public static final /* enum */ cvy_1 nRl = new cvy_1(18351, new int[]{2760});
    public static final /* enum */ cvy_1 nRm = new cvy_1(18401, new int[]{2752});
    public static final /* enum */ cvy_1 nRn = new cvy_1(18355, new int[]{2766});
    public static final /* enum */ cvy_1 nRo = new cvy_1(18406, new int[]{2765});
    public static final /* enum */ cvy_1 nRp = new cvy_1(18357, new int[]{2752, 2760, 2765, 2766});
    final int nRq;
    final int[] nRr;
    private static final /* synthetic */ cvy_1[] nRs;

    public static cvy_1[] values() {
        return (cvy_1[])nRs.clone();
    }

    public static cvy_1 valueOf(String string) {
        return Enum.valueOf(cvy_1.class, string);
    }

    private cvy_1(int n2, int[] nArray) {
        this.nRq = n2;
        this.nRr = nArray;
    }

    public static cvy_1 Nn(int n) {
        cvy_1[] cvy_1Array = cvy_1.values();
        for (int i = 0; i < cvy_1Array.length; ++i) {
            cvy_1 cvy_12 = cvy_1Array[i];
            if (n != cvy_12.nRq) continue;
            return cvy_12;
        }
        return null;
    }

    private static /* synthetic */ cvy_1[] eUY() {
        return new cvy_1[]{nRl, nRm, nRn, nRo, nRp};
    }

    static {
        nRs = cvy_1.eUY();
    }
}

