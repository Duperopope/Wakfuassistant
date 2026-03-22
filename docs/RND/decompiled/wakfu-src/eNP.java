/*
 * Decompiled with CFR 0.152.
 */
public class eNP
extends env_0 {
    public static final eNP qZM = new eNP();
    private static final boolean qZN = false;
    private static final boolean qZO = true;

    public static eNP fBH() {
        return qZM;
    }

    private eNP() {
        this(false, true, qZg);
    }

    private eNP(boolean bl, boolean bl2, float[] fArray) {
        super(-9, -1, aoi_1.cLh.a(null, (short)0), qZf, qZf, qZf, qZf, qZf, qZf, qZf, 0L, null, false, 1, 0.0f, bl2, bl, 0, 0.0f, fArray, 100.0f, 0.0f, false, false, false, false, 0, Integer.MAX_VALUE, null, (short)-1, 0.0f, (byte)-1, false, true, true, false, null, false, false, false, false);
    }

    public static eNP ac(float[] fArray) {
        return new eNP(false, true, fArray);
    }

    public static eNP s(boolean bl, boolean bl2) {
        return new eNP(bl, bl2, qZg);
    }
}

