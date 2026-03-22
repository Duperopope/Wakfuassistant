/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyK
 */
public class cyk_0
extends nv_0 {
    private long mmI;
    private long mmJ;

    public cyk_0(long l, long l2) {
        this.mmI = l;
        this.mmJ = l2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.mmI);
        azg_12.gK(this.mmJ);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 23315;
    }
}

