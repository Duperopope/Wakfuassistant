/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cly
 */
public class cly_0
extends nv_0 {
    private long lZB;
    private byte lZC;
    private long lZD;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lZB);
        azg_12.aF(this.lZC);
        azg_12.gK(this.lZD);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13466;
    }

    public void du(byte by) {
        this.lZC = by;
    }

    public void np(long l) {
        this.lZB = l;
    }

    public void nq(long l) {
        this.lZD = l;
    }
}

