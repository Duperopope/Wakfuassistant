/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpo
 */
public final class fpo_0
extends Enum<fpo_0> {
    public static final /* enum */ fpo_0 sNM = new fpo_0(0);
    public static final /* enum */ fpo_0 sNN = new fpo_0(1);
    public static final /* enum */ fpo_0 sNO = new fpo_0(2);
    public static final /* enum */ fpo_0 sNP = new fpo_0(3);
    public static final /* enum */ fpo_0 sNQ = new fpo_0(4);
    public static final /* enum */ fpo_0 sNR = new fpo_0(5);
    public static final /* enum */ fpo_0 sNS = new fpo_0(6);
    private final byte sNT;
    private static final /* synthetic */ fpo_0[] sNU;

    public static fpo_0[] values() {
        return (fpo_0[])sNU.clone();
    }

    public static fpo_0 valueOf(String string) {
        return Enum.valueOf(fpo_0.class, string);
    }

    private fpo_0(int n2) {
        this.sNT = GC.ct(n2);
    }

    public byte aJr() {
        return this.sNT;
    }

    public static fpo_0 Yo(int n) {
        fpo_0[] fpo_0Array = fpo_0.values();
        if (n < 0 || n >= fpo_0Array.length) {
            return sNM;
        }
        return fpo_0Array[n];
    }

    private static /* synthetic */ fpo_0[] ggl() {
        return new fpo_0[]{sNM, sNN, sNO, sNP, sNQ, sNR, sNS};
    }

    static {
        sNU = fpo_0.ggl();
    }
}

