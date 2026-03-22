/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnf
 */
public class bnf_1
implements aeh_2 {
    public static final String iGt = "text";
    public static final String iGu = "iconUrl";
    public static final String iGv = "visible";
    private final int iGw;
    private final bne_1 iGx;
    private boolean bmg = false;
    public static final String[] iGy = new String[]{"text", "visible"};

    public bnf_1(int n, bne_1 bne_12) {
        this.iGw = n;
        this.iGx = bne_12;
    }

    @Override
    public String[] bxk() {
        return iGy;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iGt)) {
            switch (this.iGw) {
                case -2: {
                    return "[...]";
                }
                case -1: {
                    return aum_0.cWf().c("dialogEnd", new Object[0]);
                }
            }
            return aum_0.cWf().a(76, (long)this.iGw, new Object[0]);
        }
        if (string.equals(iGu)) {
            if (this.iGx == bne_1.iGh) {
                return null;
            }
            return auc_0.cVq().zI(this.iGx.d());
        }
        if (string.equals(iGv)) {
            return this.bmg;
        }
        return null;
    }

    public int d() {
        return this.iGw;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
        fse_1.gFu().a((aef_2)this, iGv);
    }
}

