/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckO
 */
public class cko_0
extends nv_0 {
    private final String lYA;

    public cko_0(String string) {
        this.lYA = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lYA);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12926;
    }
}

