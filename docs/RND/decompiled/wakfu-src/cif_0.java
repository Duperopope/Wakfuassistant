/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cif
 */
public class cif_0
extends nv_0 {
    private String cKf;
    private String lUx = "";

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.cKf);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        byte[] byArray2 = BH.aP(this.lUx);
        azg_12.vC(byArray2.length);
        azg_12.dH(byArray2);
        return this.a((byte)1, azg_12.bTe());
    }

    @Override
    public int d() {
        return 451;
    }

    public void kS(String string) {
        this.cKf = string;
    }

    public void or(String string) {
        this.lUx = string;
    }
}

