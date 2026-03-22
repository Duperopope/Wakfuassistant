/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxd
 */
public class cxd_0
extends nv_0 {
    private byte mlE;

    public void dP(byte by) {
        this.mlE = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put(this.mlE);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15251;
    }
}

