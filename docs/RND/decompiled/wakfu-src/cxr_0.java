/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxr
 */
public class cxr_0
extends nv_0 {
    private int epQ;

    public void Le(int n) {
        this.epQ = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.epQ);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14409;
    }
}

