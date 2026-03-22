/*
 * Decompiled with CFR 0.152.
 */
public final class eMQ
extends Enum<eMQ> {
    public static final /* enum */ eMQ qNH = new eMQ(131, 0, 499);
    public static final /* enum */ eMQ qNI = new eMQ(219, 0, 499);
    public static final /* enum */ eMQ qNJ = new eMQ(181, 0, 499);
    public static final /* enum */ eMQ qNK = new eMQ(204, 0, 499);
    public static final /* enum */ eMQ qNL = new eMQ(206, 0, 499);
    public static final /* enum */ eMQ qNM = new eMQ(203, 0, 499);
    public static final /* enum */ eMQ qNN = new eMQ(220, 0, 499);
    private final int qNO;
    private final int qNP;
    private final int qNQ;
    private static final /* synthetic */ eMQ[] qNR;

    public static eMQ[] values() {
        return (eMQ[])qNR.clone();
    }

    public static eMQ valueOf(String string) {
        return Enum.valueOf(eMQ.class, string);
    }

    private eMQ(int n2, int n3, int n4) {
        this.qNO = n2;
        this.qNP = n3;
        this.qNQ = n4;
    }

    public static eMQ RC(int n) {
        for (eMQ eMQ2 : eMQ.values()) {
            if (eMQ2.qNO != n) continue;
            return eMQ2;
        }
        return null;
    }

    public int d() {
        return this.qNO;
    }

    public int In() {
        return this.qNP;
    }

    public int fAI() {
        return this.qNQ;
    }

    public static boolean RD(int n) {
        for (eMQ eMQ2 : eMQ.values()) {
            if (eMQ2.qNO != n) continue;
            return true;
        }
        return false;
    }

    private static /* synthetic */ eMQ[] fAJ() {
        return new eMQ[]{qNH, qNI, qNJ, qNK, qNL, qNM, qNN};
    }

    static {
        qNR = eMQ.fAJ();
    }
}

