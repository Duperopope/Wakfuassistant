/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from On
 */
public class on_1
extends nv_0 {
    private final long aZv;

    public on_1(long l) {
        this.aZv = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aZv);
        return this.a((byte)2, byteBuffer.array());
    }

    public long Ya() {
        return this.aZv;
    }

    @Override
    public int d() {
        return 1160;
    }
}

