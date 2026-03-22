/*
 * Decompiled with CFR 0.152.
 */
public final class cCq
extends Enum<cCq> {
    public static final /* enum */ cCq mzD = new cCq(0);
    public static final /* enum */ cCq mzE = new cCq(1);
    public static final /* enum */ cCq mzF = new cCq(2);
    public static final /* enum */ cCq mzG = new cCq(3);
    public static final /* enum */ cCq mzH = new cCq(4);
    final byte mzI;
    private static final /* synthetic */ cCq[] mzJ;

    public static cCq[] values() {
        return (cCq[])mzJ.clone();
    }

    public static cCq valueOf(String string) {
        return Enum.valueOf(cCq.class, string);
    }

    private cCq(byte by) {
        this.mzI = by;
    }

    public static cCq dX(byte by) {
        for (cCq cCq2 : cCq.values()) {
            if (cCq2.mzI != by) continue;
            return cCq2;
        }
        return null;
    }

    private static /* synthetic */ cCq[] eJu() {
        return new cCq[]{mzD, mzE, mzF, mzG, mzH};
    }

    static {
        mzJ = cCq.eJu();
    }
}

