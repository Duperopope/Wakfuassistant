/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckX
 */
public class ckx_0
extends nv_0 {
    private final long lYP;
    private final long lYQ;

    public ckx_0(long l, long l2) {
        this.lYP = l;
        this.lYQ = l2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lYP);
        azg_12.gK(this.lYQ);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12142;
    }
}

