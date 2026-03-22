/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class czc
extends nr_0 {
    private long bvx;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bvx = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 23121;
    }

    public long bji() {
        return this.bvx;
    }
}

