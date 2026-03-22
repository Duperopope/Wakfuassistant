/*
 * Decompiled with CFR 0.152.
 */
public class ciW
extends nv_0 {
    private final long lVD;
    private final byte lVE;

    public ciW(long l, byte by) {
        this.lVD = l;
        this.lVE = by;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lVD);
        azg_12.aF(this.lVE);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12484;
    }
}

