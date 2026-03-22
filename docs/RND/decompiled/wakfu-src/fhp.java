/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class fhp {
    public static final fhp sop = new fhp();
    private final List<fhq> soq = new ArrayList<fhq>();
    private final Table<Long, Long, fhm> sor = HashBasedTable.create();

    public void a(long l, long l2, fhm fhm2) {
        this.sor.put((Object)l, (Object)l2, (Object)fhm2);
        for (fhq fhq2 : this.soq) {
            fhq2.a(l, fhm2);
        }
    }

    @Nullable
    public fhm tC(long l) {
        Map map = this.sor.column((Object)l);
        if (map == null) {
            return null;
        }
        Iterator iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        return (fhm)iterator.next().getValue();
    }

    public fhm aJ(long l, long l2) {
        return (fhm)this.sor.get((Object)l, (Object)l2);
    }

    public List<fhm> tD(long l) {
        HashSet<Long> hashSet = new HashSet<Long>();
        Map map = this.sor.row((Object)l);
        for (Map.Entry object : map.entrySet()) {
            hashSet.add((Long)object.getKey());
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : hashSet) {
            fhm fhm2 = (fhm)this.sor.remove((Object)l, (Object)l2);
            arrayList.add(fhm2);
        }
        return arrayList;
    }

    public fhm aK(long l, long l2) {
        return (fhm)this.sor.remove((Object)l, (Object)l2);
    }

    public Collection<fhm> tE(long l) {
        return this.sor.row((Object)l).values();
    }

    public void a(fhq fhq2) {
        if (!this.soq.contains(fhq2)) {
            this.soq.add(fhq2);
        }
    }

    public void b(fhq fhq2) {
        this.soq.remove(fhq2);
    }
}

