/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cic
 */
public class cic_0
extends nv_0 {
    private final byte lUs;
    private final int lUt;
    private final int lUu;

    public cic_0(byte by, int n, int n2) {
        this.lUs = by;
        this.lUt = n;
        this.lUu = n2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(8);
        azg_12.vC(this.lUt);
        azg_12.vC(this.lUu);
        return this.a(this.lUs, azg_12.bTe());
    }

    @Override
    public int d() {
        return 385;
    }
}

