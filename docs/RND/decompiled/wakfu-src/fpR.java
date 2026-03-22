/*
 * Decompiled with CFR 0.152.
 */
public final class fpR
extends Enum<fpR> {
    public static final /* enum */ fpR sQS = new fpR();
    public static final /* enum */ fpR sQT = new fpR();
    public static final /* enum */ fpR sQU = new fpR();
    public static final /* enum */ fpR sQV = new fpR();
    public static final /* enum */ fpR sQW = new fpR();
    private static final fpR[] sQX;
    private static final /* synthetic */ fpR[] sQY;

    public static fpR[] values() {
        return (fpR[])sQY.clone();
    }

    public static fpR valueOf(String string) {
        return Enum.valueOf(fpR.class, string);
    }

    public static fpR fz(short s) {
        return sQX[s];
    }

    private static /* synthetic */ fpR[] ghr() {
        return new fpR[]{sQS, sQT, sQU, sQV, sQW};
    }

    static {
        sQY = fpR.ghr();
        sQX = fpR.values();
    }
}

