/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from faG
 */
public interface fag_0 {
    default public long rT(long l) {
        return l * -1L;
    }

    default public long rU(long l) {
        return l * -1L;
    }

    default public boolean rV(long l) {
        return l < 0L;
    }

    default public boolean X(long l, long l2) {
        if (l2 <= 0L) {
            return false;
        }
        return l == this.rT(l2);
    }
}

