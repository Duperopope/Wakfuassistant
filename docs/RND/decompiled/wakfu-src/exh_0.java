/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from exh
 */
public final class exh_0
extends Enum<exh_0> {
    public static final /* enum */ exh_0 oUx = new exh_0(0, "km_arena");
    public static final /* enum */ exh_0 oUy = new exh_0(1, "dofus");
    public static final /* enum */ exh_0 oUz = new exh_0(2, "wakfu");
    private final byte oUA;
    private final String oUB;
    private static final /* synthetic */ exh_0[] oUC;

    public static exh_0[] values() {
        return (exh_0[])oUC.clone();
    }

    public static exh_0 valueOf(String string) {
        return Enum.valueOf(exh_0.class, string);
    }

    private exh_0(byte by, String string2) {
        this.oUA = by;
        this.oUB = string2;
    }

    public byte aJr() {
        return this.oUA;
    }

    public String getName() {
        return this.oUB;
    }

    public static exh_0 rL(String string) {
        for (exh_0 exh_02 : exh_0.values()) {
            if (!exh_02.getName().equalsIgnoreCase(string)) continue;
            return exh_02;
        }
        return null;
    }

    public static exh_0 eB(byte by) {
        for (exh_0 exh_02 : exh_0.values()) {
            if (exh_02.oUA != by) continue;
            return exh_02;
        }
        return null;
    }

    private static /* synthetic */ exh_0[] ffk() {
        return new exh_0[]{oUx, oUy, oUz};
    }

    static {
        oUC = exh_0.ffk();
    }
}

