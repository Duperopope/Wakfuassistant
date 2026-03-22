/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class eSc
extends Enum<eSc>
permits eSd, eSe, eSf {
    public static final /* enum */ eSc rjl = new eSd(0);
    public static final /* enum */ eSc rjm = new eSe(1);
    public static final /* enum */ eSc rjn = new eSf(2);
    private final int rjo;
    private static final /* synthetic */ eSc[] rjp;

    public static eSc[] values() {
        return (eSc[])rjp.clone();
    }

    public static eSc valueOf(String string) {
        return Enum.valueOf(eSc.class, string);
    }

    eSc(int n2) {
        this.rjo = n2;
    }

    public abstract eSg at(acd_1 var1);

    public static eSc Sh(int n) {
        eSc[] eScArray = eSc.values();
        for (int i = 0; i < eScArray.length; ++i) {
            eSc eSc2 = eScArray[i];
            if (eSc2.rjo != n) continue;
            return eSc2;
        }
        return rjl;
    }

    private static /* synthetic */ eSc[] fHJ() {
        return new eSc[]{rjl, rjm, rjn};
    }

    static {
        rjp = eSc.fHJ();
    }
}

