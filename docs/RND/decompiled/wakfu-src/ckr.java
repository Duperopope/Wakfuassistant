/*
 * Decompiled with CFR 0.152.
 */
public class ckr
extends nv_0 {
    private long aZQ;
    private int bap;
    private int baq;
    private short ban;
    private boolean lYa;
    private byte lYb = 1;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aZQ);
        azg_12.vC(this.bap);
        azg_12.vC(this.baq);
        azg_12.aG(this.ban);
        azg_12.aF(this.lYa ? (byte)1 : 0);
        azg_12.aF(this.lYb);
        return this.a((byte)3, azg_12.bTe());
    }

    public void mY(long l) {
        this.aZQ = l;
    }

    public void Z(int n, int n2, short s) {
        this.bap = n;
        this.baq = n2;
        this.ban = s;
    }

    public void jl(boolean bl) {
        this.lYa = bl;
    }

    public void dm(byte by) {
        this.lYb = by;
    }

    @Override
    public int d() {
        return 13329;
    }
}

