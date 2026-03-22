/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.apache.log4j.Logger;

public class bse
implements eTu<eTw> {
    protected static final Logger jfa = Logger.getLogger(bse.class);
    private static final bse jfb = new bse();
    private final LinkedList<eTw> jfc = new LinkedList();
    private final TByteObjectHashMap<TLongHashSet> jfd = new TByteObjectHashMap();
    private final HashMap<Long, eTw> jfe = new HashMap();
    private final TLongObjectHashMap<TLongHashSet> jff = new TLongObjectHashMap();

    public static bse dEP() {
        return jfb;
    }

    public void c(eTw eTw2) {
        this.e(eTw2);
        this.jfc.addFirst(eTw2);
        this.jfe.put(eTw2.Lx(), eTw2);
        this.j(eTw2);
    }

    public void d(eTw eTw2) {
        if (eTw2 == null) {
            return;
        }
        eTw eTw3 = this.jfe.get(eTw2.Lx());
        this.i(eTw3);
        this.g(eTw3);
        this.j(eTw2);
        this.e(eTw2);
        this.jfe.put(eTw2.Lx(), eTw2);
    }

    private void e(eTw eTw2) {
        long l = eTw2.dis().bjA();
        TLongHashSet tLongHashSet = (TLongHashSet)this.jff.get(l);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.jff.put(l, (Object)tLongHashSet);
        }
        tLongHashSet.add(eTw2.Lx());
    }

    @Override
    public void f(eTw eTw2) {
        this.g(eTw2);
        this.jfc.remove(eTw2);
        this.i(eTw2);
        this.jfe.remove(eTw2.Lx());
    }

    private boolean g(eTw eTw2) {
        long l = eTw2.dis().bjA();
        TLongHashSet tLongHashSet = (TLongHashSet)this.jff.get(l);
        if (tLongHashSet == null) {
            return true;
        }
        tLongHashSet.remove(eTw2.Lx());
        if (tLongHashSet.isEmpty()) {
            this.jff.remove(l);
        }
        return false;
    }

    @Override
    public Set<eTw> dEQ() {
        return new HashSet<eTw>(this.jfe.values());
    }

    @Override
    public boolean aJG() {
        return this.jff.isEmpty() && this.jfe.isEmpty() && this.jfd.isEmpty() && this.jfc.isEmpty();
    }

    @Override
    public boolean h(eTw eTw2) {
        if (this.aJG()) {
            return false;
        }
        Collection<eTw> collection = this.jfe.values();
        int n = eTw2.fJl();
        for (eTw eTw3 : collection) {
            if (eTw3.fJl() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.jfe.clear();
        this.jfc.clear();
        this.jfd.clear();
        this.jff.clear();
    }

    private void i(eTw eTw2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.jfd.get(eTw2.aFW());
        if (tLongHashSet == null) {
            return;
        }
        tLongHashSet.remove(eTw2.Lx());
        if (tLongHashSet.isEmpty()) {
            this.jfd.remove(eTw2.aFW());
        }
    }

    private void j(eTw eTw2) {
        TLongHashSet tLongHashSet = (TLongHashSet)this.jfd.get(eTw2.aFW());
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.jfd.put(eTw2.aFW(), (Object)tLongHashSet);
        }
        tLongHashSet.add(eTw2.Lx());
    }

    public void dER() {
        TLongHashSet tLongHashSet;
        eTw eTw2 = this.jfc.removeFirst();
        if (eTw2 != null && (tLongHashSet = (TLongHashSet)this.jfd.get(eTw2.aFW())) != null) {
            tLongHashSet.remove(eTw2.Lx());
        }
        this.jfe.remove(eTw2.Lx());
        this.f(eTw2);
    }

    public void dES() {
        this.jfc.clear();
    }

    public eTw ki(long l) {
        return this.jfe.get(l);
    }

    public TLongHashSet bA(byte by) {
        return (TLongHashSet)this.jfd.get(by);
    }

    @Override
    public Set<eTw> G(ux_0 ux_02) {
        long l = ux_02.bjA();
        TLongHashSet tLongHashSet = (TLongHashSet)this.jff.get(l);
        if (tLongHashSet == null || tLongHashSet.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet<eTw> hashSet = new HashSet<eTw>();
        for (long l2 : tLongHashSet) {
            assert (this.jfe.get(l2) != null) : "Liste des eventsById foireuse";
            hashSet.add(this.jfe.get(l2));
        }
        return hashSet;
    }

    public void kj(long l) {
        for (eTw eTw2 : this.jfc) {
            if ((long)eTw2.fJl() != l) continue;
            this.jfc.remove(eTw2);
            return;
        }
    }

    public void k(eTw eTw2) {
        this.jfc.remove(eTw2);
    }

    public eTw kk(long l) {
        Set<eTw> set = this.dEQ();
        for (eTw eTw2 : set) {
            if ((long)eTw2.fJl() != l) continue;
            return eTw2;
        }
        return null;
    }

    public void dET() {
        jfa.info((Object)this.toString());
    }

    public void bB(byte by) {
        TLongHashSet tLongHashSet = this.bA(by);
        long[] lArray = tLongHashSet.toArray();
        for (int i = 0; i < lArray.length; ++i) {
            long l = lArray[i];
            this.f(this.ki(l));
        }
    }

    public void a(eTw eTw2, long l) {
        long l2 = eTw2.dis().bjA();
        TLongHashSet tLongHashSet = (TLongHashSet)this.jff.get(l2);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.jff.put(l2, (Object)tLongHashSet);
        } else {
            tLongHashSet.remove(eTw2.Lx());
        }
        TLongHashSet tLongHashSet2 = (TLongHashSet)this.jfd.get(eTw2.aFW());
        if (tLongHashSet2 == null) {
            tLongHashSet2 = new TLongHashSet();
            this.jfd.put(eTw2.aFW(), (Object)tLongHashSet2);
        } else {
            tLongHashSet2.remove(eTw2.Lx());
        }
        this.jfe.remove(eTw2.Lx());
        eTw2.di(l);
        tLongHashSet.add(l);
        tLongHashSet2.add(l);
        this.jfe.put(l, eTw2);
    }

    @Override
    public int aVo() {
        return this.jfe.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CharacterEventsCalendar{\n");
        long[] lArray = this.jff.keys();
        Arrays.sort(lArray);
        for (int i = 0; i < lArray.length; ++i) {
            long l = lArray[i];
            TLongHashSet tLongHashSet = (TLongHashSet)this.jff.get(l);
            for (long l2 : tLongHashSet) {
                stringBuilder.append(this.jfe.get(l2));
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void b(long l, ux_0 ux_02) {
        eTw eTw2 = this.jfe.get(l);
        this.g(eTw2);
        eTw2.D(ux_02);
        this.e(eTw2);
    }

    @Override
    public /* synthetic */ void a(eTs eTs2) {
        this.c((eTw)eTs2);
    }
}

