/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcm
 */
public class fcm_0
implements TObjectProcedure<fas_0> {
    private final acc_1 rTt;
    private long jEK = -1L;

    public fcm_0(acc_1 acc_12) {
        this.rTt = acc_12;
    }

    public long ZC() {
        return this.jEK;
    }

    public boolean c(fas_0 fas_02) {
        if (fas_02.bsM() == this.rTt.bWx() && fas_02.bsN() == this.rTt.bWy()) {
            this.jEK = fas_02.Lx();
            return false;
        }
        return true;
    }

    public String toString() {
        return "FindBuildingFromLocation{m_location=" + String.valueOf(this.rTt) + ", m_buildingUid=" + this.jEK + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

