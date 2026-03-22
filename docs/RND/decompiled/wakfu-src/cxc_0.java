/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cxc
 */
public class cxc_0
extends nv_0 {
    private String iYE;
    private int kNW;
    private boolean mlC;
    private boolean mlD;

    public cxc_0() {
        this("", 1, true, true);
    }

    public cxc_0(String string, int n, boolean bl, boolean bl2) {
        this.iYE = string.toLowerCase();
        this.kNW = n;
        this.mlC = bl;
        this.mlD = bl2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.iYE);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(this.kNW);
        azg_12.aF(this.mlC ? (byte)1 : 0);
        azg_12.aF(this.mlD ? (byte)1 : 0);
        return this.a((byte)6, azg_12.bTe());
    }

    @Override
    public int d() {
        return 1058;
    }
}

