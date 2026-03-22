/*
 * Decompiled with CFR 0.152.
 */
public final class fpP
extends Enum<fpP> {
    public static final /* enum */ fpP sQL = new fpP(0);
    public static final /* enum */ fpP sQM = new fpP(1);
    public static final /* enum */ fpP sQN = new fpP(2);
    private final byte sQO;
    private static final /* synthetic */ fpP[] sQP;

    public static fpP[] values() {
        return (fpP[])sQP.clone();
    }

    public static fpP valueOf(String string) {
        return Enum.valueOf(fpP.class, string);
    }

    private fpP(byte by) {
        this.sQO = by;
    }

    public static fpP hm(byte by) {
        for (fpP fpP2 : fpP.values()) {
            if (fpP2.sQO != by) continue;
            return fpP2;
        }
        throw new IllegalArgumentException("Unknown result id=" + by);
    }

    public byte aJr() {
        return this.sQO;
    }

    public boolean aHz() {
        return this == sQM || this == sQN;
    }

    private static /* synthetic */ fpP[] gho() {
        return new fpP[]{sQL, sQM, sQN};
    }

    static {
        sQP = fpP.gho();
    }
}

