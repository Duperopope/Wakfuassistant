/*
 * Decompiled with CFR 0.152.
 */
public final class cjm
extends nv_0 {
    private long aDh;
    private byte lWf;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        azg_12.aF(this.lWf);
        return this.a((byte)3, azg_12.bTe());
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dj(byte by) {
        this.lWf = by;
    }

    @Override
    public int d() {
        return 13544;
    }
}

