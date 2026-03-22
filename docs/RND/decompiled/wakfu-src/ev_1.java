/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.decorator.TShortObjectMapDecorator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.decorator.TShortObjectMapDecorator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Collections;
import java.util.Map;

/*
 * Renamed from EV
 */
public class ev_1 {
    private final TShortObjectHashMap<eu_1> azE = new TShortObjectHashMap();

    public eu_1 a(eu_1 eu_12) {
        return (eu_1)this.azE.put(eu_12.aIi(), (Object)eu_12);
    }

    public Map<Short, eu_1> aJF() {
        return Collections.unmodifiableMap(new TShortObjectMapDecorator(this.azE));
    }

    public boolean aJG() {
        return this.azE.isEmpty();
    }

    public eu_1 o(short s) {
        return (eu_1)this.azE.get(s);
    }

    public void clear() {
        this.azE.clear();
    }
}

