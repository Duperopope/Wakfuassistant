/*
 * Decompiled with CFR 0.152.
 */
public class cjU
extends nv_0 {
    private final long lXt;
    private final int lXu;

    public cjU(long l, int n) {
        this.lXt = l;
        this.lXu = n;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(12);
        azg_12.gK(this.lXt);
        azg_12.vC(this.lXu);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13770;
    }
}

