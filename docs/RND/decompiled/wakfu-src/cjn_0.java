/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjN
 */
public class cjn_0
extends nv_0 {
    private final long lXk;
    private final int lXl;
    private final long lXm;
    private final int lXn;

    public cjn_0(long l, int n, long l2, int n2) {
        this.lXk = l;
        this.lXl = n;
        this.lXm = l2;
        this.lXn = n2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(24);
        azg_12.gK(this.lXk);
        azg_12.vC(this.lXl);
        azg_12.gK(this.lXm);
        azg_12.vC(this.lXn);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13404;
    }
}

