/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class fjt {
    public static final fjt syH = new fjt();
    private static final Logger syI = Logger.getLogger(fjt.class);
    private final TIntObjectHashMap<fjo_0> syJ = new TIntObjectHashMap();
    private final ArrayList<fjw_0> syK = new ArrayList();
    public static final int syL = 1;

    private fjt() {
    }

    public void a(fjw_0 fjw_02) {
        if (this.syK.contains(fjw_02)) {
            return;
        }
        this.syK.add(fjw_02);
        TIntObjectIterator<fjo_0> tIntObjectIterator = this.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
            fjw_02.m(fjo_02);
        }
    }

    private void m(fjo_0 fjo_02) {
        for (int i = 0; i < this.syK.size(); ++i) {
            this.syK.get(i).m(fjo_02);
        }
    }

    public boolean n(fjo_0 fjo_02) {
        int n = fjo_02.Xt();
        fjo_0 fjo_03 = (fjo_0)this.syJ.get(n);
        if (fjo_03 != null && fjo_02.Xt() == 0) {
            syI.info((Object)"[NATION] Overriding VOID_NATION with loaded data");
            fjo_03.a(fjo_02.gbp(), fjo_02.gbq(), fjo_02.gbr(), fjo_02.gbs());
            fjo_03.a(fjo_02.gbP(), fjo_02.gbQ(), fjo_02.gbR());
            return true;
        }
        if (fjo_03 != null && fjo_03 != fjo_02) {
            syI.error((Object)("[NATION] Overriding an unauthorized nation for id " + n));
            return false;
        }
        this.syJ.put(n, (Object)fjo_02);
        this.m(fjo_02);
        return true;
    }

    public fjo_0 WG(int n) {
        return (fjo_0)this.syJ.get(n);
    }

    public TIntObjectIterator<fjo_0> eCu() {
        return this.syJ.iterator();
    }

    public TIntObjectIterator<fjo_0> b(Integer ... integerArray) {
        return new fju_0((TIntObjectMap<fjo_0>)this.syJ, (Collection<Integer>)ImmutableSet.builder().add((Object[])integerArray).add((Object)0).build());
    }

    public int[] gbS() {
        return this.syJ.keys();
    }

    public int tW(long l) {
        TIntObjectIterator<fjo_0> tIntObjectIterator = this.b(new Integer[0]);
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fjo_0 fjo_02 = (fjo_0)tIntObjectIterator.value();
            if (fjo_02.tV(l) == null) continue;
            return fjo_02.Xt();
        }
        return 0;
    }
}

