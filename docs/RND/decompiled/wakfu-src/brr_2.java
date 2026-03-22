/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRR
 */
public class brr_2
extends brn_2 {
    public static final String lcR = "title";
    public static final String lcS = "nbMandates";
    static final String[] lcT;
    static final String[] lcU;
    private int lcV;
    private brq_2 lcW;

    public brr_2(fkH fkH2) {
        super(fkH2);
        fkS fkS2 = (fkS)fkH2.gcu();
        this.lcV = fkS2.gcF();
        this.lcW = brx_1.elI().cv(fkS2.elB());
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lcR)) {
            return this.lcW == null ? null : this.lcW;
        }
        if (string.equals("isGovernor")) {
            return true;
        }
        if (string.equals(lcS)) {
            return this.lcV;
        }
        return super.eu(string);
    }

    public void a(brq_2 brq_22) {
        this.lcW = brq_22;
    }

    public brq_2 elC() {
        return this.lcW;
    }

    @Override
    public String[] bxk() {
        return lcT;
    }

    static {
        lcU = new String[]{lcR, lcS};
        lcT = new String[lcU.length + brn_2.lcs.length];
        System.arraycopy(lcU, 0, lcT, 0, lcU.length);
        System.arraycopy(brn_2.lcs, 0, lcT, lcU.length, brn_2.lcs.length);
    }
}

