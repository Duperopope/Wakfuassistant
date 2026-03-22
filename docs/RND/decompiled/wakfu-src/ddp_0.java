/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddp
 */
class ddp_0
extends dde_0 {
    final /* synthetic */ afx_1 ogC;
    final /* synthetic */ afz_2 ogD;

    ddp_0(ddo ddo2, afx_1 afx_12, String string, afq_2[] afq_2Array, afx_1 afx_13, afz_2 afz_22) {
        this.ogC = afx_13;
        this.ogD = afz_22;
        super(afx_12, string, afq_2Array);
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        boolean bl = super.run(fiq_12);
        this.ogC.a(this.ogD);
        return bl;
    }

    @Override
    public boolean fcu() {
        boolean bl = super.fcu();
        this.ogC.a(this.ogD);
        return bl;
    }
}

