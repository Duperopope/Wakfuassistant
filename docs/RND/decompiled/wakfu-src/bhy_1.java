/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHy
 */
public abstract class bhy_1
implements aeh_2 {
    public static final String kaO = "totalTaxFactor";
    public static final String kaP = "taxFactorBreakdown";
    public static final String kaQ = "totalTaxes";
    protected static final String[] kaR = new String[]{"totalTaxFactor", "taxFactorBreakdown", "totalTaxes"};

    public abstract long akd();

    public abstract int oP();

    @Nullable
    public abstract big_1 dUX();

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "totalTaxFactor": {
                return this.dWk();
            }
            case "taxFactorBreakdown": {
                return this.dWl();
            }
            case "totalTaxes": {
                return this.dWh();
            }
        }
        return null;
    }

    protected long dWg() {
        long l = this.dWh();
        long l2 = aue_0.cVJ().cVK().cWp().exS();
        if (l < 0L) {
            return l2;
        }
        return l2 - l;
    }

    public long dWh() {
        if (this.dUX() == null) {
            return 0L;
        }
        long l = (long)((double)((long)this.oP() * this.akd()) * this.dUX().dXx().gaM());
        return frn.sXO.b(aue_0.cVJ().cVK(), frk.sXG, l);
    }

    protected boolean dWi() {
        long l = this.dWh();
        if (l < 0L) {
            return false;
        }
        return aue_0.cVJ().cVK().cWp().exS() >= l;
    }

    protected boolean dWj() {
        long l = this.dWh();
        if (l < 0L) {
            return false;
        }
        return aue_0.cVJ().cVK().cWp().exS() >= l + (long)this.oP() * this.akd();
    }

    private String dWk() {
        if (this.dUX() == null) {
            return null;
        }
        double d2 = bhy_1.dWm() * this.dUX().dXx().gaM();
        return bhy_1.a(d2, true, true);
    }

    private String dWl() {
        if (this.dUX() == null) {
            return null;
        }
        String string = bhy_1.a(this.dUX().dXx().gaM(), false, false);
        String string2 = bhy_1.a(bhy_1.dWm(), false, false);
        return aum_0.cWf().c("market.sell.tax.breakdown", string, string2);
    }

    private static double dWm() {
        return frn.sXO.a(aue_0.cVJ().cVK(), frk.sXG);
    }

    private static String a(double d2, boolean bl, boolean bl2) {
        ahv_2 ahv_22 = new ahv_2();
        if (bl) {
            ahv_22.e(bhy_1.Y(d2));
        }
        ahv_22.S(GC.b(d2 * 100.0, 2));
        if (bl2) {
            ahv_22.c(" %");
        }
        if (bl) {
            ahv_22.ceD();
        }
        return ahv_22.ceL();
    }

    private static axb_2 Y(double d2) {
        if (d2 < 0.2) {
            return new fhl_2(ett_1.opo);
        }
        if (d2 < 0.4) {
            return new fhl_2(ett_1.opn);
        }
        return new fhl_2(ett_1.opm);
    }

    @Override
    public String[] bxk() {
        return kaR;
    }
}

