/*
 * Decompiled with CFR 0.152.
 */
public class cwt
extends nv_0 {
    private byte mkY;
    private long aDL;
    private int ejK;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.mkY);
        azg_12.gK(this.aDL);
        azg_12.vC(this.ejK);
        return this.a((byte)6, azg_12.bTe());
    }

    public void jQ(long l) {
        this.aDL = l;
    }

    public void Lr(int n) {
        this.ejK = n;
    }

    public void dL(byte by) {
        this.mkY = by;
    }

    @Override
    public int d() {
        return 15325;
    }
}

