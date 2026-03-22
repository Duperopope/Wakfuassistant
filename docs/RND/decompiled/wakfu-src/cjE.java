/*
 * Decompiled with CFR 0.152.
 */
public class cjE
extends nv_0 {
    private final int lWM;
    private final long lWN;
    private final boolean lWO;

    public cjE(int n, long l, boolean bl) {
        this.lWM = n;
        this.lWN = l;
        this.lWO = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lWM);
        azg_12.gK(this.lWN);
        azg_12.aF((byte)(this.lWO ? 1 : 0));
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13210;
    }
}

