/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmL
 */
public class bml_2
implements aeh_2 {
    public static final String iEi = "name";
    public static final String iEj = "isMapAvailable";
    public static final String iEk = "instanceName";
    private final String iEl;
    private final int iEm;
    private final long iEn;

    public bml_2(int n, long l, String string) {
        this.iEl = string;
        this.iEm = n;
        this.iEn = l;
    }

    public bml_2(foM<?> foM2) {
        this.iEm = foM2.d();
        this.iEl = aum_0.cWf().a(66, (long)foM2.d(), new Object[0]);
        this.iEn = foM2.aqZ();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iEi)) {
            return this.iEl;
        }
        if (string.equals(iEj)) {
            if (aue_0.cVJ().c(ctw_1.eRl())) {
                return false;
            }
            biq_1 biq_12 = big_2.l(this.iEn, true);
            String string2 = biq_12 != null ? biq_12.dYr() : null;
            biq_1 biq_13 = big_2.y(this.iEm, this.iEn);
            string2 = biq_13 != null ? biq_13.dYr() : string2;
            return string2 != null && bl_0.bl(string2);
        }
        if (iEk.equals(string)) {
            return aum_0.cWf().a(77, this.iEn, new Object[0]);
        }
        return null;
    }

    public String getName() {
        return this.iEl;
    }

    public int clk() {
        return this.iEm;
    }

    public long bhh() {
        return this.iEn;
    }
}

