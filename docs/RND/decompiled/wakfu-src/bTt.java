/*
 * Decompiled with CFR 0.152.
 */
public class bTt
implements aeh_2 {
    public static final String lnV = "name";
    public static final String lnW = "amount";
    public static final String lnX = "amountValue";
    private final fpf lnY;
    private final fpg<bJr> lnZ;

    public bTt(fpf fpf2, fpg<bJr> fpg2) {
        this.lnY = fpf2;
        this.lnZ = fpg2;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lnV)) {
            return aum_0.cWf().c("protector.wallet.context.name." + this.lnY.sNB, new Object[0]);
        }
        if (string.equals(lnW)) {
            return this.lnZ.c(this.lnY) + "\u00a7";
        }
        if (string.equals(lnX)) {
            return this.lnZ.c(this.lnY);
        }
        return null;
    }

    public fpf enz() {
        return this.lnY;
    }

    public fpg<bJr> enA() {
        return this.lnZ;
    }

    void cAN() {
        fse_1.gFu().a((aef_2)this, lnW, lnX);
    }
}

