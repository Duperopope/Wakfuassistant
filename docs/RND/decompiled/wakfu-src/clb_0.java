/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clB
 */
public class clb_0
extends nv_0 {
    private final long lZG;
    private final bfc_1 lZH;

    public clb_0(long l, bfc_1 bfc_12) {
        this.lZG = l;
        this.lZH = bfc_12;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12 + this.lZH.DN());
        byteBuffer.putInt(this.lZH.d());
        byteBuffer.putLong(this.lZG);
        this.lZH.aF(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12311;
    }
}

