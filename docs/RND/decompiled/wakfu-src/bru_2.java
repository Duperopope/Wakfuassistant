/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRu
 */
public abstract class bru_2
implements aeh_2 {
    public static final String laL = "name";
    public static final String laM = "enabled";
    public static final String[] laN = new String[]{"name", "enabled"};
    protected final int laO;
    protected boolean cHn;

    public bru_2(int n) {
        if (n == 2) {
            this.cHn = true;
        }
        this.laO = n;
    }

    @Override
    public String[] bxk() {
        return laN;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(laL)) {
            return this.getName();
        }
        if (string.equals(laM)) {
            return this.cHn;
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().c("temporaryAmaknaArchipelagoName." + this.laO, new Object[0]);
    }

    public int ekT() {
        return this.laO;
    }

    public boolean isEnabled() {
        return this.cHn;
    }
}

