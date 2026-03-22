/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.List;

public class flO
extends flv_0<fmL> {
    static final flz sGc = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<flO> sGd = new flP();

    flO(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFs;
    }

    @Override
    public boolean a(fmL fmL2) {
        if (!fmL2.gdw().fyR()) {
            return false;
        }
        fpZ fpZ2 = fmL2.gdv();
        int n = fpZ2.cqy();
        foG foG2 = fmL2.gdx();
        if (foG2 == null) {
            return false;
        }
        if (fpZ2 instanceof eih_0) {
            eih_0 eih_02 = (eih_0)((Object)fpZ2);
            TIntHashSet tIntHashSet = eih_02.ebX();
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                if (!foG2.XV(tIntIterator.next())) continue;
                return true;
            }
        }
        return foG2.XW(n);
    }
}

