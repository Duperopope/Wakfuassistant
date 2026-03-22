/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRM
 */
public class brm_2
extends brd_2 {
    public static final String lcn = "rank";
    static final String[] lco;
    static final String[] lcp;
    private bsp_2 lcq;

    public brm_2(fkH fkH2, bsp_2 bsp_22) {
        super(fkH2);
        this.lcq = bsp_22;
    }

    @Override
    public String[] bxk() {
        return lco;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lcn)) {
            return this.lcq;
        }
        return super.eu(string);
    }

    static {
        lcp = new String[]{lcn};
        lco = new String[lcp.length + brd_2.lbk.length];
        System.arraycopy(lcp, 0, lco, 0, lcp.length);
        System.arraycopy(brd_2.lbk, 0, lco, lcp.length, brd_2.lbk.length);
    }
}

