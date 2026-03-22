/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnR
 */
public final class cnr_0
extends nv_0 {
    private long aDh;

    public cnr_0(long l) {
        this.aDh = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        return this.a((byte)3, azg_12.bTe());
    }

    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public int d() {
        return 13489;
    }
}

