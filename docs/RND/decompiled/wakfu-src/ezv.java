/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public abstract class ezv {
    protected static final Logger prM = Logger.getLogger(ezv.class);
    private static final TLongObjectHashMap<TByteLongHashMap> prNN = new TLongObjectHashMap();

    protected long a(exP exP2, ezj_0 ezj_02) {
        if (exP2 != null) {
            long l = exP2.Sn();
            TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(l);
            if (tByteLongHashMap == null) {
                tByteLongHashMap = new TByteLongHashMap(3);
                prNN.put(l, (Object)tByteLongHashMap);
            }
            long l2 = tByteLongHashMap.put(ezj_02.aJr(), System.currentTimeMillis());
            prNN.put(l, (Object)tByteLongHashMap);
            exP2.f(ezj_02);
            return l2;
        }
        return 0L;
    }

    public byte[] pt(long l) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(l);
        if (tByteLongHashMap != null) {
            return tByteLongHashMap.keys();
        }
        return null;
    }

    public static boolean a(long l, ezj_0 ezj_02) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(l);
        return tByteLongHashMap != null && tByteLongHashMap.containsKey(ezj_02.aJr());
    }

    public static long b(long l, ezj_0 ezj_02) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(l);
        long l2 = 0L;
        if (tByteLongHashMap != null) {
            l2 = tByteLongHashMap.get(ezj_02.aJr());
        }
        return l2;
    }

    public void pu(long l) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(l);
        if (tByteLongHashMap != null) {
            tByteLongHashMap.clear();
        }
    }

    public long b(exP exP2, ezj_0 ezj_02) {
        if (exP2 != null) {
            TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)prNN.get(exP2.Sn());
            long l = 0L;
            if (tByteLongHashMap != null) {
                l = tByteLongHashMap.remove(ezj_02.aJr());
            }
            exP2.h(ezj_02);
            return l;
        }
        return 0L;
    }

    public TByteLongHashMap pv(long l) {
        return (TByteLongHashMap)prNN.remove(l);
    }

    public void removeAll() {
        prNN.clear();
    }
}

