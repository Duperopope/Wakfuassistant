/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwF
extends nv_0 {
    public static final byte mlf = 1;
    public static final byte mlg = 2;
    private long mlb;
    private byte mlh;
    private byte asf;

    public void dO(byte by) {
        this.mlh = by;
    }

    public void nH(long l) {
        this.mlb = l;
    }

    public void a(byte by) {
        this.asf = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.mlb);
        byteBuffer.put(this.mlh);
        byteBuffer.put(this.asf);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1075;
    }
}

