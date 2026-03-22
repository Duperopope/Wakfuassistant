/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.List;

class bsN {
    private final TByteObjectHashMap<List<bgy>> jjf = new TByteObjectHashMap();

    bsN() {
        for (byte by = 0; by < 2; by = (byte)(by + 1)) {
            this.jjf.put(by, new ArrayList());
        }
    }

    List<bgy> bO(byte by) {
        return (List)this.jjf.get(by);
    }

    void d(bgy bgy2, byte by) {
        ((List)this.jjf.get(by)).add(bgy2);
    }

    void e(bgy bgy2, byte by) {
        ((List)this.jjf.get(by)).add(0, bgy2);
    }
}

