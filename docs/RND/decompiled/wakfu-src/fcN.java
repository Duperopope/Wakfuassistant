/*
 * Decompiled with CFR 0.152.
 */
public final class fcN
extends Enum<fcN> {
    public static final /* enum */ fcN rUm = new fcN(0);
    public static final /* enum */ fcN rUn = new fcN(1);
    public static final /* enum */ fcN rUo = new fcN(2);
    public static final /* enum */ fcN rUp = new fcN(3);
    public static final /* enum */ fcN rUq = new fcN(4);
    public static final /* enum */ fcN rUr = new fcN(5);
    public static final /* enum */ fcN rUs = new fcN(6);
    private final byte rUt;
    private static final /* synthetic */ fcN[] rUu;

    public static fcN[] values() {
        return (fcN[])rUu.clone();
    }

    public static fcN valueOf(String string) {
        return Enum.valueOf(fcN.class, string);
    }

    private fcN(int n2) {
        this.rUt = GC.ct(n2);
    }

    public byte aJr() {
        return this.rUt;
    }

    public static fcN ga(byte by) {
        for (fcN fcN2 : fcN.values()) {
            if (fcN2.rUt != by) continue;
            return fcN2;
        }
        return rUm;
    }

    private static /* synthetic */ fcN[] fSR() {
        return new fcN[]{rUm, rUn, rUo, rUp, rUq, rUr, rUs};
    }

    static {
        rUu = fcN.fSR();
    }
}

