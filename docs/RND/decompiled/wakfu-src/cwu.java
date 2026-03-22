/*
 * Decompiled with CFR 0.152.
 */
public class cwu
extends nv_0 {
    private byte mkY;
    private int ejK;
    private String p;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.mkY);
        azg_12.vC(this.ejK);
        byte[] byArray = BH.aP(this.p);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)6, azg_12.bTe());
    }

    public void dL(byte by) {
        this.mkY = by;
    }

    public void setName(String string) {
        this.p = string;
    }

    @Override
    public int d() {
        return 15017;
    }

    public void Lr(int n) {
        this.ejK = n;
    }
}

