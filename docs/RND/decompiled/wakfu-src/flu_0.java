/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flu
 */
public final class flu_0 {
    private final fjn_0 sEu;

    public flu_0(fjn_0 fjn_02) {
        this.sEu = fjn_02;
    }

    public long ul(long l) {
        long l2 = GC.a(l, 0L, Integer.MAX_VALUE);
        this.sEu.tO(l2);
        return this.sEu.gbc();
    }

    public long WW(int n) {
        return this.ul(this.sEu.gbc() + (long)n);
    }

    public long WX(int n) {
        return this.ul(this.sEu.gbc() - (long)n);
    }
}

