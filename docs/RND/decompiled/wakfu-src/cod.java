/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.nio.ByteBuffer;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class cod
extends nr_0 {
    private long mcA;
    private final TByteObjectHashMap<Pair<Integer, Integer>> mcB = new TByteObjectHashMap();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        byte by = byteBuffer.get();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            byte by3 = byteBuffer.get();
            this.mcB.put(by3, (Object)new ImmutablePair((Object)byteBuffer.getInt(), (Object)byteBuffer.getInt()));
        }
        return true;
    }

    @Override
    public int d() {
        return 13843;
    }

    public TByteObjectHashMap<Pair<Integer, Integer>> evO() {
        return this.mcB;
    }

    public long evP() {
        return this.mcA;
    }
}

