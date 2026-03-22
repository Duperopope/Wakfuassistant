/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class eyA
extends Enum<eyA> {
    public static final /* enum */ eyA pjJ = new eyA(-1);
    public static final /* enum */ eyA pjK = new eyA(0);
    public static final /* enum */ eyA pjL = new eyA(1);
    public static final /* enum */ eyA pjM = new eyA(2);
    public static final /* enum */ eyA pjN = new eyA(3);
    public static final /* enum */ eyA pjO = new eyA(4);
    public static final /* enum */ eyA pjP = new eyA(5);
    private static final eyA[] pjQ;
    private final short pjR;
    private static final /* synthetic */ eyA[] pjS;

    public static eyA[] values() {
        return (eyA[])pjS.clone();
    }

    public static eyA valueOf(String string) {
        return Enum.valueOf(eyA.class, string);
    }

    private eyA(int n2) {
        this.pjR = (short)n2;
    }

    public static Optional<eyA> OY(int n) {
        for (eyA eyA2 : pjQ) {
            if (eyA2.pjR != n) continue;
            return Optional.of(eyA2);
        }
        return Optional.empty();
    }

    public short aIi() {
        return this.pjR;
    }

    private static /* synthetic */ eyA[] fin() {
        return new eyA[]{pjJ, pjK, pjL, pjM, pjN, pjO, pjP};
    }

    static {
        pjS = eyA.fin();
        pjQ = eyA.values();
    }
}

