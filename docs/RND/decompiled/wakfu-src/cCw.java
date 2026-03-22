/*
 * Decompiled with CFR 0.152.
 */
public final class cCw
extends Enum<cCw> {
    public static final /* enum */ cCw mzY = new cCw(0, "D\u00e9but de la pluie", 0);
    public static final /* enum */ cCw mzZ = new cCw(1, "Fin de la pluie", 0);
    public static final /* enum */ cCw mAa = new cCw(2, "D\u00e9but de la neige", 0);
    public static final /* enum */ cCw mAb = new cCw(3, "Fin de la neige", 0);
    public static final /* enum */ cCw mAc = new cCw(4, "Eclair", 1);
    public static final /* enum */ cCw mAd = new cCw(5, "Chaos-Debut", 2);
    public static final /* enum */ cCw mAe = new cCw(6, "Chaos-Fin", 2);
    private final String mAf;
    private final byte mAg;
    private final byte mAh;
    private static final /* synthetic */ cCw[] mAi;

    public static cCw[] values() {
        return (cCw[])mAi.clone();
    }

    public static cCw valueOf(String string) {
        return Enum.valueOf(cCw.class, string);
    }

    public static cCw dY(byte by) {
        for (cCw cCw2 : cCw.values()) {
            if (cCw2.mAg != by) continue;
            return cCw2;
        }
        return null;
    }

    private cCw(byte by, String string2, byte by2) {
        this.mAf = string2;
        this.mAg = by;
        this.mAh = by2;
    }

    public String getDescription() {
        return this.mAf;
    }

    public byte aJr() {
        return this.mAg;
    }

    public byte eJz() {
        return this.mAh;
    }

    public String toString() {
        return this.mAf;
    }

    private static /* synthetic */ cCw[] eJA() {
        return new cCw[]{mzY, mzZ, mAa, mAb, mAc, mAd, mAe};
    }

    static {
        mAi = cCw.eJA();
    }
}

