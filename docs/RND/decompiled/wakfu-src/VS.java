/*
 * Decompiled with CFR 0.152.
 */
public final class VS
extends Enum<VS>
implements aoq_1 {
    public static final /* enum */ VS bKA = new VS(0, "Toutes", null);
    public static final /* enum */ VS bKB = new VS(1, "Fran\u00e7ais", Mv.aVk);
    public static final /* enum */ VS bKC = new VS(2, "Anglais", Mv.aVl);
    public static final /* enum */ VS bKD = new VS(3, "Allemand", Mv.aVo);
    public static final /* enum */ VS bKE = new VS(4, "Espagnol", Mv.aVm);
    public static final /* enum */ VS bKF = new VS(5, "Italien", Mv.aVp);
    public static final /* enum */ VS bKG = new VS(6, "Portugais", Mv.aVn);
    public static final /* enum */ VS bKH = new VS(8, "Tagalog", Mv.aVw);
    public static final /* enum */ VS bKI = new VS(9, "Malay", Mv.aVv);
    private final short bKJ;
    private final String bKK;
    private final Mv bKL;
    private final boolean bKM;
    private static final /* synthetic */ VS[] bKN;

    public static VS[] values() {
        return (VS[])bKN.clone();
    }

    public static VS valueOf(String string) {
        return Enum.valueOf(VS.class, string);
    }

    private VS(short s, String string2, Mv mv) {
        this(s, string2, mv, false);
    }

    private VS(short s, String string2, Mv mv, boolean bl) {
        this.bKJ = s;
        this.bKK = string2;
        this.bKL = mv;
        this.bKM = bl;
    }

    public short aIi() {
        return this.bKJ;
    }

    public boolean bkU() {
        return this.bKM;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.bKJ);
    }

    @Override
    public String aXB() {
        return this.bKK;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static VS ao(short s) {
        for (VS vS : VS.values()) {
            if (vS.bKJ != s) continue;
            return vS;
        }
        return null;
    }

    public static VS e(Mv mv) {
        for (VS vS : VS.values()) {
            if (vS.bKL != mv) continue;
            return vS;
        }
        return bKA;
    }

    private static /* synthetic */ VS[] bkV() {
        return new VS[]{bKA, bKB, bKC, bKD, bKE, bKF, bKG, bKH, bKI};
    }

    static {
        bKN = VS.bkV();
    }
}

