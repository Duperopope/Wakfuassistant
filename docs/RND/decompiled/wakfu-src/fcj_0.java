/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcj
 */
public class fcj_0
implements TObjectProcedure<fas_0> {
    final long rTp;
    long jEK;

    public fcj_0(long l) {
        this.rTp = l;
    }

    public long ZC() {
        return this.jEK;
    }

    public boolean c(fas_0 fas_02) {
        fas_02.z(new fck_0(this, fas_02));
        return this.jEK == 0L;
    }

    public String toString() {
        return "FindBuildingFromElementId{m_elementId=" + this.rTp + ", m_buildingUid=" + this.jEK + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

