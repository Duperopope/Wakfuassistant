/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

public final class exc {
    public static final long oTF = 9L;
    public static final long oTG = 862L;
    public static final long oTH = 1225L;
    public static final long oTI = 1226L;
    public static final long oTJ = 1227L;
    public static final long oTK = 1228L;
    public static final long oTL = 1334L;
    public static final acd_1 oTM = new acd_1(13, -11, -12);
    public static final long oTN = 725L;
    public static final Set<Long> oTO = ImmutableSet.of((Object)1361L, (Object)1385L, (Object)1387L, (Object)1388L, (Object)1465L);
    public static final Set<Long> oTP = ImmutableSet.of((Object)1361L, (Object)1465L);
    public static final Set<Long> oTQ = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)1334L);
    public static final Set<Long> oTR = ImmutableSet.of((Object)337L, (Object)343L, (Object)348L);
    public static final Set<Long> oTS = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)487L, (Object)725L, (Object[])new Long[]{1334L});
    public static final Set<Long> oTT = ImmutableSet.of((Object)1225L, (Object)1226L, (Object)1227L, (Object)1228L, (Object)487L, (Object)725L, (Object[])new Long[]{1334L});
    public static final Set<Long> oTU;

    private exc() {
    }

    static {
        HashSet<Long> hashSet = new HashSet<Long>(oTQ);
        hashSet.add(862L);
        hashSet.addAll(oTO);
        hashSet.addAll(oTP);
        hashSet.addAll(oTR);
        oTU = ImmutableSet.copyOf(hashSet);
    }
}

