/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckV
 */
public class ckv_0
extends nv_0 {
    private final int lYM;
    private final fec lYN;

    public ckv_0(int n, fec fec2) {
        this.lYM = n;
        this.lYN = fec2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5 + this.lYN.DN());
        byteBuffer.putInt(this.lYM);
        byteBuffer.put((byte)this.lYN.fUt().ordinal());
        this.lYN.fY(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13174;
    }
}

