/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqw
 */
public final class cqw_0
extends nr_0 {
    private long aZQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZQ = byteBuffer.getLong();
        return false;
    }

    public long aXb() {
        return this.aZQ;
    }

    @Override
    public int d() {
        return 13495;
    }
}

