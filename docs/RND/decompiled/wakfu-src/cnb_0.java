/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnb
 */
public class cnb_0
extends nv_0 {
    private long mbm;
    private boolean bmT;

    public void nA(long l) {
        this.mbm = l;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.mbm);
        byteBuffer.put((byte)(this.bmT ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12487;
    }
}

