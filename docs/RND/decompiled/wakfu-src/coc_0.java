/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coc
 */
public class coc_0
extends nv_0 {
    private final long mcy;
    private final long mcz;

    public coc_0(long l, long l2) {
        this.mcy = l;
        this.mcz = l2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.mcy);
        byteBuffer.putLong(this.mcz);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12140;
    }
}

