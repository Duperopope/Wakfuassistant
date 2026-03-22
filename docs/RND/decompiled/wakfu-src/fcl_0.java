/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcl
 */
public class fcl_0
implements TObjectProcedure<fas_0> {
    private final long rTs;
    private long jEK;

    public fcl_0(long l) {
        this.rTs = l;
    }

    public long ZC() {
        return this.jEK;
    }

    public boolean c(fas_0 fas_02) {
        if (fas_02.rP(this.rTs) == null) {
            return true;
        }
        this.jEK = fas_02.Lx();
        return false;
    }

    public String toString() {
        return "FindBuildingFromElementUid{m_elementUid=" + this.rTs + ", m_buildingUid=" + this.jEK + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

