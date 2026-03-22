/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmP
 */
public class cmp_0
extends nv_0 {
    private final fec mbc;

    public cmp_0(fec fec2) {
        this.mbc = fec2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + this.mbc.DN());
        byteBuffer.put((byte)this.mbc.fUt().ordinal());
        this.mbc.fY(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12375;
    }
}

