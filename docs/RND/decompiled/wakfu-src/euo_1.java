/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from euO
 */
public class euo_1 {
    private final EnumMap<euq_1, eup_1> orI;

    public euo_1() {
        this.orI = new EnumMap(euq_1.class);
    }

    public euo_1(euo_1 euo_12) {
        this.orI = new EnumMap<euq_1, eup_1>(euo_12.orI);
    }

    public void a(eup_1 eup_12) {
        this.orI.put(eup_12.fdr(), eup_12);
    }

    public boolean a(euq_1 euq_12) {
        return this.orI.containsKey((Object)euq_12);
    }

    public eup_1 b(euq_1 euq_12) {
        return this.orI.get((Object)euq_12);
    }

    public int DN() {
        return 2 + this.orI.size() * eup_1.DN();
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short)this.orI.size());
        for (Map.Entry<euq_1, eup_1> entry : this.orI.entrySet()) {
            byteBuffer.put(entry.getKey().aJr());
            byteBuffer.putLong(entry.getValue().apJ());
        }
    }

    public void eL(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            euq_1 euq_12 = euq_1.ep(by);
            if (euq_12 == null) continue;
            this.orI.put(euq_12, new eup_1(euq_12, l));
        }
    }

    public Set<Map.Entry<euq_1, eup_1>> fdq() {
        return this.orI.entrySet();
    }

    public void clear() {
        this.orI.clear();
    }
}

