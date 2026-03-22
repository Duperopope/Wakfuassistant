/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckY
 */
public class cky_0
extends nv_0 {
    private long aDh;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aDh);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12151;
    }

    public void db(long l) {
        this.aDh = l;
    }
}

