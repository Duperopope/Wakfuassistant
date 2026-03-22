/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwW
 */
public class cww_0
extends nv_0 {
    private final long mlw;
    private final short mlx;

    public cww_0(long l, short s) {
        this.mlw = l;
        this.mlx = s;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.mlw);
        byteBuffer.putShort(this.mlx);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15459;
    }
}

