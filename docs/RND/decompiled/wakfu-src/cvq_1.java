/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cVq
 */
class cvq_1
implements TObjectProcedure<ni_1> {
    final /* synthetic */ cvp_2 nPe;

    cvq_1(cvp_2 cvp_22) {
        this.nPe = cvp_22;
    }

    public boolean b(ni_1 ni_12) {
        this.nPe.nPb.fW(cvp_2.af(ni_12.bcC(), ni_12.bcD(), ni_12.bcE()));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ni_1)object);
    }
}

