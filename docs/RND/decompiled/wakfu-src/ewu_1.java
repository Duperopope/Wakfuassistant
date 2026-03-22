/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;
import java.util.Optional;

/*
 * Renamed from eWU
 */
public class ewu_1 {
    public static final ewu_1 rCG = new ewu_1();
    private final fiH<ewp_1> rCH = new fiH();
    private final TIntObjectHashMap<ewp_1> rCI = new TIntObjectHashMap();
    private final TIntObjectHashMap<ewv_1> rCJ = new TIntObjectHashMap();

    public void c(ewp_1 ewp_12) {
        this.rCI.put(ewp_12.d(), (Object)ewp_12);
        if (ewp_12.fOq()) {
            this.rCH.a(ewp_12);
        }
    }

    public void a(ewv_1 ewv_12) {
        this.rCJ.put(ewv_12.coQ(), (Object)ewv_12);
    }

    public ewv_1 Ta(int n) {
        return (ewv_1)this.rCJ.get(n);
    }

    public Optional<ewp_1> a(Collection<? extends exP> collection, Collection<? extends exP> collection2, Object object, Object object2) {
        return this.rCH.b(collection, collection2, object, object2);
    }

    public ewp_1 Tb(int n) {
        return (ewp_1)this.rCI.get(n);
    }

    public boolean G(TObjectProcedure<ewp_1> tObjectProcedure) {
        return this.rCI.forEachValue(tObjectProcedure);
    }

    public String toString() {
        return "FightChallengeManager{m_dropTable=" + String.valueOf(this.rCH) + ", m_challenges=" + String.valueOf(this.rCI) + ", m_monsterDefinitions=" + String.valueOf(this.rCJ) + "}";
    }
}

