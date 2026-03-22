/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csx
extends Nr {
    private long mhp;
    private long mhq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhp = byteBuffer.getLong();
        this.mhq = byteBuffer.getLong();
        return true;
    }

    public long eBb() {
        return this.mhp;
    }

    public long eBc() {
        return this.mhq;
    }

    @Override
    public int d() {
        return 13601;
    }
}
