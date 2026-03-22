/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHn
 */
public class bhn_2 {
    private Object jYN;
    private int jYO = 0;
    private long jYP = 0L;

    public boolean as(Object object) {
        int n = object.hashCode();
        boolean bl = object != this.jYN || n != this.jYO || System.currentTimeMillis() - this.jYP > 1000L;
        this.jYN = object;
        this.jYO = n;
        this.jYP = System.currentTimeMillis();
        return bl;
    }

    public void reset() {
        this.jYO = 0;
        this.jYP = 0L;
    }
}

