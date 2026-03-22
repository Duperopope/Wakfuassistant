/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class JI
extends Enum<JI>
permits JJ, JU, Ka, kb_0, kc_0, kd_0, ke_1, kf_1, kg_1, JK, JL, JM, JN, JO, JP, JQ, JR, JS, JT, JV, JW, JX, JY, JZ {
    public static final /* enum */ JI aKD = new JJ(0);
    public static final /* enum */ JI aKE = new JU(1);
    public static final /* enum */ JI aKF = new Ka(2);
    public static final /* enum */ JI aKG = new kb_0(4);
    public static final /* enum */ JI aKH = new kc_0(5);
    public static final /* enum */ JI aKI = new kd_0(6);
    public static final /* enum */ JI aKJ = new ke_1(7);
    public static final /* enum */ JI aKK = new kf_1(8);
    public static final /* enum */ JI aKL = new kg_1(9);
    public static final /* enum */ JI aKM = new JK(10);
    public static final /* enum */ JI aKN = new JL(11);
    public static final /* enum */ JI aKO = new JM(13);
    public static final /* enum */ JI aKP = new JN(14);
    public static final /* enum */ JI aKQ = new JO(15);
    public static final /* enum */ JI aKR = new JP(16);
    public static final /* enum */ JI aKS = new JQ(18);
    public static final /* enum */ JI aKT = new JR(20);
    public static final /* enum */ JI aKU = new JS(21);
    public static final /* enum */ JI aKV = new JT(22);
    public static final /* enum */ JI aKW = new JV(23);
    public static final /* enum */ JI aKX = new JW(24);
    public static final /* enum */ JI aKY = new JX(25);
    public static final /* enum */ JI aKZ = new JY(100);
    public static final /* enum */ JI aLa = new JZ(200);
    private final int aLb;
    private static final /* synthetic */ JI[] aLc;

    public static JI[] values() {
        return (JI[])aLc.clone();
    }

    public static JI valueOf(String string) {
        return Enum.valueOf(JI.class, string);
    }

    JI(int n2) {
        this.aLb = n2;
    }

    public int aPm() {
        return this.aLb;
    }

    public abstract ki_1 aPn();

    public static JI nf(int n) {
        JI[] jIArray;
        for (JI jI : jIArray = JI.values()) {
            if (jI.aLb != n) continue;
            return jI;
        }
        throw new IllegalArgumentException("unable to find tag " + n);
    }

    private static /* synthetic */ JI[] aPo() {
        return new JI[]{aKD, aKE, aKF, aKG, aKH, aKI, aKJ, aKK, aKL, aKM, aKN, aKO, aKP, aKQ, aKR, aKS, aKT, aKU, aKV, aKW, aKX, aKY, aKZ, aLa};
    }

    static {
        aLc = JI.aPo();
    }
}

