/*
 * Decompiled with CFR 0.152.
 */
public class cjn
extends nv_0 {
    private final long lWg;
    private final byte lWh;

    public cjn(long l, byte by) {
        this.lWg = l;
        this.lWh = by;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(9);
        azg_12.gK(this.lWg);
        azg_12.aF(this.lWh);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13051;
    }
}

