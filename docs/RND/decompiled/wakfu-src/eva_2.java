/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eva
 */
public final class eva_2
extends Enum<eva_2> {
    public static final /* enum */ eva_2 osy = new eva_2(0, "");
    public static final /* enum */ eva_2 osz = new eva_2(1, "SHIELD");
    public static final /* enum */ eva_2 osA = new eva_2(2, "AUTHENTICATOR");
    private final byte osB;
    private final String osC;
    private static final /* synthetic */ eva_2[] osD;

    public static eva_2[] values() {
        return (eva_2[])osD.clone();
    }

    public static eva_2 valueOf(String string) {
        return Enum.valueOf(eva_2.class, string);
    }

    private eva_2(int n2, String string2) {
        this.osB = GC.ct(n2);
        this.osC = string2;
    }

    public byte aJr() {
        return this.osB;
    }

    public String fdH() {
        return this.osC;
    }

    public static eva_2 er(byte by) {
        for (eva_2 eva_22 : eva_2.values()) {
            if (eva_22.osB != by) continue;
            return eva_22;
        }
        return osy;
    }

    public static eva_2 rC(String string) {
        for (eva_2 eva_22 : eva_2.values()) {
            if (!eva_22.osC.equalsIgnoreCase(string)) continue;
            return eva_22;
        }
        return osy;
    }

    private static /* synthetic */ eva_2[] fdI() {
        return new eva_2[]{osy, osz, osA};
    }

    static {
        osD = eva_2.fdI();
    }
}

