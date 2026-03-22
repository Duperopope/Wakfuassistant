/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clm
 */
public final class clm_0
extends nv_0 {
    private final fhw_0 lZg;
    private final long lZh;
    private final byte lZi;

    public clm_0(fhw_0 fhw_02, long l, byte by) {
        this.lZg = fhw_02;
        this.lZh = l;
        this.lZi = by;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(10);
        azg_12.aF(this.lZg.aJr());
        azg_12.gK(this.lZh);
        azg_12.aF(this.lZi);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12616;
    }
}

