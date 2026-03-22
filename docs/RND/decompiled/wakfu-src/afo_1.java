/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFo
 */
public class afo_1 {
    private final String dIf;
    public final Class dIg;
    private final String dIh;

    public afo_1(String string, Class clazz) {
        this.dIf = string;
        this.dIg = clazz;
        int n = this.dIf.indexOf(46);
        this.dIh = n == -1 ? "" : this.dIf.substring(0, n);
    }

    public String caj() {
        return this.dIh;
    }

    public boolean cak() {
        return this.dIh.length() == 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        afo_1 afo_12 = (afo_1)object;
        if (!this.dIg.equals(afo_12.dIg)) {
            return false;
        }
        return this.dIf.equals(afo_12.dIf);
    }

    public int hashCode() {
        int n = this.dIf.hashCode();
        n = 31 * n + this.dIg.hashCode();
        return n;
    }
}

