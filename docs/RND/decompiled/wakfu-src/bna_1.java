/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bnA
 */
public class bna_1
implements aeh_2 {
    public static final String iIY = "date";
    public static final String iIZ = "sales";
    public static final String iJa = "totalSales";
    private final ux_0 iJb;
    private final azz_1<bnc_0> iJc = new azz_1<bnc_0>(new bnb_1(this));
    public static final String[] iJd = new String[]{"date", "sales"};

    public bna_1(ux_0 ux_02) {
        this.iJb = new uw_0(ux_02);
    }

    public void a(bnc_0 bnc_02) {
        this.iJc.add(bnc_02);
    }

    @Override
    public String[] bxk() {
        return iJd;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iIY)) {
            return aum_0.cWf().t(this.iJb);
        }
        if (string.equals(iIZ)) {
            return this.iJc;
        }
        if (string.equals(iJa)) {
            int n = 0;
            for (int i = this.iJc.size() - 1; i >= 0; --i) {
                n = (int)((long)n + ((bnc_0)this.iJc.get(i)).dzt());
            }
            return n;
        }
        return null;
    }

    public int dzq() {
        int n = 0;
        for (int i = this.iJc.size() - 1; i >= 0; --i) {
            n += ((bnc_0)this.iJc.get(i)).dzs();
        }
        return n;
    }

    public List<bnc_0> dzr() {
        return this.iJc;
    }

    public ux_0 bjc() {
        return this.iJb;
    }
}

