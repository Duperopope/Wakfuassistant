/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjh
 */
public class cjh_0
extends nv_0 {
    private final int lVV;
    private final boolean lVW;

    public cjh_0(int n, boolean bl) {
        this.lVV = n;
        this.lVW = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(this.lVV);
        byteBuffer.put(this.lVW ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13271;
    }
}

