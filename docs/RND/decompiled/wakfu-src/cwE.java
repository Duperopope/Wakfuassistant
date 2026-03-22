/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwE
extends nv_0 {
    private long mlb;
    private uw_0 bvv;

    public void nH(long l) {
        this.mlb = l;
    }

    public void F(ux_0 ux_02) {
        this.bvv = new uw_0(ux_02);
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.mlb);
        byteBuffer.putLong(this.bvv.bjB());
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1103;
    }
}

