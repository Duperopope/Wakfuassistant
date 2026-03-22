/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cli
 */
public class cli_0
extends cll_0 {
    private byte lZc;
    private long jWq;

    @Override
    public byte[] aVX() {
        int n = 25;
        ByteBuffer byteBuffer = ByteBuffer.allocate(25);
        byteBuffer.putLong(this.bgK);
        byteBuffer.putLong(this.lZe);
        byteBuffer.putLong(this.jWq);
        byteBuffer.put(this.lZc);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13574;
    }

    public void ni(long l) {
        this.jWq = l;
    }

    public void dr(byte by) {
        this.lZc = by;
    }
}

