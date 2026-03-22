/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from feF
 */
class fef_0
implements TObjectProcedure<ffm> {
    private final xw_1 seB;

    fef_0(xw_1 xw_12) {
        this.seB = xw_12;
    }

    public boolean i(ffm ffm2) {
        xx_2 xx_22 = fee_0.h(ffm2);
        this.seB.ajV.add(xx_22);
        return true;
    }

    public String toString() {
        return "BuildRawProcedure{m_raw=" + String.valueOf(this.seB) + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((ffm)object);
    }
}

