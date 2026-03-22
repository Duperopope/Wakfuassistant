/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;

public class cmc
extends nv_0 {
    private long mao;
    private final Map<Long, Bu<Long, Integer>> maw = new HashMap<Long, Bu<Long, Integer>>();

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + this.maw.size() * 20);
        byteBuffer.putLong(this.mao);
        byteBuffer.putShort((short)this.maw.size());
        this.maw.forEach((l, bu) -> {
            byteBuffer.putLong((long)l);
            byteBuffer.putLong((Long)bu.getFirst());
            byteBuffer.putInt((Integer)bu.aHI());
        });
        return this.a((byte)3, byteBuffer.array());
    }

    public void b(long l, long l2, int n) {
        this.maw.put(l2, new Bu<Long, Integer>(l, n));
    }

    @Override
    public int d() {
        return 13699;
    }

    @Generated
    public void nu(long l) {
        this.mao = l;
    }
}

