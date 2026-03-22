/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpX
extends nr_0 {
    private long lXG;
    private long bnt;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.bnt = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12997;
    }

    public long bfl() {
        return this.bnt;
    }

    public long exN() {
        return this.lXG;
    }
}

