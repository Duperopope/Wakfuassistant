/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXJ
 */
public final class exj_1
extends Enum<exj_1> {
    public static final /* enum */ exj_1 rIB = new exj_1(0);
    public static final /* enum */ exj_1 rIC = new exj_1(1);
    private final byte rID;
    private static final /* synthetic */ exj_1[] rIE;

    public static exj_1[] values() {
        return (exj_1[])rIE.clone();
    }

    public static exj_1 valueOf(String string) {
        return Enum.valueOf(exj_1.class, string);
    }

    private exj_1(byte by) {
        this.rID = by;
    }

    public byte aJr() {
        return this.rID;
    }

    public static exj_1 fP(byte by) {
        for (exj_1 exj_12 : exj_1.values()) {
            if (exj_12.rID != by) continue;
            return exj_12;
        }
        return rIB;
    }

    private static /* synthetic */ exj_1[] fOW() {
        return new exj_1[]{rIB, rIC};
    }

    static {
        rIE = exj_1.fOW();
    }
}

