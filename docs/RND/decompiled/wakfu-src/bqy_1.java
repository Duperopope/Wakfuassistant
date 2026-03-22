/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqY
 */
public final class bqy_1
extends Enum<bqy_1>
implements aoq_1,
aoy_1 {
    public static final /* enum */ bqy_1 jbL = new bqy_1(1, bqv_0.jbG);
    public static final /* enum */ bqy_1 jbM = new bqy_1(2, bqx_0.jbK);
    public static final /* enum */ bqy_1 jbN = new bqy_1(3, bqw_0.jbI);
    public static final /* enum */ bqy_1 jbO = new bqy_1(4, bqr_0.jbx);
    public static final /* enum */ bqy_1 jbP = new bqy_1(5, bqt_0.jbA);
    public static final /* enum */ bqy_1 jbQ = new bqy_1(6, bqs_0.jbz);
    private final int jbR;
    private final aox_1 jbS;
    private static final /* synthetic */ bqy_1[] jbT;

    public static bqy_1[] values() {
        return (bqy_1[])jbT.clone();
    }

    public static bqy_1 valueOf(String string) {
        return Enum.valueOf(bqy_1.class, string);
    }

    private bqy_1(int n2, aox_1 aox_12) {
        this.jbR = n2;
        this.jbS = aox_12;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.jbR);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    @Override
    public aox_1 bEt() {
        return this.jbS;
    }

    public int d() {
        return this.jbR;
    }

    public static bqq_0 dx(int n, int n2) {
        if (n == jbL.d()) {
            return new bqv_0(n2);
        }
        if (n == jbM.d()) {
            return new bqx_0(n2);
        }
        if (n == jbN.d()) {
            return new bqw_0(n2);
        }
        if (n == jbO.d()) {
            return new bqr_0(n2);
        }
        if (n == jbP.d()) {
            return new bqt_0(n2);
        }
        if (n == jbQ.d()) {
            return new bqs_0(n2);
        }
        return null;
    }

    private static /* synthetic */ bqy_1[] dEG() {
        return new bqy_1[]{jbL, jbM, jbN, jbO, jbP, jbQ};
    }

    static {
        jbT = bqy_1.dEG();
    }
}

