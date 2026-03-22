/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnS
 */
public class cns_0
extends nv_0 {
    private int asJ;
    private byte iag;
    private long mcm;
    private boolean iah;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.asJ);
        azg_12.aF(this.iag);
        azg_12.gK(this.mcm);
        azg_12.aF((byte)(this.iah ? 1 : 0));
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12088;
    }

    public int aGD() {
        return this.asJ;
    }

    public void lW(int n) {
        this.asJ = n;
    }

    public void nG(long l) {
        this.mcm = l;
    }

    public void dJ(byte by) {
        this.iag = by;
    }

    public void ju(boolean bl) {
        this.iah = bl;
    }
}

