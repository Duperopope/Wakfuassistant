/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from ckR
 */
public class ckr_0
extends nv_0 {
    private byte lYD = (byte)-1;
    private short cLw = 0;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(this.lYD);
        byteBuffer.putShort(this.cLw);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14544;
    }

    public void bv(short s) {
        this.cLw = s;
    }

    public void do(byte by) {
        this.lYD = by;
    }
}

