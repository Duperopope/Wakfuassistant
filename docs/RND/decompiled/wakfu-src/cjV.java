/*
 * Decompiled with CFR 0.152.
 */
public class cjV
extends nv_0 {
    private final long lXv;
    private final boolean lXw;

    public cjV(long l, boolean bl) {
        this.lXv = l;
        this.lXw = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(9);
        azg_12.gK(this.lXv);
        azg_12.dz(this.lXw);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12633;
    }
}

