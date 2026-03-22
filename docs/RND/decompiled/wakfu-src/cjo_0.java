/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjO
 */
public class cjo_0
extends nv_0 {
    private final long lXo;
    private final boolean lXp;

    public cjo_0(long l, boolean bl) {
        this.lXo = l;
        this.lXp = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lXo);
        azg_12.dz(this.lXp);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12192;
    }
}

