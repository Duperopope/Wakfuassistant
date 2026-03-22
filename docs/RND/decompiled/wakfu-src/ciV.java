/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciV
extends nv_0 {
    private long aDh;
    private byte lVz;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.aDh);
        byteBuffer.put(this.lVz);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13116;
    }

    public void df(byte by) {
        this.lVz = by;
    }

    public void db(long l) {
        this.aDh = l;
    }
}

