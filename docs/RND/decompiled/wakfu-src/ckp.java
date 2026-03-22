/*
 * Decompiled with CFR 0.152.
 */
public final class ckp
extends nv_0 {
    private final int lXX;
    private final boolean lXY;

    public ckp(int n, boolean bl) {
        this.lXX = n;
        this.lXY = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lXX);
        azg_12.aF(this.lXY ? (byte)1 : 0);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13901;
    }
}

