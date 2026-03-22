/*
 * Decompiled with CFR 0.152.
 */
public class bty
implements aeh_2 {
    public static final String jlI = "xp";
    public static final String jlJ = "level";
    public static final String jlK = "percentageInLevel";
    public static final String jlL = "previousPercentageInLevel";
    public static final String jlM = "premiumPercentageInLevel";
    public static final String[] jlN = new String[]{"xp", "level", "percentageInLevel", "previousPercentageInLevel", "premiumPercentageInLevel"};
    private final mj_1 jlO;
    private final short jlP;
    private final short jlQ;
    private final String jlR;
    private final float jlS;
    private final float jlT;
    private final float jlU;

    public bty(mj_1 mj_12, short s, long l, Long l2, int n) {
        this(mj_12, s, s, l, l2, -1L, n);
    }

    public bty(mj_1 mj_12, short s, long l, Long l2, long l3, int n) {
        this(mj_12, s, s, l, l2, l3, n);
    }

    public bty(mj_1 mj_12, short s, short s2, long l, Long l2, int n) {
        this(mj_12, s, s2, l, l2, -1L, n);
    }

    public bty(mj_1 mj_12, short s, short s2, long l, Long l2, long l3, int n) {
        this.jlO = mj_12;
        this.jlP = s;
        this.jlQ = s2;
        this.jlR = this.b(s, l);
        this.jlS = this.c(s, l);
        if (l3 != -1L && l2 != null) {
            long l4 = l - l2 + l3;
            short s3 = this.jlO.cR(l4);
            long l5 = s3 > s ? this.jlO.nG(s3) : l4;
            this.jlU = this.c(s, l5);
        } else {
            this.jlU = 0.0f;
        }
        this.jlT = l2 == null ? this.jlS : (l2 < 0L ? this.jlS : (l2 == -1L || n > 0 ? -1.0f : this.c(s, l - l2)));
    }

    private String b(short s, long l) {
        long l2 = this.jlO.N(s);
        short s2 = this.jlO.cR(l);
        long l3 = s2 > s ? l2 : this.jlO.cT(l);
        return aum_0.cWf().cQ(l3) + "/" + aum_0.cWf().cQ(l2);
    }

    private float c(short s, long l) {
        return this.jlO.a(s, l);
    }

    @Override
    public String[] bxk() {
        return jlN;
    }

    @Override
    public Object eu(String string) {
        if (jlI.equals(string)) {
            return this.jlR;
        }
        if (jlJ.equals(string)) {
            return this.jlQ;
        }
        if (jlK.equals(string)) {
            return Float.valueOf(this.jlS);
        }
        if (jlL.equals(string)) {
            return Float.valueOf(this.jlT);
        }
        if (jlM.equals(string)) {
            return Float.valueOf(this.jlU);
        }
        return null;
    }

    public short cmL() {
        return this.jlP;
    }
}

