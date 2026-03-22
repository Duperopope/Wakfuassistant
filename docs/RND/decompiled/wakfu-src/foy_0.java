/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.TestOnly
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from foy
 */
public class foy_0 {
    public static final foy_0 sLJ = new foy_0();
    private final TIntObjectHashMap<fov_0> sLK = new TIntObjectHashMap();
    private final TIntObjectHashMap<fov_0> sLL = new TIntObjectHashMap();
    private Map<Integer, Integer> sLM;

    private foy_0() {
    }

    public void b(fov_0 fov_02, int n) {
        this.sLK.put(fov_02.d(), (Object)fov_02);
        assert (!this.sLL.contains(n));
        this.sLL.put(n, (Object)fov_02);
        this.sLM = null;
    }

    public fov_0 XP(int n) {
        return (fov_0)this.sLK.get(n);
    }

    public fov_0 XQ(int n) {
        return (fov_0)this.sLL.get(n);
    }

    public int XR(int n) {
        TIntObjectIterator tIntObjectIterator = this.sLL.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fov_0 fov_02 = (fov_0)tIntObjectIterator.value();
            if (fov_02.d() != n) continue;
            return tIntObjectIterator.key();
        }
        return 0;
    }

    public String toString() {
        return "PetDefinitionManager{m_petDefinitions=" + this.sLK.size() + "}";
    }

    public boolean XS(int n) {
        if (this.sLM == null) {
            this.sLM = this.gfE();
        }
        return this.sLM.containsKey(n);
    }

    public Optional<fov_0> XT(int n) {
        Integer n2;
        if (this.sLM == null) {
            this.sLM = this.gfE();
        }
        if ((n2 = this.sLM.get(n)) == null || n2 < 0) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.XP(n2));
    }

    private Map<Integer, Integer> gfE() {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        this.sLK.forEachValue(fov_02 -> {
            for (int n : fov_02.gfB()) {
                hashMap.put(n, fov_02.d());
            }
            return true;
        });
        return hashMap;
    }

    public boolean aa(TObjectProcedure<? super fov_0> tObjectProcedure) {
        return this.sLK.forEachValue(tObjectProcedure);
    }

    @TestOnly
    public void gfF() {
        this.sLK.clear();
        this.sLL.clear();
        if (this.sLM != null) {
            this.sLM.clear();
        }
    }
}

