/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clE
 */
public class cle_0
extends nv_0 {
    private final String lZP;
    private final long lZQ;
    private final int lZR;
    private final long lZS;
    private final long lZT;
    private final int lZU;
    private final short lZV;

    public cle_0(String string, long l, int n, long l2, long l3, int n2, short s) {
        this.lZP = string;
        this.lZQ = l;
        this.lZR = n;
        this.lZS = l2;
        this.lZT = l3;
        this.lZU = n2;
        this.lZV = s;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.lZP);
        int n = 1 + byArray.length + 8 + 4 + 8 + 8 + 4 + 2;
        azg_1 azg_12 = new azg_1(n);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        azg_12.gK(this.lZQ);
        azg_12.vC(this.lZR);
        azg_12.gK(this.lZS);
        azg_12.gK(this.lZT);
        azg_12.vC(this.lZU);
        azg_12.aG(this.lZV);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12726;
    }
}

