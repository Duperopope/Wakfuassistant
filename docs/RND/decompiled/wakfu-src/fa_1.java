/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fa
 */
public final class fa_1 {
    public final int aAg;
    public final int aAh;

    public fa_1(int n, int n2) {
        this.aAg = n;
        this.aAh = n2;
    }

    public int hashCode() {
        return 31 * this.aAg + this.aAh;
    }

    public boolean equals(Object object) {
        if (!(object instanceof fa_1)) {
            return false;
        }
        fa_1 fa_12 = (fa_1)object;
        return this.aAg == fa_12.aAg && this.aAh == fa_12.aAh;
    }
}

