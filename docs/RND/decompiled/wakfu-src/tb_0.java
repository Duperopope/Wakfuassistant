/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from Tb
 */
public class tb_0<C extends sz_0<V>, V extends PH>
implements tc_0<V> {
    protected static final Logger brW = Logger.getLogger(tb_0.class);
    protected final TIntObjectHashMap<C> brX = new TIntObjectHashMap();
    private final ArrayList<tc_0<V>> brY = new ArrayList();

    @Override
    public void a(C c2) {
        int n = ((sz_0)c2).avr();
        if (this.brX.contains(n)) {
            brW.warn((Object)("Surcharge du compteur pour le type id=" + n + " : \u00e9trange"));
        }
        this.brX.put(((sz_0)c2).avr(), c2);
    }

    @Override
    public void a(V v) {
        int n = v.avr();
        if (this.brX.contains(n)) {
            ((sz_0)this.brX.get(n)).a(v);
            int n2 = this.brY.size();
            for (int i = 0; i < n2; ++i) {
                this.brY.get(i).a(v);
            }
        }
    }

    @Override
    public void b(V v) {
        int n = v.avr();
        if (this.brX.contains(n)) {
            ((sz_0)this.brX.get(n)).b(v);
            int n2 = this.brY.size();
            for (int i = 0; i < n2; ++i) {
                this.brY.get(i).b(v);
            }
        }
    }

    public C pm(int n) {
        return (C)((sz_0)this.brX.get(n));
    }

    @Override
    public void a(tc_0<V> tc_02) {
        this.brY.add(tc_02);
    }

    public TIntObjectHashMap<C> bgB() {
        return this.brX;
    }

    public void reset() {
        this.brX.clear();
    }

    public String toString() {
        return "CountManager{m_counters=" + this.brX.size() + "}";
    }
}

