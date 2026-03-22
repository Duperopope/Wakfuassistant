/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Oq
 */
public class oq_0
extends nv_0 {
    private final long aZG;

    public oq_0(long l) {
        this.aZG = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aZG);
        return this.a((byte)2, byteBuffer.array());
    }

    public long aXa() {
        return this.aZG;
    }

    @Override
    public int d() {
        return 1130;
    }
}

