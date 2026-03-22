/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from Tf
 */
public abstract class tf_0<R extends tk_0<T>, T extends ti_0>
implements tn_0<R> {
    private static final Logger bsc = Logger.getLogger(tf_0.class);
    protected final tr_0<R> bsd;
    private final tj_0<T> bse;
    private final ArrayList<tl_0<R>> bsf = new ArrayList();
    protected final TLongObjectHashMap<R> bsg = new TLongObjectHashMap();
    private final TIntObjectHashMap<TLongArrayList> bsh = new TIntObjectHashMap();
    private final TIntArrayList bsi = new TIntArrayList();
    protected final boolean bsj = false;
    private boolean bsk = false;
    private final TObjectProcedure<R> bsl = new tg_0(this);

    protected tf_0(tj_0<T> tj_02, tr_0<R> tr_02) {
        this.bse = tj_02;
        this.bsd = tr_02;
    }

    @Override
    public void a(th_0<R> th_02) {
        for (tk_0 tk_02 : th_02) {
            this.bsg.put(tk_02.Sn(), (Object)tk_02);
        }
        this.bsg.forEachValue(this.bsl);
    }

    public Set<Long> bgE() {
        long[] lArray;
        HashSet<Long> hashSet = new HashSet<Long>();
        for (long l : lArray = this.bsg.keys()) {
            hashSet.add(l);
        }
        return hashSet;
    }

    protected void a(R r) {
        this.a(r.Sn(), 0, r.bgK(), false);
    }

    @Override
    public void a(tl_0<R> tl_02) {
        this.bsf.add(tl_02);
    }

    public boolean bgF() {
        return false;
    }

    private T b(R r) {
        return this.bse.am(r.bgK(), this.c(r));
    }

    public int c(R r) {
        long l = r.Sn();
        int n = r.bgK();
        int n2 = 0;
        for (int i = this.bsi.size() - 1; i >= 0; --i) {
            int n3 = this.bsi.get(i);
            if (n3 > n) {
                n2 += ((TLongArrayList)this.bsh.get(n3)).size();
                continue;
            }
            if (n3 == n) {
                n2 += this.i(l, n3);
                continue;
            }
            return n2;
        }
        return n2;
    }

    private int i(long l, int n) {
        int n2;
        TLongArrayList tLongArrayList = (TLongArrayList)this.bsh.get(n);
        if (tLongArrayList.size() == 1) {
            return 0;
        }
        tk_0 tk_02 = null;
        ArrayList<tk_0> arrayList = new ArrayList<tk_0>(tLongArrayList.size());
        int n3 = tLongArrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            long l2 = tLongArrayList.get(n2);
            tk_0 tk_03 = (tk_0)this.bsg.get(l2);
            if (tk_03 == null) continue;
            if (l2 == l) {
                tk_02 = tk_03;
            }
            arrayList.add(tk_03);
        }
        if (tk_02 == null) {
            return 0;
        }
        Collections.sort(arrayList);
        n2 = arrayList.indexOf(tk_02);
        return n2 == -1 ? 0 : n2;
    }

    public int aVo() {
        return this.bsg.size();
    }

    public R ee(long l) {
        tk_0 tk_02 = (tk_0)this.bsg.get(l);
        if (tk_02 != null) {
            return (R)tk_02;
        }
        R r = this.eg(l);
        r.pp(this.bgG());
        this.bsg.put(l, r);
        this.a(r);
        return r;
    }

    public void ef(long l) {
        tk_0 tk_02 = (tk_0)this.bsg.remove(l);
        if (tk_02 == null) {
            return;
        }
        TLongArrayList tLongArrayList = (TLongArrayList)this.bsh.get(tk_02.bgK());
        if (tLongArrayList != null) {
            int n = tLongArrayList.indexOf(l);
            if (n >= 0) {
                tLongArrayList.removeAt(n);
            }
            if (tLongArrayList.isEmpty()) {
                this.bsh.remove(tk_02.bgK());
                int n2 = this.bsi.binarySearch(tk_02.bgK());
                if (n2 > -1) {
                    this.bsi.removeAt(n2);
                }
            }
        }
        this.d(tk_02);
    }

    protected abstract R eg(long var1);

    public int eh(long l) {
        if (l > 0L && this.bsg.containsKey(l)) {
            return ((tk_0)this.bsg.get(l)).bgK();
        }
        return -1;
    }

    public R ei(long l) {
        return (R)(this.bsg.containsKey(l) ? (tk_0)this.bsg.get(l) : null);
    }

    public int bgG() {
        if (this.bsd != null) {
            return this.bsd.bhf();
        }
        return 1000;
    }

    public int bgH() {
        if (this.bsd != null) {
            return this.bsd.bhg();
        }
        return 2000;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l, int n, int n2, boolean bl) {
        if (n == n2) {
            return;
        }
        try {
            TLongArrayList tLongArrayList = (TLongArrayList)this.bsh.get(n);
            if (tLongArrayList != null) {
                aeb_2.b(tLongArrayList, l);
                if (tLongArrayList.isEmpty()) {
                    this.bsh.remove(n);
                    int n3 = this.bsi.binarySearch(n);
                    if (n3 > -1) {
                        this.bsi.removeAt(n3);
                    }
                }
            }
            if ((tLongArrayList = (TLongArrayList)this.bsh.get(n2)) == null) {
                tLongArrayList = new TLongArrayList();
                this.bsh.put(n2, (Object)tLongArrayList);
                this.bsi.add(n2);
                this.bsi.sort();
            }
            if (!tLongArrayList.contains(l)) {
                tLongArrayList.add(l);
            }
        }
        finally {
            this.d(l, bl);
        }
    }

    public tm_0<R> a(R[] RArray) {
        if (RArray[0] != null && RArray[1] != null) {
            tm_0 tm_02 = new tm_0(RArray);
            tm_02.a(this);
            return tm_02;
        }
        return null;
    }

    @Override
    public void a(long l, tm_0<R> tm_02) {
        tk_0[] tk_0Array = tm_02.bgO();
        int[] nArray = tm_02.bgP();
        if (this.bsd != null) {
            this.bsd.b(tm_02);
        }
        this.a(tk_0Array[0].Sn(), nArray[0], tk_0Array[0].bgK(), true);
        this.a(tk_0Array[1].Sn(), nArray[1], tk_0Array[1].bgK(), true);
    }

    @Override
    public void a(tq_0<R> tq_02) {
        TLongIntHashMap tLongIntHashMap = tq_02.bgY();
        if (this.bsd != null) {
            this.bsd.b(tq_02);
        }
        for (tk_0 tk_02 : tq_02.bgU()) {
            this.a(tk_02.Sn(), tLongIntHashMap.get(tk_02.Sn()), tk_02.bgK(), true);
        }
        for (tk_0 tk_02 : tq_02.bgV()) {
            this.a(tk_02.Sn(), tLongIntHashMap.get(tk_02.Sn()), tk_02.bgK(), true);
        }
    }

    public void b(long l, int n, boolean bl) {
        if (n < 0) {
            return;
        }
        tk_0 tk_02 = (tk_0)this.bsg.get(l);
        if (tk_02 == null) {
            return;
        }
        int n2 = tk_02.bgK();
        tk_02.pp(n);
        this.a(tk_02.Sn(), n2, n, false);
        if (bl) {
            tk_02.pq(this.c(tk_02));
            tk_02.a(this.b(tk_02));
        }
    }

    public boolean b(TObjectProcedure<R> tObjectProcedure) {
        return this.bsg.forEachValue(tObjectProcedure);
    }

    private void d(long l, boolean bl) {
        tk_0 tk_02 = (tk_0)this.bsg.get(l);
        if (tk_02 != null) {
            for (tl_0<R> tl_02 : this.bsf) {
                tl_02.a(tk_02, bl);
            }
        }
    }

    private void d(R r) {
        if (r != null) {
            for (tl_0<R> tl_02 : this.bsf) {
                tl_02.g(r);
            }
        }
    }

    public tr_0<R> bgI() {
        return this.bsd;
    }
}

