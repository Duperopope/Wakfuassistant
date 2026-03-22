/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxi
 */
public class cxi_0
extends nv_0 {
    private long aXv;

    public void dC(long l) {
        this.aXv = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aXv);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14301;
    }
}

