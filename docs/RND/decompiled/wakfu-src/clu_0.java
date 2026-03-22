/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clu
 */
public class clu_0
extends cll_0 {
    private byte lZc;

    @Override
    public byte[] aVX() {
        int n = 33;
        ByteBuffer byteBuffer = ByteBuffer.allocate(33);
        byteBuffer.putLong(this.bgK);
        byteBuffer.putLong(this.lZf);
        byteBuffer.putLong(this.lZe);
        byteBuffer.putLong(this.lZd);
        byteBuffer.put(this.lZc);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12784;
    }

    public void dr(byte by) {
        this.lZc = by;
    }
}

