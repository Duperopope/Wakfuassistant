/*
 * Decompiled with CFR 0.152.
 */
public final class eyq
extends Enum<eyq> {
    public static final /* enum */ eyq piP = new eyq();
    public static final /* enum */ eyq piQ = new eyq();
    public static final /* enum */ eyq piR = new eyq();
    public static final /* enum */ eyq piS = new eyq();
    public static final /* enum */ eyq piT = new eyq();
    public static final /* enum */ eyq piU = new eyq();
    public static final /* enum */ eyq piV = new eyq();
    public static final /* enum */ eyq piW = new eyq();
    private static final /* synthetic */ eyq[] piX;

    public static eyq[] values() {
        return (eyq[])piX.clone();
    }

    public static eyq valueOf(String string) {
        return Enum.valueOf(eyq.class, string);
    }

    private static /* synthetic */ eyq[] fib() {
        return new eyq[]{piP, piQ, piR, piS, piT, piU, piV, piW};
    }

    static {
        piX = eyq.fib();
    }
}

