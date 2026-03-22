/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cxv
 */
public class cxv_0
extends nv_0 {
    private final String mlN;

    public cxv_0(String string) {
        this.mlN = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mlN);
        azg_1 azg_12 = new azg_1();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)6, azg_12.bTe());
    }

    @Override
    public int d() {
        return 15141;
    }
}

