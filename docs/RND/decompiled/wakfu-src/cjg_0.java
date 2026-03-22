/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjg
 */
public class cjg_0
extends nv_0 {
    private final int lVS;
    private final long lVT;
    private final boolean lVU;

    public cjg_0(int n, long l, boolean bl) {
        this.lVS = n;
        this.lVT = l;
        this.lVU = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(this.lVS);
        byteBuffer.putLong(this.lVT);
        byteBuffer.put(this.lVU ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13208;
    }
}

