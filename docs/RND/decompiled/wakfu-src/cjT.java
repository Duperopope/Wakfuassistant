/*
 * Decompiled with CFR 0.152.
 */
public class cjT
extends nv_0 {
    private long aDh;
    private int iMR;
    private long aHT;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        azg_12.vC(this.iMR);
        azg_12.gK(this.aHT);
        return this.a((byte)3, azg_12.bTe());
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void Kl(int n) {
        this.iMR = n;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    @Override
    public int d() {
        return 13969;
    }
}

