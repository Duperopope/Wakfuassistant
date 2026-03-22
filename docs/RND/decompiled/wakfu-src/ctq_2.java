/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cTQ
 */
class ctq_2
implements TObjectProcedure<ni_1> {
    final /* synthetic */ ctp_2 nKL;

    ctq_2(ctp_2 ctp_22) {
        this.nKL = ctp_22;
    }

    public boolean b(ni_1 ni_12) {
        acd_1 acd_12 = ni_12.aZw();
        this.nKL.nKB.put(ctp_2.eH(acd_12.getX(), acd_12.getY()), (Object)bnr_1.iKm);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ni_1)object);
    }
}

