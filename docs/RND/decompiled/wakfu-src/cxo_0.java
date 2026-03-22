/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cxo
 */
public class cxo_0
extends nv_0 {
    private String mlI;
    private long mln;

    public void oB(String string) {
        this.mlI = string;
    }

    public void nJ(long l) {
        this.mln = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(2 + this.mlI.length() + 4);
        azg_12.gV(this.mlI);
        azg_12.gK(this.mln);
        return this.a((byte)6, azg_12.bTe());
    }

    @Override
    public int d() {
        return 14292;
    }
}

