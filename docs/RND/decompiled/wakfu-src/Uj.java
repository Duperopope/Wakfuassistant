/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Uj
implements Ui<TO> {
    public static final int buy = 0;
    final TShortObjectHashMap<List<TO>> buz = new TShortObjectHashMap();
    final TShortObjectHashMap<List<TO>> buA = new TShortObjectHashMap();
    private final TLongHashSet buB = new TLongHashSet();

    public tz_0 a(TO tO, Ua ua, boolean bl, boolean bl2, short s) {
        boolean bl3 = !bl2 && !bl;
        short s2 = (short)(s + (bl3 ? (short)1 : 0) + ua.biS());
        short s3 = (short)(s + (bl3 ? (short)1 : 0));
        if (ua.biM()) {
            s2 = (short)(s2 - 1);
        }
        if (bl && ua.biQ()) {
            s2 = (short)(s2 + 1);
        }
        s2 = (short)Math.max(s3, s2);
        if (ua.biM()) {
            this.a(tO, s2, this.buA);
        } else {
            this.a(tO, s2, this.buz);
        }
        tO.a(this);
        return tz_0.ff(tO.biC()).pA(s2).bn(ua.biM());
    }

    void a(TO tO, short s, TShortObjectHashMap<List<TO>> tShortObjectHashMap) {
        ArrayList<TO> arrayList = (ArrayList<TO>)tShortObjectHashMap.get(s);
        if (arrayList == null) {
            arrayList = new ArrayList<TO>();
            tShortObjectHashMap.put(s, arrayList);
        }
        arrayList.add(tO);
    }

    public void a(long l, short s, TA tA) {
        List list = (List)this.buz.get(s);
        if (list == null) {
            return;
        }
        this.a(l, tA, list);
    }

    public void b(long l, short s, TA tA) {
        List list = (List)this.buA.get(s);
        if (list == null) {
            return;
        }
        this.a(l, tA, list);
    }

    void a(long l, TA tA, List<TO> list) {
        ArrayList<TO> arrayList = new ArrayList<TO>(list);
        Iterator<TO> iterator = arrayList.iterator();
        while (tA.bhl() && iterator.hasNext()) {
            TO tO = iterator.next();
            if (l != 0L && tO.biC() != l || !list.contains(tO)) continue;
            iterator.remove();
            tA.a(tO);
            this.c(tO);
        }
    }

    private void a(TA tA, List<TO> list) {
        this.a(0L, tA, list);
    }

    public void a(TO tO) {
        this.c(tO);
    }

    private void c(TO tO) {
        this.buz.forEachValue((TObjectProcedure)new Uk(this, tO));
        this.buA.forEachValue((TObjectProcedure)new Ul(this, tO));
    }

    private void biY() {
        this.a(this.buz);
        this.a(this.buA);
    }

    public void bhO() {
        this.buA.clear();
        this.buz.clear();
    }

    public void fi(long l) {
        this.buB.add(l);
    }

    public void fj(long l) {
        this.buB.remove(l);
    }

    public void a(short s, TA tA) {
        this.b(s, tA);
        this.c(s, tA);
        this.biY();
    }

    private void b(short s, TA tA) {
        this.buB.forEach((TLongProcedure)new Um(this, s, tA));
    }

    private void c(short s, TA tA) {
        List list;
        int n = s - 1;
        List list2 = (List)this.buz.get((short)n);
        if (list2 != null) {
            this.a(tA, list2);
        }
        if ((list = (List)this.buA.get((short)n)) != null) {
            this.a(tA, list);
        }
    }

    private void a(TShortObjectHashMap<List<TO>> tShortObjectHashMap) {
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            List list = (List)tShortObjectIterator.value();
            if (!list.isEmpty()) continue;
            tShortObjectIterator.remove();
        }
    }

    public TLongHashSet biZ() {
        return this.buB;
    }

    TShortObjectHashMap<List<TO>> bja() {
        return this.buz;
    }

    TShortObjectHashMap<List<TO>> bjb() {
        return this.buA;
    }

    @Override
    public /* synthetic */ void b(Ug ug) {
        this.a((TO)ug);
    }
}

