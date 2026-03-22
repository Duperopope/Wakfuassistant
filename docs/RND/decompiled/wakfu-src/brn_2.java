/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRN
 */
public class brn_2
extends brd_2 {
    public static final String lcr = "speech";
    static final String[] lcs;
    static final String[] lct;
    private String lcu;

    public brn_2(fkH fkH2) {
        super(fkH2);
        fkU fkU2 = (fkU)((Object)fkH2.gcu());
        this.lcu = fkU2.gct();
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lcr)) {
            String string2 = brx_1.elI().emt();
            String string3 = this.lcu.isEmpty() ? null : this.lcu;
            return string2 != null ? string2 : string3;
        }
        return super.eu(string);
    }

    @Override
    public String[] bxk() {
        return lcs;
    }

    public void nw(String string) {
        this.lcu = string;
    }

    static {
        lct = new String[]{lcr};
        lcs = new String[lct.length + brd_2.lbk.length];
        System.arraycopy(lct, 0, lcs, 0, lct.length);
        System.arraycopy(brd_2.lbk, 0, lcs, lct.length, brd_2.lbk.length);
    }
}

