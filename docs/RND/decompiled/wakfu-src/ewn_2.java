/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWN
 */
public class ewn_2
implements ewm_1 {
    private static final Logger rCg = Logger.getLogger(ewn_2.class);
    private static final int rCh = -1;
    private int htq;
    private final TLongIntHashMap rCi = new TLongIntHashMap();
    private final TIntObjectHashMap<ewz_1<enk_0>> rCj = new TIntObjectHashMap();
    private final TIntObjectHashMap<List<enk_0>> rCk = new TIntObjectHashMap();
    private final TLongObjectHashMap<enk_0> rCl = new TLongObjectHashMap();
    private final TLongHashSet rCm = new TLongHashSet();
    private final TLongObjectHashMap<azx_1<Integer, Integer>> rCn = new TLongObjectHashMap();

    @Override
    public void d(int n, List<enk_0> list) {
        ewb_1<enk_0> ewb_12 = new ewb_1<enk_0>();
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            enk_0 enk_02 = list.get(i);
            ewb_12.v(enk_02);
        }
        ewb_12.c(new ewo_2(this));
        this.rCj.put(n, ewb_12);
    }

    @Override
    public int dIB() {
        return this.htq;
    }

    @Override
    public void Aa(int n) {
        this.htq = n;
    }

    @Override
    public int rj(long l) {
        return this.rCi.get(l);
    }

    @Override
    public void aa(long l, int n) {
        if (n == -1) {
            return;
        }
        int n2 = this.rCi.get(l);
        this.ac(l, n2 + n);
    }

    public void ac(long l, int n) {
        int n2 = Math.max(0, n);
        int n3 = this.rs(l);
        if (!this.rCi.containsKey(l)) {
            this.rCm.add(l);
        }
        this.rCi.put(l, n2);
        int n4 = this.rs(l);
        if (n4 > n3) {
            this.rCm.remove(l);
        }
    }

    public int rs(long l) {
        int n = Math.max(1, this.htq);
        return this.rj(l) / n - 1;
    }

    @Override
    public boolean d(long l, int n, int n2, boolean bl) {
        return this.a(l, this.SK(n), n2, bl);
    }

    private boolean a(long l, enk_0 enk_02, int n, boolean bl) {
        List<enk_0> list = this.SR(n);
        if (list == null) {
            return false;
        }
        if (!list.contains(enk_02)) {
            return false;
        }
        enk_0 enk_03 = (enk_0)this.rCl.get(l);
        if (enk_03 != null) {
            list.add(enk_03);
        }
        this.rCl.put(l, (Object)enk_02);
        this.rp(l);
        if (bl) {
            list.remove(enk_02);
        }
        return true;
    }

    @Override
    public void rl(long l) {
        this.rp(l);
    }

    @Override
    @Nullable
    public enk_0 SK(int n) {
        int[] nArray = this.rCj.keys();
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            ewz_1 ewz_12 = (ewz_1)this.rCj.get(n2);
            Object e2 = ewz_12.SK(n);
            if (e2 == null) continue;
            return e2;
        }
        return null;
    }

    protected List<enk_0> SR(int n) {
        List list = (List)this.rCk.get(n);
        if (list != null && !list.isEmpty()) {
            return list;
        }
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
        ewz_1 ewz_12 = (ewz_1)this.rCj.get(n);
        if (ewz_12 == null) {
            return Collections.emptyList();
        }
        arrayList.addAll(ewz_12.eeu());
        this.rCk.put(n, arrayList);
        return arrayList;
    }

    @Override
    public List<enk_0> Z(long l, int n) {
        return Collections.unmodifiableList(this.SR(n));
    }

    @Override
    public void a(exP exP2, qm_0 qm_02) {
        if (exP2 == null || qm_02 == null) {
            return;
        }
        enk_0 enk_02 = (enk_0)this.rCl.get(exP2.Sn());
        if (enk_02 != null) {
            enk_02.a(ewc_1.a(enk_02.aZH(), enk_02), exP2, qm_02, enf_0.fBb(), exP2.bcC(), exP2.bcD(), exP2.bcE(), exP2, null, false);
        }
        this.rCl.remove(exP2.Sn());
        this.rq(exP2.Sn());
    }

    @Override
    public void rr(long l) {
        this.rCl.remove(l);
    }

    @Override
    public void rq(long l) {
        azx_1 azx_12 = (azx_1)this.rCn.get(l);
        if (azx_12 == null) {
            return;
        }
        azx_12.Q(0);
        azx_12.N(0);
    }

    @Override
    public List<enk_0> SP(int n) {
        ewz_1 ewz_12 = (ewz_1)this.rCj.get(n);
        if (ewz_12 == null) {
            return Collections.emptyList();
        }
        return ewz_12.eeu();
    }

    @Override
    public TIntObjectHashMap<ewz_1<enk_0>> fOl() {
        return this.rCj;
    }

    @Override
    public enk_0 rm(long l) {
        return (enk_0)this.rCl.get(l);
    }

    @Override
    public boolean rn(long l) {
        return this.rCl.containsKey(l);
    }

    @Override
    public int ab(long l, int n) {
        azx_1<Integer, Integer> azx_12 = (azx_1<Integer, Integer>)this.rCn.get(l);
        if (azx_12 == null) {
            azx_12 = new azx_1<Integer, Integer>(0, 0);
            this.rCn.put(l, azx_12);
        }
        azx_12.Q((Integer)azx_12.getFirst() + n);
        azx_12.N(azx_12.aHI() + 1);
        return n;
    }

    @Override
    public int ro(long l) {
        azx_1 azx_12 = (azx_1)this.rCn.get(l);
        if (azx_12 == null) {
            return -1;
        }
        if ((Integer)azx_12.aHI() == 0) {
            return 0;
        }
        return (Integer)azx_12.getFirst() / (Integer)azx_12.aHI();
    }

    @Override
    public boolean rk(long l) {
        if (!this.rCi.containsKey(l)) {
            return false;
        }
        return !this.rCm.contains(l);
    }

    @Override
    public void rp(long l) {
        this.rCm.add(l);
    }

    @Override
    public int aVo() {
        return this.rCi.size();
    }

    public TLongIntHashMap fOm() {
        return this.rCi;
    }

    public TIntObjectHashMap<List<enk_0>> fOn() {
        return this.rCk;
    }

    @Override
    public byte[] SQ(int n) {
        return ewi_1.a(this, n);
    }

    @Override
    public void dS(byte[] byArray) {
        ewi_1.a(byArray, this);
    }
}

