/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bTp
implements aeh_2 {
    public static final String lnJ = "categories";
    public static final String lnK = "selectedCategory";
    private final ArrayList<bTn> lnL = new ArrayList();
    private boolean lnM = true;

    public bTp(foP foP2) {
        this.lnL.add(new bTn(foP2, true));
        this.lnL.add(new bTn(foP2, false));
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lnJ)) {
            return this.lnL;
        }
        if (string.equals(lnK)) {
            return this.lnM ? this.lnL.get(0) : this.lnL.get(1);
        }
        return null;
    }

    public void setSelected(boolean bl) {
        this.lnM = bl;
        fse_1.gFu().a((aef_2)this, lnK);
    }

    public bTo D(int n, boolean bl) {
        return this.lnL.get(bl ? 0 : 1).Jy(n);
    }
}

