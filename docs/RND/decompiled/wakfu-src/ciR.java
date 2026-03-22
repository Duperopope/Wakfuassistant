/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciR
extends nv_0 {
    private final int lVv;
    private final int lVw;
    private final int lVx;
    private final long lVy;

    public ciR(int n, int n2, int n3, long l) {
        this.lVv = n;
        this.lVw = n2;
        this.lVx = n3;
        this.lVy = l;
    }

    @Override
    public byte[] aVX() {
        int n = 20;
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.lVv);
        byteBuffer.putInt(this.lVw);
        byteBuffer.putInt(this.lVx);
        byteBuffer.putLong(this.lVy);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13097;
    }
}

