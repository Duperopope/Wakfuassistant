/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Renamed from feC
 */
public final class fec_0
implements fff<ffm>,
ffn {
    private final List<ffl> set = new ArrayList<ffl>();
    private boolean seu;
    private final TIntObjectHashMap<ffm> sev = new TIntObjectHashMap();

    @Override
    public boolean a(TObjectProcedure<ffm> tObjectProcedure) {
        return this.sev.forEachValue(tObjectProcedure);
    }

    @Override
    public void r(Consumer<ffm> consumer) {
        this.sev.valueCollection().forEach(consumer);
    }

    public ffm UB(int n) {
        return (ffm)this.sev.get(n);
    }

    void c(ffm ffm2) {
        this.sev.put(ffm2.acs(), (Object)ffm2);
        ffm2.a(this);
        this.e(ffm2);
    }

    void d(ffm ffm2) {
        this.sev.remove(ffm2.acs());
        ffm2.b(this);
        this.f(ffm2);
    }

    void clear() {
        this.sev.clear();
    }

    private void e(ffm ffm2) {
        if (this.seu) {
            return;
        }
        int n = this.set.size();
        for (int i = 0; i < n; ++i) {
            this.set.get(i).a(ffm2);
        }
    }

    private void f(ffm ffm2) {
        if (this.seu) {
            return;
        }
        int n = this.set.size();
        for (int i = 0; i < n; ++i) {
            this.set.get(i).b(ffm2);
        }
    }

    @Override
    public void b(ffm ffm2, int n) {
        if (this.seu) {
            return;
        }
        int n2 = this.set.size();
        for (int i = 0; i < n2; ++i) {
            this.set.get(i).a(ffm2, n);
        }
    }

    public boolean a(ffl ffl2) {
        return !this.set.contains(ffl2) && this.set.add(ffl2);
    }

    public boolean b(ffl ffl2) {
        return this.set.remove(ffl2);
    }

    public void dQY() {
        this.set.clear();
    }

    public void mV(boolean bl) {
        this.seu = bl;
    }

    public String toString() {
        return "QuestItemInventory{m_items=" + this.sev.size() + "}";
    }
}

