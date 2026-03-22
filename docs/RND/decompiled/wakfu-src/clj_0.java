/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clJ
 */
public class clj_0
extends nv_0 {
    private final String mae;
    private final String maf;
    private final String mag;

    public clj_0(String string, String string2, String string3) {
        this.mae = string;
        this.maf = string2;
        this.mag = string3;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.mae);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        byte[] byArray2 = BH.aP(this.maf);
        azg_12.aF((byte)byArray2.length);
        azg_12.dH(byArray2);
        byte[] byArray3 = BH.aP(this.mag);
        azg_12.aF((byte)byArray3.length);
        azg_12.dH(byArray3);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13761;
    }
}

