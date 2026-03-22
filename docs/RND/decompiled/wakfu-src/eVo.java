/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Predicates;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class eVo {
    static final Logger rzM = Logger.getLogger(eVo.class);
    private final ArrayList<eST> rzN = new ArrayList();
    private final ArrayList<eVj> rzO = new ArrayList();
    private final HashSet<acd_1> rzP = new HashSet();
    private final long rzQ;
    private final int rzR;

    eVo(long l, int n) {
        this.rzQ = l;
        this.rzR = n;
    }

    public long Xi() {
        return this.rzQ;
    }

    public boolean aJG() {
        return this.rzO.isEmpty();
    }

    public int fNb() {
        return this.rzP.size();
    }

    public boolean d(acd_1 acd_12) {
        return this.rzP.contains(acd_12);
    }

    public boolean aq(int n, int n2) {
        for (acd_1 acd_12 : this.rzP) {
            if (!acd_12.cF(n, n2)) continue;
            return true;
        }
        return false;
    }

    public List<eVj> fNc() {
        return Collections.unmodifiableList(this.rzO);
    }

    boolean a(eST eST2, @Nullable rh_0 rh_02, eVl eVl2) {
        if (this.rzN.contains(eST2)) {
            rzM.error((Object)("Trying to register a microbot already registered : " + String.valueOf(eST2)), (Throwable)new RuntimeException());
            return false;
        }
        this.rzN.add(eST2);
        this.a(rh_02, eVl2);
        return true;
    }

    boolean b(eST eST2, @Nullable rh_0 rh_02, eVl eVl2) {
        if (!this.rzN.remove(eST2)) {
            return false;
        }
        this.a(rh_02, eVl2);
        return true;
    }

    protected void a(@Nullable rh_0 rh_02, eVl eVl2) {
        ArrayList<acd_1> arrayList;
        ArrayList<eVj> arrayList2;
        ArrayList<eVj> arrayList3;
        ArrayList<eVj> arrayList4 = this.j(rh_02);
        if (eVl2 == null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        } else {
            arrayList3 = new ArrayList<eVj>();
            for (Iterable<acd_1> iterable : arrayList4) {
                if (this.rzO.remove(iterable)) continue;
                arrayList3.add((eVj)iterable);
            }
            arrayList2 = new ArrayList<eVj>(this.rzO);
            arrayList = new ArrayList<acd_1>(this.rzP);
        }
        this.rzO.clear();
        this.rzO.addAll(arrayList4);
        this.rzP.clear();
        for (Iterable<acd_1> iterable : this.rzO) {
            for (acd_1 acd_12 : iterable) {
                if (this.rzP.contains(acd_12)) continue;
                if (rh_02 != null) {
                    acd_12 = new acd_1(acd_12.getX(), acd_12.getY(), rh_02.Z(acd_12.getX(), acd_12.getY()));
                }
                this.rzP.add(acd_12);
            }
        }
        if (!(eVl2 == null || arrayList3.isEmpty() && arrayList2.isEmpty())) {
            Iterable<acd_1> iterable;
            ArrayList<acd_1> arrayList5 = new ArrayList<acd_1>(this.rzP);
            iterable = arrayList5.stream().filter(((Predicate<acd_1>)arg_0 -> ((com.google.common.base.Predicate)Predicates.in(arrayList)).apply(arg_0)).negate()).toList();
            List<acd_1> list = arrayList.stream().filter(((Predicate<acd_1>)arg_0 -> ((com.google.common.base.Predicate)Predicates.in((Collection)arrayList5)).apply(arg_0)).negate()).toList();
            eVl2.a(this, arrayList3, arrayList2, (List<acd_1>)iterable, list);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected ArrayList<eVj> j(@Nullable rh_0 rh_02) {
        Object object;
        acd_1 acd_12;
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        for (eST iterable2 : this.rzN) {
            acd_12 = iterable2.aZw();
            int n = acd_12.getX();
            if (!tIntObjectHashMap.containsKey(n)) {
                tIntObjectHashMap.put(n, (Object)new eVp());
            }
            ((eVp)tIntObjectHashMap.get(n)).add(iterable2);
            int n2 = acd_12.getY();
            if (!tIntObjectHashMap2.containsKey(n2)) {
                tIntObjectHashMap2.put(n2, (Object)new eVp());
            }
            ((eVp)tIntObjectHashMap2.get(n2)).add(iterable2);
        }
        if (rh_02 != null) {
            object = sr_0.bgd();
            ((sr_0)object).a(6, (byte)1, (short)4);
            ((sr_0)object).b(rh_02);
            rh_02.bd(true);
        } else {
            object = null;
        }
        ArrayList<eVj> arrayList = new ArrayList<eVj>();
        try {
            acd_12 = tIntObjectHashMap.iterator();
            while (acd_12.hasNext()) {
                acd_12.advance();
                arrayList.addAll(eVo.a((eVp)acd_12.value(), this.rzR, (sr_0)object));
            }
            acd_12 = tIntObjectHashMap2.iterator();
            while (acd_12.hasNext()) {
                acd_12.advance();
                arrayList.addAll(eVo.a((eVp)acd_12.value(), this.rzR, (sr_0)object));
            }
        }
        finally {
            if (rh_02 != null) {
                rh_02.bd(false);
                ((sr_0)object).aZp();
            }
        }
        return arrayList;
    }

    protected static ArrayList<eVj> a(eVp eVp2, int n, @Nullable sr_0 sr_02) {
        eST eST2 = null;
        eST eST3 = null;
        eVj eVj2 = null;
        ArrayList<eVj> arrayList = new ArrayList<eVj>();
        Iterator iterator = eVp2.iterator();
        eST2 = null;
        while (iterator.hasNext()) {
            eST3 = (eST)iterator.next();
            if (eST2 != null) {
                if (!eVj.b(eST3.aZw(), eST2.aZw(), n)) {
                    eVj2 = null;
                } else if (sr_02 != null && !sr_02.c(eST2.aZw(), eST3.aZw())) {
                    eVj2 = null;
                } else if (eVj2 == null) {
                    eVj2 = new eVj(eST2, eST3);
                    arrayList.add(eVj2);
                } else if (eVj2.a(eST3.aZw(), n)) {
                    boolean bl = eVj2.a(eST3, n);
                    if (!bl) {
                        eVj2 = null;
                    }
                } else {
                    eVj2 = new eVj(eST2, eST3);
                    arrayList.add(eVj2);
                }
            }
            eST2 = eST3;
        }
        return arrayList;
    }

    public static boolean a(acd_1 acd_12, List<eVo> list) {
        for (eVo eVo2 : list) {
            if (!eVo2.aq(acd_12.getX(), acd_12.getY())) continue;
            return true;
        }
        return false;
    }
}

