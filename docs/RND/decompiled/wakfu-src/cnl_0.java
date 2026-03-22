/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnL
 */
public class cnl_0
extends nv_0 {
    private final int mbW;

    public cnl_0(int n) {
        this.mbW = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.mbW);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13605;
    }
}

