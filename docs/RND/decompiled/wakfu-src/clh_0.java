/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clH
 */
public class clh_0
extends nv_0 {
    private final String lZZ;
    private final String maa;

    public clh_0(String string, String string2) {
        this.lZZ = string;
        this.maa = string2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lZZ);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        byte[] byArray2 = BH.aP(this.maa);
        azg_12.vC(byArray2.length);
        azg_12.dH(byArray2);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12704;
    }
}

