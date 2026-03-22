/*
 * Decompiled with CFR 0.152.
 */
public final class RY
extends Enum<RY> {
    public static final /* enum */ RY bnj = new RY();
    public static final /* enum */ RY bnk = new RY();
    public static final /* enum */ RY bnl = new RY();
    public static final /* enum */ RY bnm = new RY();
    private static final /* synthetic */ RY[] bnn;

    public static RY[] values() {
        return (RY[])bnn.clone();
    }

    public static RY valueOf(String string) {
        return Enum.valueOf(RY.class, string);
    }

    private static /* synthetic */ RY[] bfk() {
        return new RY[]{bnj, bnk, bnl, bnm};
    }

    static {
        bnn = RY.bfk();
    }
}

