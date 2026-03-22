/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJc
 */
public final class ejc_0
extends Enum<ejc_0> {
    public static final /* enum */ ejc_0 qyp = new ejc_0(1);
    public static final /* enum */ ejc_0 qyq = new ejc_0(2);
    private final byte qyr;
    private static final /* synthetic */ ejc_0[] qys;

    public static ejc_0[] values() {
        return (ejc_0[])qys.clone();
    }

    public static ejc_0 valueOf(String string) {
        return Enum.valueOf(ejc_0.class, string);
    }

    private ejc_0(byte by) {
        this.qyr = by;
    }

    public byte aJr() {
        return this.qyr;
    }

    public static ejc_0 eT(byte by) {
        ejc_0[] ejc_0Array = ejc_0.values();
        for (int i = 0; i < ejc_0Array.length; ++i) {
            ejc_0 ejc_02 = ejc_0Array[i];
            if (ejc_02.qyr != by) continue;
            return ejc_02;
        }
        return null;
    }

    private static /* synthetic */ ejc_0[] fwX() {
        return new ejc_0[]{qyp, qyq};
    }

    static {
        qys = ejc_0.fwX();
    }
}

