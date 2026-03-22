/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cys
extends nr_0 {
    private long aHT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aHT = byteBuffer.getLong();
        return false;
    }

    public long aqZ() {
        return this.aHT;
    }

    @Override
    public int d() {
        return 14461;
    }
}

