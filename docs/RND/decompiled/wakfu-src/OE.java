/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OE
extends nr_0 {
    private long aZX;
    private long aZY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZX = byteBuffer.getLong();
        this.aZY = byteBuffer.getLong();
        return true;
    }

    public long aXi() {
        return this.aZX;
    }

    public long aXj() {
        return this.aZY;
    }

    @Override
    public int d() {
        return 1163;
    }
}

