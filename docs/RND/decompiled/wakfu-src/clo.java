/*
 * Decompiled with CFR 0.152.
 */
public class clo
extends nv_0 {
    private final long lZj;
    private final int lZk;

    public clo(long l, int n) {
        this.lZj = l;
        this.lZk = n;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lZj);
        azg_12.vC(this.lZk);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12479;
    }
}

