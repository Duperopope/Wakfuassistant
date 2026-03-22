/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blj
 */
public abstract class blj_0
implements aeh_2,
blk_0 {
    public static final String itn = "maxQuantity";
    public static final String ito = "quantity";
    public static final String itp = "quantityRatio";
    public static final String itq = "currentPlayerQuantity";
    public static final String itr = "maxPlayerQuantity";
    public static final String its = "totalPlayerQuantity";
    public static final String itt = "canMax";
    public static final String itu = "valid";
    public static final String itv = "editable";
    public static final String itw = "citizenPoints";
    public static final String itx = "citizenPointsText";
    private final String[] ity = new String[]{"maxQuantity", "quantity", "quantityRatio", "currentPlayerQuantity", "maxPlayerQuantity", "totalPlayerQuantity", "canMax", "valid", "editable", "citizenPoints", "citizenPointsText"};
    private int itz = 0;

    @Override
    public String[] bxk() {
        return this.ity;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(itq)) {
            return this.dtv();
        }
        if (string.equals(ito)) {
            return this.dtu();
        }
        if (string.equals(itn)) {
            return this.getMaxQuantity();
        }
        if (string.equals(itr)) {
            return this.dts();
        }
        if (string.equals(itp)) {
            return Float.valueOf((float)this.dtu() / (float)this.getMaxQuantity());
        }
        if (string.equals(its)) {
            return this.dts();
        }
        if (string.equals(itt)) {
            return this.dtw();
        }
        if (string.equals(itu)) {
            return this.isValid();
        }
        if (string.equals(itw)) {
            return 0;
        }
        if (string.equals(itx)) {
            return aum_0.cWf().c("chaos.citizenPointsNeeded", 1, 50);
        }
        if (string.equals(itv)) {
            return this.dtq();
        }
        return null;
    }

    private Boolean dtq() {
        return this.dtr() > 0L && this.dtt() > 0L;
    }

    private boolean isValid() {
        return this.dtv() > 0L && this.dtt() > 0L;
    }

    @Override
    public long dtr() {
        return Math.min(this.dtt(), this.dts());
    }

    @Override
    public abstract long dts();

    @Override
    public long dtt() {
        return this.getMaxQuantity() - this.dtu();
    }

    @Override
    public abstract long getMaxQuantity();

    @Override
    public abstract long dtu();

    @Override
    public long dtv() {
        return this.itz;
    }

    @Override
    public void DC(int n) {
        this.itz = n;
    }

    @Override
    public boolean dtw() {
        return this.dtv() != this.getMaxQuantity() && (this.isValid() || this.dtv() == 0L && this.dtt() > 0L && this.dtr() > 0L);
    }
}

