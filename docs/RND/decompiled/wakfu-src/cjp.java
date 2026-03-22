/*
 * Decompiled with CFR 0.152.
 */
public class cjp
extends nv_0 {
    private final long lWi;
    private final long lWj;

    public cjp(long l, long l2) {
        this.lWi = l;
        this.lWj = l2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(16);
        azg_12.gK(this.lWi);
        azg_12.gK(this.lWj);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12089;
    }
}

