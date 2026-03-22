/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUS
 */
class bus_1
implements btr_1 {
    final /* synthetic */ long lro;
    final /* synthetic */ afx_1 lrp;
    final /* synthetic */ String lrq;
    final /* synthetic */ afq_2[] lrr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bus_1(bur_1 bur_12, long l, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lro = l;
        this.lrp = afx_12;
        this.lrq = string;
        this.lrr = afq_2Array;
    }

    @Override
    public void H(exP exP2) {
        if (exP2.Sn() == this.lro) {
            this.lrp.a(this.lrq, this.lrr, new afp_2[0]);
        }
    }

    @Override
    public long OO() {
        return this.lro;
    }
}

