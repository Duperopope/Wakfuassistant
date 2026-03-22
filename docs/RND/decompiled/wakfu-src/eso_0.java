/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSo
 */
public final class eso_0
extends Enum<eso_0> {
    public static final /* enum */ eso_0 rjE = new eso_0(0);
    public static final /* enum */ eso_0 rjF = new eso_0(1);
    public static final /* enum */ eso_0 rjG = new eso_0(2);
    public static final /* enum */ eso_0 rjH = new eso_0(3);
    public static final /* enum */ eso_0 rjI = new eso_0(4);
    public static final /* enum */ eso_0 rjJ = new eso_0(5);
    public static final /* enum */ eso_0 rjK = new eso_0(6);
    private final byte rjL;
    private static final /* synthetic */ eso_0[] rjM;

    public static eso_0[] values() {
        return (eso_0[])rjM.clone();
    }

    public static eso_0 valueOf(String string) {
        return Enum.valueOf(eso_0.class, string);
    }

    private eso_0(byte by) {
        this.rjL = by;
    }

    public static eso_0 fi(byte by) {
        for (eso_0 eso_02 : eso_0.values()) {
            if (eso_02.rjL != by) continue;
            return eso_02;
        }
        return rjE;
    }

    public byte aJr() {
        return this.rjL;
    }

    private static /* synthetic */ eso_0[] fHL() {
        return new eso_0[]{rjE, rjF, rjG, rjH, rjI, rjJ, rjK};
    }

    static {
        rjM = eso_0.fHL();
    }
}

