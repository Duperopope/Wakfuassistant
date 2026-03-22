/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clO
 */
public class clo_0
extends nv_0 {
    private final short mak;
    private final long mal;

    public clo_0(adD adD2, ahc_2 ahc_22) {
        this.mak = adD2.buM();
        this.mal = ahc_22.ccf();
    }

    public clo_0(short s, long l) {
        this.mak = s;
        this.mal = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aG(this.mak);
        azg_12.gK(this.mal);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12332;
    }
}

