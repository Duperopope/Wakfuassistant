/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cng
 */
public class cng_0
extends nv_0 {
    private byte[] mbs;

    public void el(byte[] byArray) {
        this.mbs = byArray;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + this.mbs.length);
        byteBuffer.putInt(this.mbs.length);
        byteBuffer.put(this.mbs);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13759;
    }
}

