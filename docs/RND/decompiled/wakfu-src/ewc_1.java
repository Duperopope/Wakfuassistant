/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from eWC
 */
public class ewc_1 {
    private static final Logger rBO = Logger.getLogger(ewc_1.class);
    public static final ewc_1 rBP = new ewc_1();
    private final TIntIntHashMap rBQ = new TIntIntHashMap();
    private final Map<ewd_1, TIntHashSet> rBR = new HashMap<ewd_1, TIntHashSet>();
    private final TIntIntHashMap rBS = new TIntIntHashMap();
    private final TIntObjectHashMap<enk_0> rBT = new TIntObjectHashMap();
    private final HashSet<enk_0> rBU = new HashSet();

    private ewc_1() {
    }

    public void a(ewd_1 ewd_12, int n) {
        TIntHashSet tIntHashSet = this.rBR.get(ewd_12);
        if (tIntHashSet == null) {
            tIntHashSet = new TIntHashSet();
            this.rBR.put(ewd_12, tIntHashSet);
        }
        tIntHashSet.add(n);
    }

    public boolean b(ewd_1 ewd_12, int n) {
        TIntHashSet tIntHashSet = this.rBR.get(ewd_12);
        if (tIntHashSet == null) {
            return false;
        }
        return tIntHashSet.contains(n);
    }

    public void fG(int n, int n2) {
        if (this.rBQ.put(n, n2) != 0) {
            rBO.error((Object)("Ajout multiple du gfx de buff de v\u00e9locit\u00e9 " + n), (Throwable)new UnsupportedOperationException());
        }
    }

    public int SL(int n) {
        return this.rBQ.get(n);
    }

    public void a(enk_0 enk_02, int n) {
        this.rBT.put(enk_02.aZH(), (Object)enk_02);
        this.rBS.put(n, enk_02.aZH());
    }

    public List<enk_0> eeu() {
        Object[] objectArray = new enk_0[this.rBT.size()];
        this.rBT.values(objectArray);
        return Arrays.asList(objectArray);
    }

    public enk_0 SK(int n) {
        return (enk_0)this.rBT.get(n);
    }

    public enk_0 SM(int n) {
        return (enk_0)this.rBT.get(this.rBS.get(n));
    }

    public static eNl a(long l, enk_0 enk_02) {
        return new ewa_1(l, enk_02);
    }

    public void w(enk_0 enk_02) {
        this.rBU.add(enk_02);
    }

    public HashSet<enk_0> fOj() {
        return this.rBU;
    }
}

