/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Renamed from ML
 */
class ml_1
extends mn_1 {
    private final SortedMap<Integer, Long> aXc;

    ml_1(Map<Integer, Long> map) {
        this.aXc = new TreeMap<Integer, Long>(map);
    }

    @Override
    int Fq() {
        if (this.aXf != null) {
            return this.aXf;
        }
        int n = this.aXc.isEmpty() ? 0 : this.aXc.lastKey() - this.aXc.firstKey();
        return this.rI() + n;
    }

    @Override
    long[] aVk() {
        long[] lArray = new long[this.Fq() - this.rI() + 1];
        for (int i = 0; i < lArray.length - 1; ++i) {
            SortedMap<Integer, Long> sortedMap = this.aXc.headMap(this.rI() + i + 1);
            long l = sortedMap.isEmpty() ? 0L : (Long)this.aXc.get(sortedMap.lastKey());
            lArray[i + 1] = lArray[i] + l;
        }
        return lArray;
    }
}

