/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCc
 */
public class acc_1 {
    private int bap;
    private int baq;

    public acc_1() {
    }

    public acc_1(acc_1 acc_12) {
        this.b(acc_12);
    }

    public acc_1(int n, int n2) {
        this.cG(n, n2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        acc_1 acc_12 = (acc_1)object;
        return this.bap == acc_12.bap && this.baq == acc_12.baq;
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.bap) + (long)this.baq;
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point2i : (" + this.bap + ", " + this.baq + ") @" + Integer.toHexString(this.hashCode()) + "}";
    }

    public final boolean cF(int n, int n2) {
        return this.bap == n && this.baq == n2;
    }

    public final boolean a(acc_1 acc_12) {
        return this.bap == acc_12.bap && this.baq == acc_12.baq;
    }

    public final void cG(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public final void b(acc_1 acc_12) {
        this.bap = acc_12.bap;
        this.baq = acc_12.baq;
    }

    public final int bWx() {
        return this.bap;
    }

    public final int bWy() {
        return this.baq;
    }

    public final void wO(int n) {
        this.bap = n;
    }

    public final void wP(int n) {
        this.baq = n;
    }
}

