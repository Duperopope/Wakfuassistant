/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAI
 */
class fai_2
implements aao_2 {
    final int tPn;
    final int tPo;
    final int tPp;
    final int tPq;
    final int tPr;
    final /* synthetic */ fad_1 tPs;

    public fai_2(fad_1 fad_12, int n, int n2, int n3, int n4, int n5) {
        this.tPs = fad_12;
        this.tPn = n;
        this.tPo = n2;
        this.tPp = n3;
        this.tPq = n4;
        this.tPr = n5;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.tPs.isUnloading()) {
            return false;
        }
        this.tPs.getAppearance().gqU();
        flp_2 flp_22 = flp_2.gEp();
        flp_22.NQ(this.tPn);
        flp_22.aca(this.tPo);
        flp_22.abZ(this.tPp);
        flp_22.qu(this.tPq);
        flp_22.qv(this.tPr);
        flp_22.x((fhv_1)this.tPs);
        flp_22.b(fzq_0.tJU);
        this.tPs.h(flp_22);
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

