/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cji
 */
public class cji_0
extends nv_0 {
    private final int lVX;

    public cji_0(int n) {
        this.lVX = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lVX);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13550;
    }
}

