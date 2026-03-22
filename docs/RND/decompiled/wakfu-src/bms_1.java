/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bms
 */
public abstract class bms_1
implements aeh_2 {
    public static final String iBn = "name";
    public static final String iBo = "hasBook";
    public static final String iBp = "bookIconUrl";
    public static final String iBq = "buttonIconUrl";
    public static final String iBr = "isInnate";
    public static final String iBs = "isConceptual";
    public static final String iBt = "isUnknown";
    public static final String iBu = "isCraftServiceEnabled";
    public static final String iBv = "craftServiceMinLevel";
    public static final String iBw = "idString";
    protected final int iBx;
    private final eki_0 iBy;
    private final bgv_2 iBz;

    protected bms_1(int n, eki_0 eki_02) {
        this.iBx = n;
        this.iBy = eki_02;
        this.iBz = (bgv_2)fgD.fXh().Vd(eKQ.qEb.QV(this.iBx).fzd());
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "hasBook": {
                return this.iBz != null;
            }
            case "bookIconUrl": {
                return this.iBz != null ? this.iBz.eu("iconUrl") : null;
            }
            case "buttonIconUrl": {
                return auc_0.cVq().zE(this.iBx);
            }
            case "isUnknown": {
                return this.dwn();
            }
            case "isInnate": {
                return this.cmv();
            }
            case "isConceptual": {
                return this.dwi();
            }
            case "idString": {
                return String.valueOf(this.iBx);
            }
            case "isCraftServiceEnabled": {
                return this.dwl();
            }
            case "craftServiceMinLevel": {
                return this.dwm();
            }
        }
        return null;
    }

    public eki_0 cZr() {
        return this.iBy;
    }

    public String getName() {
        return bms_1.Dm(this.iBx);
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(43, (long)n, new Object[0]);
    }

    private boolean cmv() {
        return eKQ.qEb.QV(this.iBx).cmv();
    }

    private boolean dwi() {
        return eKQ.qEb.QV(this.iBx).cmw();
    }

    public void dwj() {
        if (this.iBz != null) {
            ((bfb_1)this.iBz.fUZ()).dET();
        }
    }

    public int dwk() {
        return this.iBx;
    }

    public boolean dwl() {
        return this.cZr().QO(this.iBx);
    }

    public int dwm() {
        return this.cZr().QN(this.iBx);
    }

    public abstract short cmL();

    public abstract boolean dwn();

    public abstract boolean dwo();

    public abstract boolean dwp();

    public abstract boolean dwq();
}

