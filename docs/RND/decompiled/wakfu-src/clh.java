/*
 * Decompiled with CFR 0.152.
 */
public class clh
extends nv_0 {
    private long htO;
    private int lZa;
    private boolean lZb;
    private int iMR;

    public void ng(long l) {
        this.htO = l;
    }

    public void Lc(int n) {
        this.lZa = n;
    }

    public void Kl(int n) {
        this.iMR = n;
    }

    public void jo(boolean bl) {
        this.lZb = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.htO);
        azg_12.vC(this.lZa);
        azg_12.aF((byte)(this.lZb ? 1 : 0));
        azg_12.vC(this.iMR);
        return this.a((byte)3, azg_12.bTe());
    }

    public long evy() {
        return this.htO;
    }

    @Override
    public int d() {
        return 13978;
    }
}

