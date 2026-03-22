/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctq
extends nr_0 {
    private long jFF;

    public long dPv() {
        return this.jFF;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jFF = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12638;
    }
}

