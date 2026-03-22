/*
 * Decompiled with CFR 0.152.
 */
public final class eMU
extends Enum<eMU> {
    public static final /* enum */ eMU qOh = new eMU(-1, -1);
    public static final /* enum */ eMU qOi = new eMU(0, 1);
    public static final /* enum */ eMU qOj = new eMU(1, 2);
    public static final /* enum */ eMU qOk = new eMU(2, 3);
    public static final /* enum */ eMU qOl = new eMU(3, 5);
    public static final /* enum */ eMU qOm = new eMU(4, 8);
    public static final /* enum */ eMU qOn = new eMU(5, 10);
    private final int qOo;
    private final int qOp;
    private static final /* synthetic */ eMU[] qOq;

    public static eMU[] values() {
        return (eMU[])qOq.clone();
    }

    public static eMU valueOf(String string) {
        return Enum.valueOf(eMU.class, string);
    }

    private eMU(int n2, int n3) {
        this.qOo = n3;
        this.qOp = n2;
    }

    public int fAN() {
        return this.qOo;
    }

    public int fAO() {
        return this.qOp;
    }

    public static eMU RG(int n) {
        for (eMU eMU2 : eMU.values()) {
            if (eMU2.qOo != n) continue;
            return eMU2;
        }
        return qOh;
    }

    public static eMU RH(int n) {
        eMU eMU2 = qOh;
        for (eMU eMU3 : eMU.values()) {
            if (n < eMU3.qOo) {
                return eMU2;
            }
            eMU2 = eMU3;
        }
        return eMU2;
    }

    public static int fAP() {
        return eMU.values().length - 2;
    }

    private static /* synthetic */ eMU[] fAQ() {
        return new eMU[]{qOh, qOi, qOj, qOk, qOl, qOm, qOn};
    }

    static {
        qOq = eMU.fAQ();
    }
}

