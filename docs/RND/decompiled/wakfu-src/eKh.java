/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Collection;
import java.util.Collections;

public final class eKh {
    public static final eKh qBm = new eKh();
    private final TIntObjectMap<eKg> qBn = new TIntObjectHashMap();
    private eKg qBo;

    private eKh() {
    }

    public void a(eKg eKg2) {
        this.qBn.put(eKg2.d(), (Object)eKg2);
        this.b(eKg2);
    }

    private void b(eKg eKg2) {
        if (this.qBo == null) {
            this.qBo = eKg2;
        } else if (this.qBo.aVe() < eKg2.aVe()) {
            this.qBo = eKg2;
        }
    }

    public Collection<eKg> fxO() {
        return Collections.unmodifiableCollection(this.qBn.valueCollection());
    }

    public eKg fxP() {
        return this.qBo;
    }
}

