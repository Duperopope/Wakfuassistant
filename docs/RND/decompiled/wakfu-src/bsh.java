/*
 * Decompiled with CFR 0.152.
 */
public class bsh
implements aeh_2 {
    public static final String jfq = "description";
    public static final String jfr = "value";
    private final int jfs;

    public bsh(int n) {
        this.jfs = n;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jfq)) {
            return aum_0.cWf().c("realMonth." + this.jfs, new Object[0]);
        }
        if (string.equals(jfr)) {
            return this.jfs;
        }
        return null;
    }

    public int dFb() {
        return this.jfs;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }
}

