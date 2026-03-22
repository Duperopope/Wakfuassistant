/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fhE
 */
public final class fhe_0
extends Enum<fhe_0> {
    public static final /* enum */ fhe_0 spv = new fhe_0(0, false);
    public static final /* enum */ fhe_0 spw = new fhe_0(1);
    public static final /* enum */ fhe_0 spx = new fhe_0(2);
    public static final /* enum */ fhe_0 spy = new fhe_0(3);
    public static final /* enum */ fhe_0 spz = new fhe_0(4);
    public static final /* enum */ fhe_0 spA = new fhe_0(5);
    public static final /* enum */ fhe_0 spB = new fhe_0(6);
    public static final /* enum */ fhe_0 spC = new fhe_0(7);
    public static final /* enum */ fhe_0 spD = new fhe_0(8);
    private static final fhe_0[] spE;
    private final int spF;
    private final boolean spG;
    private static final /* synthetic */ fhe_0[] spH;

    public static fhe_0[] values() {
        return (fhe_0[])spH.clone();
    }

    public static fhe_0 valueOf(String string) {
        return Enum.valueOf(fhe_0.class, string);
    }

    private fhe_0(int n2) {
        this(n2, true);
    }

    private fhe_0(int n2, boolean bl) {
        this.spF = n2;
        this.spG = bl;
    }

    public boolean aHz() {
        return this.spG;
    }

    public byte aJr() {
        return (byte)this.spF;
    }

    public static Optional<fhe_0> eL(byte by) {
        if (by < spE.length) {
            return Optional.of(spE[by]);
        }
        return Optional.empty();
    }

    private static /* synthetic */ fhe_0[] fYD() {
        return new fhe_0[]{spv, spw, spx, spy, spz, spA, spB, spC, spD};
    }

    static {
        spH = fhe_0.fYD();
        spE = fhe_0.values();
    }
}

