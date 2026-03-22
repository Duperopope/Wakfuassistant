/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blv
 */
public final class blv_0
extends Enum<blv_0> {
    public static final /* enum */ blv_0 iuJ = new blv_0(0);
    public static final /* enum */ blv_0 iuK = new blv_0(1);
    public static final /* enum */ blv_0 iuL = new blv_0(2);
    private final int iuM;
    private static final /* synthetic */ blv_0[] iuN;

    public static blv_0[] values() {
        return (blv_0[])iuN.clone();
    }

    public static blv_0 valueOf(String string) {
        return Enum.valueOf(blv_0.class, string);
    }

    private blv_0(int n2) {
        this.iuM = n2;
    }

    public int aHp() {
        return this.iuM;
    }

    public static blv_0 DG(int n) {
        for (blv_0 blv_02 : blv_0.values()) {
            if (blv_02.aHp() != n) continue;
            return blv_02;
        }
        return null;
    }

    private static /* synthetic */ blv_0[] dtL() {
        return new blv_0[]{iuJ, iuK, iuL};
    }

    static {
        iuN = blv_0.dtL();
    }
}

