/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cii
 */
public class cii_0
extends nv_0 {
    private byte[] lUB;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lUB.length);
        azg_12.dH(this.lUB);
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 575;
    }

    public void ei(byte[] byArray) {
        this.lUB = (byte[])byArray.clone();
    }
}

