/*
 * Decompiled with CFR 0.152.
 */
public final class fkL
extends Enum<fkL>
implements aoq_1 {
    public static final /* enum */ fkL sCr = new fkL(1L, "Gouverneur");
    public static final /* enum */ fkL sCs = new fkL(2L, "Vice-gouverneur");
    public static final /* enum */ fkL sCt = new fkL(3L, "Pr\u00e9v\u00f4t");
    public static final /* enum */ fkL sCu = new fkL(4L, "G\u00e9n\u00e9ral");
    public static final /* enum */ fkL sCv = new fkL(5L, "M\u00e9t\u00e9orologiste");
    public static final /* enum */ fkL sCw = new fkL(6L, "Tr\u00e9sorier");
    public static final /* enum */ fkL sCx = new fkL(7L, "Challenger");
    public static final /* enum */ fkL sCy = new fkL(8L, "Espion");
    public static final /* enum */ fkL sCz = new fkL(9L, "Assassin");
    public static final /* enum */ fkL sCA = new fkL(10L, "Zoologiste");
    private final byte sCB;
    private final long sCC;
    private final String sCD;
    private float sCE;
    private int epz;
    private ang_2 bfe = null;
    private static final /* synthetic */ fkL[] sCF;

    public static fkL[] values() {
        return (fkL[])sCF.clone();
    }

    public static fkL valueOf(String string) {
        return Enum.valueOf(fkL.class, string);
    }

    private fkL(long l, String string2) {
        this.sCB = (byte)l;
        this.sCC = 1 << (int)l;
        this.sCD = string2;
    }

    public static fkL ue(long l) {
        for (fkL fkL2 : fkL.values()) {
            if (fkL2.Sn() != l) continue;
            return fkL2;
        }
        return null;
    }

    public long Sn() {
        return this.sCC;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sCC);
    }

    @Override
    public String aXB() {
        return this.sCD;
    }

    @Override
    public String aXC() {
        return null;
    }

    public void j(ang_2 ang_22) {
        this.bfe = ang_22;
    }

    public ang_2 bdo() {
        return this.bfe;
    }

    public void fe(float f2) {
        this.sCE = f2;
    }

    public float gcB() {
        return this.sCE;
    }

    public byte gcC() {
        return this.sCB;
    }

    public int ctc() {
        return this.epz;
    }

    public void WQ(int n) {
        this.epz = n;
    }

    public String toString() {
        return "NationRank{m_baseId=" + this.sCB + ", m_id=" + this.sCC + ", m_label='" + this.sCD + "', m_pdcLossFactor=" + this.sCE + ", m_citizenScoreLine=" + this.epz + ", m_criterion=" + String.valueOf(this.bfe) + "}";
    }

    private static /* synthetic */ fkL[] gcD() {
        return new fkL[]{sCr, sCs, sCt, sCu, sCv, sCw, sCx, sCy, sCz, sCA};
    }

    static {
        sCF = fkL.gcD();
    }
}

