/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPy
 */
public final class bpy_2
extends Enum<bpy_2> {
    public static final /* enum */ bpy_2 kQU = new bpy_2("ICEGIFT");
    public static final /* enum */ bpy_2 kQV = new bpy_2("ICEITEMGIFT");
    public static final /* enum */ bpy_2 kQW = new bpy_2("VIRTUALSUBSCRIPTIONLEVEL");
    public static final /* enum */ bpy_2 kQX = new bpy_2("ACCOUNTSTATUS");
    public static final /* enum */ bpy_2 kQY = new bpy_2("OGRINE");
    public static final /* enum */ bpy_2 kQZ = new bpy_2("OGRINETOKEN");
    public static final /* enum */ bpy_2 kRa = new bpy_2("GAMEACTION");
    public static final /* enum */ bpy_2 kRb = new bpy_2("KARD");
    public static final /* enum */ bpy_2 kRc = new bpy_2("");
    private final String kRd;
    private static final /* synthetic */ bpy_2[] kRe;

    public static bpy_2[] values() {
        return (bpy_2[])kRe.clone();
    }

    public static bpy_2 valueOf(String string) {
        return Enum.valueOf(bpy_2.class, string);
    }

    private bpy_2(String string2) {
        this.kRd = string2;
    }

    public String getName() {
        return this.kRd;
    }

    public static bpy_2 nm(String string) {
        for (bpy_2 bpy_22 : bpy_2.values()) {
            if (!bpy_22.kRd.equals(string)) continue;
            return bpy_22;
        }
        return kRc;
    }

    private static /* synthetic */ bpy_2[] eiD() {
        return new bpy_2[]{kQU, kQV, kQW, kQX, kQY, kQZ, kRa, kRb, kRc};
    }

    static {
        kRe = bpy_2.eiD();
    }
}

