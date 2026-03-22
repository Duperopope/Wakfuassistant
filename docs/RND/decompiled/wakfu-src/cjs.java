/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cjs
extends nv_0 {
    private final long lWq;
    private final bjo_2 lWr;

    public cjs(long l, bjo_2 bjo_22) {
        this.lWq = l;
        this.lWr = bjo_22;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16 + this.lWr.DN());
        byteBuffer.putLong(this.lWq);
        byteBuffer.putLong(this.lWr.Sn());
        this.lWr.aF(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13017;
    }
}

