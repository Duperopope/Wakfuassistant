/*
 * Decompiled with CFR 0.152.
 */
public class cws
extends nv_0 {
    private byte mkY;
    private int ejK;
    private int lGl;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.mkY);
        azg_12.vC(this.ejK);
        azg_12.vC(this.lGl);
        return this.a((byte)6, azg_12.bTe());
    }

    public void Lr(int n) {
        this.ejK = n;
    }

    public void dL(byte by) {
        this.mkY = by;
    }

    public void Lq(int n) {
        this.lGl = n;
    }

    @Override
    public int d() {
        return 14625;
    }
}

