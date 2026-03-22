/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cwr
 */
public class cwr_0
extends nv_0 {
    private eKR iFe;
    private int lGl;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.iFe.cms());
        azg_12.aG(this.iFe.dxy());
        azg_12.vC(this.iFe.d());
        azg_12.vC(this.lGl);
        azg_12.dz(this.iFe.c(eKS.qEv));
        return this.a((byte)6, azg_12.bTe());
    }

    public void g(eKR eKR2) {
        this.iFe = eKR2;
    }

    public void Lq(int n) {
        this.lGl = n;
    }

    @Override
    public int d() {
        return 15843;
    }
}

