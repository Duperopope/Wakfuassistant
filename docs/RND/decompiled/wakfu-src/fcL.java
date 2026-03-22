/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class fcL {
    private static final Logger rUg = Logger.getLogger(fcL.class);
    public static final fcL rUh = new fcL();
    private final TLongObjectHashMap<TLongHashSet> rUi = new TLongObjectHashMap();
    private final TLongObjectHashMap<TLongHashSet> rUj = new TLongObjectHashMap();
    private final TLongObjectHashMap<exP> rUk = new TLongObjectHashMap();
    private final List<fcM> rUl = new ArrayList<fcM>();

    private fcL() {
    }

    public void d(long l, exP exP2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUi.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.rUi.put(l, (Object)tLongHashSet);
        }
        tLongHashSet.add(exP2.Sn());
        this.rUk.put(exP2.Sn(), (Object)exP2);
        this.bQ(exP2);
    }

    public void ss(long l) {
        exP exP2 = (exP)this.rUk.get(l);
        this.bN(exP2);
    }

    public void bN(exP exP2) {
        if (exP2 == null) {
            return;
        }
        this.av(exP2.Xi(), exP2.Sn());
        this.rUk.remove(exP2.Sn());
        if (!this.bO(exP2)) {
            return;
        }
        this.bR(exP2);
    }

    private boolean bO(exP exP2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUi.get(exP2.Xi());
        if (tLongHashSet == null) {
            return false;
        }
        tLongHashSet.remove(exP2.Sn());
        if (tLongHashSet.isEmpty()) {
            this.rUi.remove(exP2.Xi());
        }
        return true;
    }

    public boolean au(long l, long l2) {
        boolean bl;
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.rUj.put(l, (Object)tLongHashSet);
        }
        if (bl = tLongHashSet.add(l2)) {
            this.sC(l2);
        }
        return bl;
    }

    public void av(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet == null) {
            return;
        }
        boolean bl = tLongHashSet.remove(l2);
        if (bl) {
            this.sD(l2);
        }
        if (tLongHashSet.isEmpty()) {
            this.rUj.remove(l);
        }
    }

    public void st(long l) {
        this.rUj.remove(l);
    }

    public TLongHashSet su(long l) {
        return (TLongHashSet)this.rUi.get(l);
    }

    public boolean sv(long l) {
        return this.rUk.containsKey(l);
    }

    public <T extends exP> T sw(long l) {
        return (T)((exP)this.rUk.get(l));
    }

    public <T extends exP> exP bP(T t) {
        return (exP)this.rUk.put(t.Sn(), t);
    }

    public boolean d(TLongProcedure tLongProcedure) {
        return this.rUk.forEach(tLongProcedure);
    }

    public <T extends exP> boolean a(long l, TObjectProcedure<T> tObjectProcedure) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUi.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        return this.a(tLongHashSet, tObjectProcedure);
    }

    public <T extends exP> boolean b(long l, TObjectProcedure<T> tObjectProcedure) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        return this.a(tLongHashSet, tObjectProcedure);
    }

    private <T extends exP> boolean a(TLongHashSet tLongHashSet, TObjectProcedure<T> tObjectProcedure) {
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            boolean bl;
            exP exP2 = (exP)this.rUk.get(tLongIterator.next());
            if (exP2 == null) continue;
            try {
                bl = !tObjectProcedure.execute((Object)exP2);
            }
            catch (Exception exception) {
                rUg.error((Object)("Exception raised while executing procedure on heroes " + String.valueOf(tLongHashSet) + " with procedure " + String.valueOf(tObjectProcedure)), (Throwable)exception);
                return false;
            }
            if (!bl) continue;
            return false;
        }
        return true;
    }

    public TLongHashSet sx(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet != null) {
            return new TLongHashSet(tLongHashSet.toArray());
        }
        return new TLongHashSet();
    }

    public TLongHashSet sy(long l) {
        exP exP2 = (exP)this.rUk.get(l);
        if (exP2 == null) {
            return new TLongHashSet();
        }
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(exP2.Xi());
        if (tLongHashSet != null) {
            return new TLongHashSet(tLongHashSet.toArray());
        }
        return new TLongHashSet();
    }

    public <T extends exP> Set<T> sz(long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l2);
        if (tLongHashSet != null) {
            HashSet hashSet = new HashSet();
            tLongHashSet.forEach(l -> {
                hashSet.add(this.sw(l));
                return true;
            });
            return hashSet;
        }
        return new HashSet();
    }

    public <T extends exP> T aw(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet != null && tLongHashSet.contains(l2)) {
            return this.sw(l2);
        }
        return null;
    }

    public boolean ax(long l, long l2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet == null) {
            return false;
        }
        return tLongHashSet.contains(l2);
    }

    public int sA(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        return tLongHashSet != null ? tLongHashSet.size() : 0;
    }

    public short sB(long l) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.rUj.get(l);
        if (tLongHashSet == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        this.b(l, exP2 -> {
            arrayList.add(exP2.cmL());
            return true;
        });
        short s = 0;
        for (Short s2 : arrayList) {
            if (s >= s2) continue;
            s = s2;
        }
        return s;
    }

    public <T extends exP> void a(fcM<T> fcM2) {
        this.rUl.add(fcM2);
    }

    public <T extends exP> void b(fcM<T> fcM2) {
        this.rUl.remove(fcM2);
    }

    private void bQ(exP exP2) {
        ArrayList<fcM> arrayList = new ArrayList<fcM>(this.rUl);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            try {
                ((fcM)arrayList.get(i)).O(exP2);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                rUg.error((Object)("[Hero] No listener at index " + i + " to notify hero added: " + String.valueOf(exP2)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                rUg.error((Object)("[Hero] An error occurred while notifying listener " + ((fcM)arrayList.get(i)).getClass().getSimpleName() + " of hero addition: " + String.valueOf(exP2)), (Throwable)exception);
            }
        }
    }

    private void sC(long l) {
        ArrayList<fcM> arrayList = new ArrayList<fcM>(this.rUl);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            try {
                ((fcM)arrayList.get(i)).N(this.sw(l));
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                rUg.error((Object)("[Hero] No listener at index " + i + " to notify hero added to party: " + l), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                rUg.error((Object)("[Hero] An error occurred while notifying listener " + ((fcM)arrayList.get(i)).getClass().getSimpleName() + " of hero addition to party: " + l), (Throwable)exception);
            }
        }
    }

    private void bR(exP exP2) {
        ArrayList<fcM> arrayList = new ArrayList<fcM>(this.rUl);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            try {
                ((fcM)arrayList.get(i)).L(exP2);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                rUg.error((Object)("[Hero] No listener at index " + i + " to notify hero removed: " + String.valueOf(exP2)), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                rUg.error((Object)("[Hero] An error occurred while notifying listener " + ((fcM)arrayList.get(i)).getClass().getSimpleName() + " of hero removal: " + String.valueOf(exP2)), (Throwable)exception);
            }
        }
    }

    private void sD(long l) {
        ArrayList<fcM> arrayList = new ArrayList<fcM>(this.rUl);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            try {
                ((fcM)arrayList.get(i)).M(this.sw(l));
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                rUg.error((Object)("[Hero] No listener at index " + i + " to notify hero removed from party: " + l), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                rUg.error((Object)("[Hero] An error occurred while notifying listener " + ((fcM)arrayList.get(i)).getClass().getSimpleName() + " of hero removal from party: " + l), (Throwable)exception);
            }
        }
    }

    public void fSP() {
        this.rUj.clear();
    }

    public void fSQ() {
        this.rUk.clear();
        this.rUi.clear();
    }

    public String toString() {
        return "HeroesManager{m_heroes=" + String.valueOf(this.rUi) + ", m_heroesById=" + String.valueOf(this.rUk) + ", m_listeners=" + String.valueOf(this.rUl) + "}";
    }
}

