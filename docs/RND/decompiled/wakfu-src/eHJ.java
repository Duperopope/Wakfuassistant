/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.function.Consumer;

public final class eHJ {
    public static final eHJ qsV = new eHJ();
    private final TIntObjectHashMap<ehw_0> qsW = new TIntObjectHashMap();

    private eHJ() {
    }

    public void b(ehw_0 ehw_02) {
        this.a(ehw_02.d(), ehw_02);
    }

    public ehw_0 a(int n, ehw_0 ehw_02) {
        return (ehw_0)this.qsW.put(n, (Object)ehw_02);
    }

    public <T extends ehw_0> T Py(int n) {
        return (T)((ehw_0)this.qsW.get(n));
    }

    public boolean Pz(int n) {
        return this.qsW.containsKey(n);
    }

    public void o(Consumer<ehw_0> consumer) {
        this.qsW.forEachValue(ehw_02 -> {
            consumer.accept((ehw_0)ehw_02);
            return true;
        });
    }

    public String toString() {
        return "AptitudeBonusModelManager{m_bonusById=" + String.valueOf(this.qsW) + "}";
    }
}

