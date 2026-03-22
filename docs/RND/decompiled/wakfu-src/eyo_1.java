/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from eYo
 */
public final class eyo_1 {
    private final Map<Long, eMW> rJD = Maps.newHashMap();

    public void a(long l, eMW eMW2) {
        this.rJD.put(l, eMW2);
    }

    public void kS(long l) {
        this.rJD.remove(l);
    }

    public void clear() {
        this.rJD.clear();
    }

    public Set<Map.Entry<Long, eMW>> fdq() {
        return this.rJD.entrySet();
    }

    public void a(eyo_1 eyo_12) {
        this.rJD.putAll(eyo_12.rJD);
    }

    public boolean aJG() {
        return this.rJD.isEmpty();
    }

    public Optional<eMW> rt(long l) {
        return Optional.ofNullable(this.rJD.get(l));
    }
}

