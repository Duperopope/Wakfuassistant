/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

public class fgD<R extends fhc_0>
implements RW<ffV, uy_1>,
ffk,
fgc_0,
fgh {
    protected static final Logger sjR = Logger.getLogger(fgD.class);
    protected final TIntObjectHashMap<R> sjS = new TIntObjectHashMap();
    protected final TIntObjectHashMap<ffV> sjT = new TIntObjectHashMap();
    private static fgD sjU = new fgD();

    public static fgD fXh() {
        return sjU;
    }

    public static void a(fgD fgD2) {
        sjU = fgD2;
    }

    protected fgD() {
    }

    public void e(R r) {
        this.sjS.put(((fhc_0)r).d(), r);
    }

    public boolean DW(int n) {
        return this.sjS.containsKey(n);
    }

    public R Vd(int n) {
        return (R)((fhc_0)this.sjS.get(n));
    }

    public @Unmodifiable Collection<R> fXi() {
        return Collections.unmodifiableCollection(this.sjS.valueCollection());
    }

    public static List<ffV> Q(int[] nArray) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        for (int n : nArray) {
            arrayList.add(fgD.fXh().Ve(n));
        }
        return arrayList;
    }

    public ffV Ve(int n) {
        ffV ffV2 = (ffV)this.sjT.get(n);
        if (ffV2 == null) {
            R r = this.Vd(n);
            if (r == null) {
                return null;
            }
            ffV2 = ffV.k(r);
            this.sjT.put(n, (Object)ffV2);
        }
        return ffV2;
    }

    public ffV a(uy_1 uy_12) {
        ffV ffV2 = this.fQJ();
        if (ffV2.c(uy_12)) {
            return ffV2;
        }
        return null;
    }

    @Override
    public ffV fQJ() {
        return new ffV();
    }

    @Override
    public uy_1 fXg() {
        return new uy_1();
    }

    public TIntObjectIterator<R> ekN() {
        return this.sjS.iterator();
    }

    public Collection<R> fXj() {
        return this.sjS.valueCollection();
    }

    public fgj Vf(int n) {
        fhc_0 fhc_02 = (fhc_0)this.sjS.get(n);
        if (fhc_02 == null) {
            return null;
        }
        return fhc_02.dwg();
    }

    public void clear() {
        this.sjS.clear();
    }

    @Override
    public /* synthetic */ RT x(Object object) {
        return this.a((uy_1)object);
    }

    @Override
    public /* synthetic */ ffj UF(int n) {
        return this.Vd(n);
    }
}

