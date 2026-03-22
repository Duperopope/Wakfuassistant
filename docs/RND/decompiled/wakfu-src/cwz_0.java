/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwZ
 */
public class cwz_0
extends nv_0 {
    private final byte mlA;

    public cwz_0(byte by) {
        this.mlA = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put(this.mlA);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15234;
    }
}

