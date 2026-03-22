/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bqc
 */
public final class bqc_0
extends Enum<bqc_0> {
    public static final /* enum */ bqc_0 iYK = new bqc_0(0);
    public static final /* enum */ bqc_0 iYL = new bqc_0(1);
    public static final /* enum */ bqc_0 iYM = new bqc_0(2);
    public static final /* enum */ bqc_0 iYN = new bqc_0(3);
    public static final bqc_0 iYO;
    private static final bqc_0[] iYP;
    private final int iYQ;
    private static final /* synthetic */ bqc_0[] iYR;

    public static bqc_0[] values() {
        return (bqc_0[])iYR.clone();
    }

    public static bqc_0 valueOf(String string) {
        return Enum.valueOf(bqc_0.class, string);
    }

    private bqc_0(int n2) {
        this.iYQ = n2;
    }

    public int d() {
        return this.iYQ;
    }

    public static Optional<bqc_0> mL(int n) {
        if (n < 0 || n >= iYP.length) {
            return Optional.empty();
        }
        return Optional.of(iYP[n]);
    }

    private static /* synthetic */ bqc_0[] dDT() {
        return new bqc_0[]{iYK, iYL, iYM, iYN};
    }

    static {
        iYR = bqc_0.dDT();
        iYO = iYK;
        iYP = bqc_0.values();
    }
}

