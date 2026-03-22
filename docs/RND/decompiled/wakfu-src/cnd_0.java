/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnd
 */
public class cnd_0
extends nv_0 {
    private int crh;

    public void nT(int n) {
        this.crh = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.crh);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12904;
    }
}

