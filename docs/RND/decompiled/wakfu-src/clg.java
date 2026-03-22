/*
 * Decompiled with CFR 0.152.
 */
public final class clg
extends nv_0 {
    private long htO;
    private fcx_0 lYZ;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.lYZ.apI();
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.htO);
        azg_12.aG(this.lYZ.aIi());
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12497;
    }

    public void ng(long l) {
        this.htO = l;
    }

    public void a(fcx_0 fcx_02) {
        this.lYZ = fcx_02;
    }
}

