/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clD
 */
public class cld_0
extends nv_0 {
    private String lZM;
    private long lVH;
    private String lZN;
    private Integer lZO;

    public cld_0(String string, long l, String string2, Integer n) {
        this.lZM = string;
        this.lVH = l;
        this.lZN = string2;
        this.lZO = n;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lZM);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        azg_12.gK(this.lVH);
        byte[] byArray2 = BH.aP(this.lZN);
        azg_12.aF((byte)byArray2.length);
        azg_12.dH(byArray2);
        azg_12.vC(this.lZO);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12374;
    }
}

