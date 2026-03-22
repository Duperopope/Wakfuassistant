/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cij
 */
public class cij_0
extends nv_0 {
    private String lUC;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lUC);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 544;
    }

    public void ot(String string) {
        this.lUC = string;
    }
}

