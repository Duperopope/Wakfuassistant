/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clk
 */
public class clk_0
extends nv_0 {
    private long duS;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.duS);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12577;
    }

    public void nb(long l) {
        this.duS = l;
    }
}

