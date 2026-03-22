/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eKr
 */
public class ekr_0
implements evv_2 {
    private static final Logger qBW = Logger.getLogger(ekr_0.class);
    private final Map<Integer, eks_0> qBX = new HashMap<Integer, eks_0>();
    private final Map<Long, Integer> qBY = new HashMap<Long, Integer>();

    public void a(int n, eks_0 eks_02) {
        this.qBX.put(n, eks_02);
    }

    public void qc(long l) {
        this.qBY.remove(l);
    }

    public Optional<eks_0> qd(long l) {
        Integer n = this.qBY.get(l);
        if (n == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.qBX.get(n));
    }

    public int fxY() {
        return this.qBX.size();
    }

    public @Unmodifiable Map<Integer, eks_0> fxZ() {
        return Collections.unmodifiableMap(this.qBX);
    }

    public int fya() {
        int n = ekj_0.fxQ();
        for (int i = 0; i < n; ++i) {
            if (this.qBX.containsKey(i)) continue;
            return i;
        }
        return -1;
    }

    public void Qr(int n) {
        if (!this.qBX.containsKey(n)) {
            return;
        }
        this.qBX.remove(n);
        this.Qs(n);
    }

    public Set<Long> Qs(int n) {
        HashSet<Long> hashSet = new HashSet<Long>();
        for (Map.Entry<Long, Integer> entry : this.qBY.entrySet()) {
            if (entry.getValue() != n) continue;
            hashSet.add(entry.getKey());
        }
        hashSet.forEach(this.qBY::remove);
        return hashSet;
    }

    public boolean Qt(int n) {
        return this.qBX.containsKey(n);
    }

    public Map<Long, Integer> fyb() {
        return this.qBY;
    }

    public void F(Map<Long, Integer> map) {
        this.qBY.clear();
        this.qBY.putAll(map);
    }

    public void W(long l, int n) {
        this.qBY.put(l, n);
    }

    public void qe(long l) {
        this.qBY.remove(l);
    }

    public Optional<eks_0> Qu(int n) {
        return Optional.ofNullable(this.qBX.get(n));
    }

    public boolean C(int n, long l) {
        Integer n2 = this.qBY.get(l);
        return n2 != null && n2 == n;
    }

    public @Unmodifiable List<Long> Qv(int n) {
        return this.qBY.entrySet().stream().filter(entry -> (Integer)entry.getValue() == n).map(Map.Entry::getKey).toList();
    }

    public Map<Integer, eks_0> fyc() {
        return this.qBX;
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        try {
            fu_1 fu_12 = fu_1.aA(byArray);
            this.qBX.clear();
            this.qBY.clear();
            this.qBY.putAll(fu_12.Cw());
            fu_12.Cq().forEach(fp_12 -> this.qBX.put(fp_12.BJ(), ekt_0.f(fp_12)));
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qBW.error((Object)"Could not parse cosmetic preset inventory ", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] fej() {
        fx_2 fx_22 = fu_1.Cy();
        List<fp_1> list = this.qBX.values().stream().map(ekt_0::f).toList();
        fx_22.u(list);
        fx_22.j(this.qBY);
        azg_1 azg_12 = new azg_1();
        byte[] byArray = fx_22.CE().toByteArray();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owz;
    }

    public String toString() {
        return "CosmeticPresetAccountData{m_cosmeticPresetsById=" + String.valueOf(this.qBX) + ", m_presetByCharacters=" + String.valueOf(this.qBY) + "}";
    }

    public List<Integer> i(fm_1 fm_12, int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Map.Entry<Integer, eks_0> entry : this.qBX.entrySet()) {
            eks_0 eks_02 = entry.getValue();
            if (!eks_02.k(fm_12, n)) continue;
            eks_02.j(fm_12, n);
            arrayList.add(eks_02.BJ());
        }
        return arrayList;
    }

    public void reset() {
        this.qBX.clear();
        this.qBY.clear();
    }

    public void a(ekr_0 ekr_02, long l2) {
        Map<Integer, eks_0> map = ekr_02.fyc();
        for (Map.Entry<Integer, eks_0> entry : map.entrySet()) {
            int n = this.fya();
            if (n == -1) {
                qBW.warn((Object)("Maximum capacity reached for account " + l2 + ". No further presets will be merged."));
                return;
            }
            eks_0 eks_02 = entry.getValue();
            this.qBX.put(n, eks_02.Qw(n));
            Integer n2 = entry.getKey();
            Set<Long> set = ekr_02.Qs(n2);
            set.forEach(l -> this.qBY.put((Long)l, n));
        }
    }
}

