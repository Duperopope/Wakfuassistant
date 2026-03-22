/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxl
 */
public class cxl_0
extends nv_0 {
    private short mlG;

    public void cF(short s) {
        this.mlG = s;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(this.mlG);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14830;
    }
}

