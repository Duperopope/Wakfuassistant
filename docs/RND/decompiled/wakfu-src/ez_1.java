/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EZ
 */
public final class ez_1 {
    public final String aAe;
    public final int aAf;

    public ez_1(String string, int n) {
        this.aAe = string;
        this.aAf = n;
    }

    public int hashCode() {
        return 31 * this.aAe.hashCode() + this.aAf;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ez_1)) {
            return false;
        }
        ez_1 ez_12 = (ez_1)object;
        return this.aAf == ez_12.aAf && this.aAe.equals(ez_12.aAe);
    }
}

