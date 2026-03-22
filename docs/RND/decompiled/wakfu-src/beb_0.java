/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEB
 */
public class beb_0
implements aeh_2 {
    public static final String jPg = "duration";
    public static final String jPh = "selected";
    public static final String jPi = "taxFactor";
    private final fnl jPj;
    private boolean bWn;
    public final String[] jPk = new String[]{"duration", "selected", "taxFactor"};

    public beb_0(fnl fnl2, boolean bl) {
        this.jPj = fnl2;
        this.bWn = bl;
    }

    public String dSt() {
        long l = this.jPj.sIt / 3600000L;
        long l2 = l / 24L;
        long l3 = l % 24L;
        return aum_0.cWf().c("remainingDurationShortMonthDayHour", 0, l2, l3);
    }

    public fnl dSu() {
        return this.jPj;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Override
    public String[] bxk() {
        return this.jPk;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jPg)) {
            return this.dSt();
        }
        if (string.equals(jPh)) {
            return this.bWn;
        }
        if (string.equals(jPi)) {
            return aum_0.cWf().c("desc.taxFactor", (int)(this.jPj.sIv * 100.0));
        }
        return null;
    }

    public String toString() {
        return this.dSt();
    }
}

