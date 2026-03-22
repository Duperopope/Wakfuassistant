/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cAF
 */
public final class caf_0
extends Enum<caf_0> {
    public static final /* enum */ caf_0 moX = new caf_0();
    public static final /* enum */ caf_0 moY = new caf_0();
    public static final /* enum */ caf_0 moZ = new caf_0();
    private static final /* synthetic */ caf_0[] mpa;

    public static caf_0[] values() {
        return (caf_0[])mpa.clone();
    }

    public static caf_0 valueOf(String string) {
        return Enum.valueOf(caf_0.class, string);
    }

    static caf_0 oL(String string) {
        for (caf_0 caf_02 : caf_0.values()) {
            if (!caf_02.name().equals(string)) continue;
            return caf_02;
        }
        return moX;
    }

    private static /* synthetic */ caf_0[] eGG() {
        return new caf_0[]{moX, moY, moZ};
    }

    static {
        mpa = caf_0.eGG();
    }
}

