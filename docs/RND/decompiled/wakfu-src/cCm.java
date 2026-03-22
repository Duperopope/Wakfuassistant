/*
 * Decompiled with CFR 0.152.
 */
public final class cCm
extends Enum<cCm> {
    public static final /* enum */ cCm mzo = new cCm(0, "Ev\u00e8nement m\u00e9t\u00e9o");
    public static final /* enum */ cCm mzp = new cCm(1, "Ev\u00e8nement de faune");
    public static final /* enum */ cCm mzq = new cCm(2, "Ev\u00e8nement de flore");
    public static final /* enum */ cCm mzr = new cCm(3, "Ev\u00e8nement g\u00e9ographique");
    public static final /* enum */ cCm mzs = new cCm(4, "Ev\u00e8nement de marqueur audio");
    public static final /* enum */ cCm mzt = new cCm(5, "Ev\u00e8nement de Temps");
    private final String mzu;
    private final byte mzv;
    private static final /* synthetic */ cCm[] mzw;

    public static cCm[] values() {
        return (cCm[])mzw.clone();
    }

    public static cCm valueOf(String string) {
        return Enum.valueOf(cCm.class, string);
    }

    private cCm(byte by, String string2) {
        this.mzu = string2;
        this.mzv = by;
    }

    public String getDescription() {
        return this.mzu;
    }

    public byte aJr() {
        return this.mzv;
    }

    public String toString() {
        return this.mzu;
    }

    public static cCm dW(byte by) {
        for (cCm cCm2 : cCm.values()) {
            if (cCm2.mzv != by) continue;
            return cCm2;
        }
        return null;
    }

    private static /* synthetic */ cCm[] eJs() {
        return new cCm[]{mzo, mzp, mzq, mzr, mzs, mzt};
    }

    static {
        mzw = cCm.eJs();
    }
}

