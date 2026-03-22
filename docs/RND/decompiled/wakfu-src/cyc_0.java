/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyC
 */
public class cyc_0
extends nv_0 {
    private String lWH;

    public void oC(String string) {
        this.lWH = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lWH.length());
        byte[] byArray = BH.aP(this.lWH);
        azg_12.dH(byArray);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 22567;
    }
}

