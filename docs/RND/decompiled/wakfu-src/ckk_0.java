/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckk
 */
public final class ckk_0
extends nv_0 {
    private int bsx = -1;

    public void pu(int n) {
        this.bsx = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.bsx);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12812;
    }
}

