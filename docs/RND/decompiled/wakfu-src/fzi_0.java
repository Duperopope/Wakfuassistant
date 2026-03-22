/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzI
 */
public final class fzi_0
extends Enum<fzi_0> {
    public static final /* enum */ fzi_0 tHa = new fzi_0();
    public static final /* enum */ fzi_0 tHb = new fzi_0();
    public static final /* enum */ fzi_0 tHc = new fzi_0();
    private static final /* synthetic */ fzi_0[] tHd;

    public static fzi_0[] values() {
        return (fzi_0[])tHd.clone();
    }

    public static fzi_0 valueOf(String string) {
        return Enum.valueOf(fzi_0.class, string);
    }

    public static fzi_0 tw(String string) {
        fzi_0[] fzi_0Array;
        for (fzi_0 fzi_02 : fzi_0Array = fzi_0.values()) {
            if (!fzi_02.name().equals(string.toUpperCase())) continue;
            return fzi_02;
        }
        return fzi_0Array[0];
    }

    private static /* synthetic */ fzi_0[] grK() {
        return new fzi_0[]{tHa, tHb, tHc};
    }

    static {
        tHd = fzi_0.grK();
    }
}

