/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxa
 */
public class cxa_0
extends nv_0 {
    private final long mlB;

    public cxa_0() {
        this.mlB = -1L;
    }

    public cxa_0(long l) {
        this.mlB = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mlB);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15458;
    }
}

