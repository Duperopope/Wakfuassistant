/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fnV
 */
public final class fnv_0
extends Enum<fnv_0> {
    public static final /* enum */ fnv_0 sKI = new fnv_0(0);
    public static final /* enum */ fnv_0 sKJ = new fnv_0(1);
    private final short sKK;
    private static final /* synthetic */ fnv_0[] sKL;

    public static fnv_0[] values() {
        return (fnv_0[])sKL.clone();
    }

    public static fnv_0 valueOf(String string) {
        return Enum.valueOf(fnv_0.class, string);
    }

    private fnv_0(short s) {
        this.sKK = s;
    }

    public static fnv_0 fr(short s) {
        for (fnv_0 fnv_02 : fnv_0.values()) {
            if (fnv_02.sKK != s) continue;
            return fnv_02;
        }
        return null;
    }

    public short aIi() {
        return this.sKK;
    }

    private static /* synthetic */ fnv_0[] gfh() {
        return new fnv_0[]{sKI, sKJ};
    }

    static {
        sKL = fnv_0.gfh();
    }
}

