/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxp
 */
public class cxp_0
extends nv_0 {
    private int crT = 0;

    public void setOffset(int n) {
        this.crT = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.crT);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15923;
    }
}

