/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from faN
 */
public final class fan_0
extends Enum<fan_0> {
    public static final /* enum */ fan_0 rPV = new fan_0(0);
    public static final /* enum */ fan_0 rPW = new fan_0(1);
    public static final /* enum */ fan_0 rPX = new fan_0(2);
    public static final /* enum */ fan_0 rPY = new fan_0(3);
    public static final /* enum */ fan_0 rPZ = new fan_0(4);
    public static final /* enum */ fan_0 rQa = new fan_0(5);
    public static final /* enum */ fan_0 rQb = new fan_0(6);
    public static final /* enum */ fan_0 rQc = new fan_0(7);
    private final byte rQd;
    private static final /* synthetic */ fan_0[] rQe;

    public static fan_0[] values() {
        return (fan_0[])rQe.clone();
    }

    public static fan_0 valueOf(String string) {
        return Enum.valueOf(fan_0.class, string);
    }

    private fan_0(byte by) {
        this.rQd = by;
    }

    public static fan_0 fY(byte by) {
        for (fan_0 fan_02 : fan_0.values()) {
            if (by != fan_02.rQd) continue;
            return fan_02;
        }
        return rPV;
    }

    public byte aJr() {
        return this.rQd;
    }

    private static /* synthetic */ fan_0[] fRu() {
        return new fan_0[]{rPV, rPW, rPX, rPY, rPZ, rQa, rQb, rQc};
    }

    static {
        rQe = fan_0.fRu();
    }
}

