/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwY
 */
public class cwy_0
extends nv_0 {
    private final long mlz;

    public cwy_0(long l) {
        this.mlz = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mlz);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15097;
    }
}

