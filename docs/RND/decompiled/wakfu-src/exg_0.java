/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from exg
 */
public final class exg_0
extends Enum<exg_0> {
    public static final /* enum */ exg_0 oUr = new exg_0(0, "FRIENDLY");
    public static final /* enum */ exg_0 oUs = new exg_0(1, "RANDOM");
    public static final /* enum */ exg_0 oUt = new exg_0(2, "TOURNAMENT");
    private final byte oUu;
    private final String oUv;
    private static final /* synthetic */ exg_0[] oUw;

    public static exg_0[] values() {
        return (exg_0[])oUw.clone();
    }

    public static exg_0 valueOf(String string) {
        return Enum.valueOf(exg_0.class, string);
    }

    private exg_0(byte by, String string2) {
        this.oUu = by;
        this.oUv = string2;
    }

    public byte aJr() {
        return this.oUu;
    }

    public String getName() {
        return this.oUv;
    }

    public static exg_0 rK(String string) {
        for (exg_0 exg_02 : exg_0.values()) {
            if (!exg_02.getName().equals(string)) continue;
            return exg_02;
        }
        return null;
    }

    public static exg_0 eA(byte by) {
        for (exg_0 exg_02 : exg_0.values()) {
            if (exg_02.oUu != by) continue;
            return exg_02;
        }
        return null;
    }

    private static /* synthetic */ exg_0[] ffj() {
        return new exg_0[]{oUr, oUs, oUt};
    }

    static {
        oUw = exg_0.ffj();
    }
}

