/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clw
 */
public class clw_0
extends nv_0 {
    private long lVH;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.lVH);
        return this.a((byte)3, byteBuffer.array());
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    @Override
    public int d() {
        return 13405;
    }
}

