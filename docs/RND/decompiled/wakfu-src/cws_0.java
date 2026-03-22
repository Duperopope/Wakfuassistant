/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwS
 */
public class cws_0
extends nv_0 {
    private final long mlr;

    public cws_0(long l) {
        this.mlr = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mlr);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14264;
    }
}

