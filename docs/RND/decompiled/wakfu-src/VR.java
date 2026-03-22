/*
 * Decompiled with CFR 0.152.
 */
public final class VR
extends Enum<VR>
implements aoq_1 {
    public static final /* enum */ VR bKu = new VR(0, "Filtre Obs\u00e9nit\u00e9");
    public static final /* enum */ VR bKv = new VR(1, "Banni");
    public static final /* enum */ VR bKw = new VR(2, "Nom prot\u00e9g\u00e9");
    private final short bKx;
    private final String bKy;
    private static final /* synthetic */ VR[] bKz;

    public static VR[] values() {
        return (VR[])bKz.clone();
    }

    public static VR valueOf(String string) {
        return Enum.valueOf(VR.class, string);
    }

    private VR(short s, String string2) {
        this.bKx = s;
        this.bKy = string2;
    }

    public int d() {
        return this.bKx;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.bKx);
    }

    @Override
    public String aXB() {
        return this.bKy;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static VR an(short s) {
        for (VR vR : VR.values()) {
            if (vR.d() != s) continue;
            return vR;
        }
        return null;
    }

    private static /* synthetic */ VR[] bkT() {
        return new VR[]{bKu, bKv, bKw};
    }

    static {
        bKz = VR.bkT();
    }
}

