/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aqe
 */
public final class aqe_2
implements aql_2 {
    private static final Logger cQm = Logger.getLogger(aqe_2.class);
    private static final aqe_2 cQn = new aqe_2();
    private final TIntObjectHashMap<apy_1> cQo = new TIntObjectHashMap();
    private static final Object cQp = new Object();

    private aqe_2() {
    }

    public static aqe_2 bGp() {
        return cQn;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(apy_1 apy_12) {
        Object object = cQp;
        synchronized (object) {
            if (!this.cQo.contains(apy_12.bGa())) {
                this.cQo.put(apy_12.bGa(), (Object)apy_12);
                apy_12.a(this);
            } else {
                cQm.error((Object)("Multiple enregistrements d'un binary storage travaillant sur " + apy_12.bGc()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public apy_1 tB(int n) {
        Object object = cQp;
        synchronized (object) {
            return (apy_1)this.cQo.get(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public apy_1 fH(String string) {
        Object object = cQp;
        synchronized (object) {
            if (!this.cQo.contains(string.hashCode())) {
                apy_1 apy_12 = new apy_1(string);
                apy_12.ty(string.hashCode());
                this.a(apy_12);
            }
            return (apy_1)this.cQo.get(string.hashCode());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bGq() {
        Object object = cQp;
        synchronized (object) {
            TIntObjectIterator tIntObjectIterator = this.cQo.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((apy_1)tIntObjectIterator.value()).aKM();
            }
        }
    }

    @Override
    public void a(aps_1 aps_12, String string) {
        cQm.info((Object)("Enregistrement du binary storage travaillant sur " + aps_12.bGc()));
    }

    @Override
    public void a(aps_1 aps_12, apx_1 apx_12) {
    }

    @Override
    public void b(aps_1 aps_12, apx_1 apx_12) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(aps_1 aps_12) {
        Object object = cQp;
        synchronized (object) {
            this.cQo.remove(aps_12.bGa());
            cQm.info((Object)("Desenregistrement du binary storage travaillant sur " + aps_12.bGc() + " (" + this.cQo.size() + " binary storage restants)"));
        }
    }

    @Override
    public void c(aps_1 aps_12, apx_1 apx_12) {
    }
}

