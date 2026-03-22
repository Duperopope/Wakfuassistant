/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmJ
 */
public class cmj_0
extends nv_0 {
    private final long maU;
    private final long maV;
    private final long maW;

    public cmj_0(long l, long l2, long l3) {
        this.maU = l;
        this.maV = l2;
        this.maW = l3;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.maU);
        azg_12.gK(this.maV);
        azg_12.gK(this.maW);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12401;
    }
}

