/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUV
 */
class buv_1
implements btr_1 {
    final /* synthetic */ long lrs;
    final /* synthetic */ long lrt;
    final /* synthetic */ afx_1 lru;
    final /* synthetic */ String lrv;
    final /* synthetic */ afq_2[] lrw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    buv_1(buu_1 buu_12, long l, long l2, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lrs = l;
        this.lrt = l2;
        this.lru = afx_12;
        this.lrv = string;
        this.lrw = afq_2Array;
    }

    @Override
    public void f(exP exP2, long l) {
        if (exP2.Sn() == this.lrs && l == this.lrt) {
            this.lru.a(this.lrv, this.lrw, new afp_2[0]);
        }
    }

    @Override
    public long OO() {
        return this.lrs;
    }
}

