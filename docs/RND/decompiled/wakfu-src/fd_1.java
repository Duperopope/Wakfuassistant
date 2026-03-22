/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Collection;
import java.util.Collections;

/*
 * Renamed from Fd
 */
public class fd_1 {
    private final TShortObjectHashMap<fc_1> aAz = new TShortObjectHashMap();

    public void a(fc_1 fc_12) {
        this.aAz.put(fc_12.aIi(), (Object)fc_12);
    }

    public Collection<fc_1> aKv() {
        return Collections.unmodifiableCollection(this.aAz.valueCollection());
    }

    public fc_1 t(short s) {
        return (fc_1)this.aAz.get(s);
    }

    public void clear() {
        this.aAz.clear();
    }
}

