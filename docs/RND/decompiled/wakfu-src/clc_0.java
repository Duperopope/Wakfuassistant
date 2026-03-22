/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clC
 */
public class clc_0
extends nv_0 {
    private final String lZI;
    private final Integer lZJ;
    private final long lZK;
    private final short lZL;

    public clc_0(String string, Integer n, long l, short s) {
        this.lZI = string;
        this.lZJ = n;
        this.lZK = l;
        this.lZL = s;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lZI);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(this.lZJ);
        azg_12.gK(this.lZK);
        azg_12.aG(this.lZL);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13505;
    }
}

