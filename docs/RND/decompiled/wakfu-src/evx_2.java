/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.StreamSupport;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from evx
 */
public final class evx_2 {
    private static final Logger ovS = Logger.getLogger(evx_2.class);
    private static final evx_2 ovT = new evx_2(evw_2.ovR);
    private evw_2 ovU;
    private final Long2ObjectOpenHashMap<EnumMap<eva_1, evv_2>> ovV = new Long2ObjectOpenHashMap();
    private final Collection<evy_2> ovW = new ArrayList<evy_2>();

    public static evx_2 feo() {
        return ovT;
    }

    private evx_2(evw_2 evw_22) {
        this.ovU = evw_22;
    }

    public Optional<evv_2> a(long l, eva_1 eva_12) {
        return Optional.ofNullable((EnumMap)this.ovV.get(l)).map(enumMap -> (evv_2)enumMap.get((Object)eva_12));
    }

    public <T extends evv_2> Optional<T> b(long l, eva_1 eva_12) {
        return this.a(l, eva_12).map(evv_22 -> evv_22);
    }

    public Map<eva_1, evv_2> pe(long l) {
        return (Map)this.ovV.get(l);
    }

    public Long2ObjectOpenHashMap<evv_2> b(eva_1 eva_12) {
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        this.ovV.forEach((l, enumMap) -> {
            if (enumMap.containsKey((Object)eva_12)) {
                long2ObjectOpenHashMap.put(l, (Object)((evv_2)enumMap.get((Object)eva_12)));
            }
        });
        return long2ObjectOpenHashMap;
    }

    public void a(long l, evv_2 ... evv_2Array) {
        EnumMap<eva_1, evv_2> enumMap = (EnumMap<eva_1, evv_2>)this.ovV.get(l);
        if (enumMap == null) {
            enumMap = new EnumMap<eva_1, evv_2>(eva_1.class);
            this.ovV.put(l, enumMap);
        }
        for (evv_2 evv_22 : evv_2Array) {
            evv_2 evv_23 = (evv_2)enumMap.get((Object)evv_22.fek());
            if (evv_23 != null) {
                evv_23.fem();
            }
            enumMap.put(evv_22.fek(), evv_22);
            this.b(l, evv_22);
        }
    }

    public void a(long l, eva_1 ... eva_1Array) {
        EnumMap enumMap = (EnumMap)this.ovV.get(l);
        for (eva_1 eva_12 : eva_1Array) {
            this.b(l, (evv_2)enumMap.get((Object)eva_12));
        }
    }

    public byte[] a(long l, evz_2 evz_22) {
        Set<eva_1> set = evz_22.fes();
        List<evv_2> list = this.a(l, set);
        return evx_2.H(list);
    }

    public static byte[] f(evv_2 evv_22) {
        return evx_2.H(Collections.singleton(evv_22));
    }

    private static byte[] H(Collection<evv_2> collection) {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(collection.size());
        for (evv_2 evv_22 : collection) {
            azg_12.vC(evv_22.fek().ordinal());
            azg_12.dH(evv_22.fej());
        }
        return azg_12.bTe();
    }

    private @Unmodifiable List<evv_2> a(long l, Iterable<eva_1> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).map(eva_12 -> {
            Optional<evv_2> optional = this.a(l, (eva_1)((Object)eva_12));
            return optional.orElse(null);
        }).filter(Objects::nonNull).toList();
    }

    public void d(long l, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            eva_1 eva_12 = eva_1.values()[byteBuffer.getInt()];
            evv_2 evv_22 = eva_12.feu();
            if (evv_22 == null) continue;
            try {
                evv_22.a(l, byteBuffer);
            }
            catch (RuntimeException runtimeException) {
                ovS.error((Object)("Error while unserializing GameAccountData of type " + String.valueOf((Object)eva_12) + " for account " + l), (Throwable)runtimeException);
            }
            this.a(l, evv_22);
        }
    }

    public boolean a(evy_2 evy_22) {
        if (this.ovW.contains(evy_22)) {
            return false;
        }
        return this.ovW.add(evy_22);
    }

    public boolean b(evy_2 evy_22) {
        return this.ovW.remove(evy_22);
    }

    private void b(long l, evv_2 evv_22) {
        for (evy_2 evy_22 : this.ovW) {
            try {
                evy_22.a(l, evv_22);
            }
            catch (Exception exception) {
                ovS.error((Object)String.format("Exception thrown during onDataSet invocation for following listener class %s and following account %s", evy_22.getClass(), l), (Throwable)exception);
            }
        }
    }

    public void c(long l, eva_1 eva_12) {
        evv_2 evv_22;
        ovS.info((Object)("Cleaning type " + String.valueOf((Object)eva_12) + " for account " + l));
        EnumMap enumMap = (EnumMap)this.ovV.get(l);
        if (enumMap != null && (evv_22 = (evv_2)enumMap.remove((Object)eva_12)) != null) {
            evv_22.fem();
        }
    }

    public void pf(long l) {
        ovS.info((Object)("Cleaning GameAccountData for " + l));
        EnumMap enumMap = (EnumMap)this.ovV.get(l);
        if (enumMap == null) {
            return;
        }
        for (eva_1 eva_12 : eva_1.owI) {
            evv_2 evv_22;
            if (!eva_12.fev() || (evv_22 = (evv_2)enumMap.remove((Object)eva_12)) == null) continue;
            evv_22.fem();
        }
    }

    public void fep() {
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        this.ovV.forEach((l, enumMap) -> {
            if (evx_2.C(enumMap)) {
                return;
            }
            long2ObjectOpenHashMap.put(l, enumMap);
        });
        long2ObjectOpenHashMap.forEach(this::a);
    }

    private static boolean C(Map<eva_1, evv_2> map) {
        return map.entrySet().stream().anyMatch(entry -> ((eva_1)((Object)((Object)entry.getKey()))).fev());
    }

    private void a(long l, Map<eva_1, evv_2> map) {
        HashSet hashSet = new HashSet();
        map.forEach((eva_12, evv_22) -> {
            if (eva_12 == eva_1.owv && evv_22.fel()) {
                hashSet.add(eva_12);
            }
        });
        EnumMap enumMap = (EnumMap)this.ovV.get(l);
        if (enumMap != null) {
            hashSet.forEach(eva_12 -> {
                evv_2 evv_22 = (evv_2)enumMap.remove(eva_12);
                if (evv_22 != null) {
                    evv_22.fem();
                }
            });
        }
    }

    public int feq() {
        return this.ovV.size();
    }

    public String toString() {
        return "GameAccountManager{m_data size =" + this.ovV.size() + "}";
    }

    @Generated
    public evw_2 fer() {
        return this.ovU;
    }

    @Generated
    public void a(evw_2 evw_22) {
        this.ovU = evw_22;
    }
}

