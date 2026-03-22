/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bII
 */
public final class bii_2
extends Enum<bii_2> {
    public static final /* enum */ bii_2 khB = new bii_2(0, "territory", true);
    public static final /* enum */ bii_2 khC = new bii_2(1, "subInstance", true);
    public static final /* enum */ bii_2 khD = new bii_2(2, "instance", true);
    public static final /* enum */ bii_2 khE = new bii_2(3, "parentMap", true);
    public static final /* enum */ bii_2 khF = new bii_2(4, "full", true);
    public static final /* enum */ bii_2 khG = new bii_2(5, "deco", false);
    final byte khH;
    private final String khI;
    private final boolean khJ;
    private static final /* synthetic */ bii_2[] khK;

    public static bii_2[] values() {
        return (bii_2[])khK.clone();
    }

    public static bii_2 valueOf(String string) {
        return Enum.valueOf(bii_2.class, string);
    }

    private bii_2(byte by, String string2, boolean bl) {
        this.khH = by;
        this.khI = string2;
        this.khJ = bl;
    }

    public byte aJr() {
        return this.khH;
    }

    public boolean dZi() {
        return this.khJ;
    }

    public static bii_2 mQ(String string) {
        for (bii_2 bii_22 : bii_2.values()) {
            if (!bii_22.khI.equals(string)) continue;
            return bii_22;
        }
        return null;
    }

    private static /* synthetic */ bii_2[] dZj() {
        return new bii_2[]{khB, khC, khD, khE, khF, khG};
    }

    static {
        khK = bii_2.dZj();
    }
}

