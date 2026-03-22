/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccr
 */
class ccr_0
extends aft_2 {
    final /* synthetic */ bhJ lOK;
    final /* synthetic */ int lOL;
    final /* synthetic */ long lOM;
    final /* synthetic */ bgt_0 lON;

    ccr_0(int n, int n2, int n3, bhJ bhJ2, int n4, long l, bgt_0 bgt_02) {
        this.lOK = bhJ2;
        this.lOL = n4;
        this.lOM = l;
        this.lON = bgt_02;
        super(n, n2, n3);
    }

    @Override
    public void run() {
        this.lOK.CR(this.lOL);
        if (this.lOM == this.lON.Sn()) {
            bqm_0.jbp.b(new brs_1());
        }
        this.caT();
    }

    @Override
    protected void caV() {
    }
}

