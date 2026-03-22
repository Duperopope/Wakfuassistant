/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Renamed from azt
 */
class azt_2
extends LinkedHashMap<K, V> {
    final /* synthetic */ azs_2 dvA;

    azt_2(azs_2 azs_22, int n, float f2, boolean bl) {
        this.dvA = azs_22;
        super(n, f2, bl);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return this.size() > this.dvA.dvz;
    }
}

