/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from faC
 */
class fac_0
implements TObjectProcedure<fbv_0> {
    final /* synthetic */ int rPK;
    final /* synthetic */ int rPL;
    final /* synthetic */ long rPM;
    final /* synthetic */ fae_0 rPN;
    final /* synthetic */ fab_0 rPO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fac_0(fab_0 fab_02, int n, int n2, long l, fae_0 fae_02) {
        this.rPO = fab_02;
        this.rPK = n;
        this.rPL = n2;
        this.rPM = l;
        this.rPN = fae_02;
    }

    public boolean a(fbv_0 fbv_02) {
        acd_1 acd_12 = new acd_1(fbv_02.fSn());
        acd_12.ap(this.rPK, this.rPL);
        long l = fbm.fRE();
        long l2 = RD.beh();
        this.rPO.c(this.rPM, l, l2);
        RH rH = this.rPN.a(this.rPM, fbv_02.cor(), l, l2, acd_12);
        if (rH == null) {
            this.rPO.rR(l);
            throw new fcc_0(fbn.rRa, "Impossible de spawner l'\u00e9l\u00e9ment.");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fbv_0)object);
    }
}

