/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvG
extends nr_0 {
    private long bgK;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 8) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bgK = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13302;
    }

    public long Lx() {
        return this.bgK;
    }
}

