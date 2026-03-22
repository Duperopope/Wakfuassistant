/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxf
 */
public class cxf_0
extends nv_0 {
    private int epQ;
    private byte mlF;

    public void Le(int n) {
        this.epQ = n;
    }

    public void dQ(byte by) {
        this.mlF = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(this.epQ);
        byteBuffer.put(this.mlF);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14575;
    }
}

