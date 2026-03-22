/*
 * Decompiled with CFR 0.152.
 */
public class cjJ
extends nv_0 {
    private final int lWX;
    private final fp_1 lWY;

    public cjJ(int n, fp_1 fp_12) {
        this.lWX = n;
        this.lWY = fp_12;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(6 + this.lWY.getSerializedSize());
        azg_12.vC(this.lWX);
        byte[] byArray = this.lWY.toByteArray();
        azg_12.aG((short)byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12827;
    }
}

