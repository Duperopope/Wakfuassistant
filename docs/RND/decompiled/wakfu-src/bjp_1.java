/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bjp
 */
class bjp_1
implements TObjectProcedure<ezv_1> {
    private final TIntHashSet iog = new TIntHashSet();

    bjp_1() {
    }

    public boolean b(ezv_1 ezv_12) {
        if (ezt_1.s(ezv_12)) {
            this.iog.add(ezv_12.tJ());
        }
        return true;
    }

    TIntHashSet drk() {
        return this.iog;
    }

    public String toString() {
        return "FillActiveBonuses{m_activeBonuses=" + this.iog.size() + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ezv_1)object);
    }
}

