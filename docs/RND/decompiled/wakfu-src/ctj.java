/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctj
extends nr_0 {
    private long aDh;
    private byte mhW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mhW = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13416;
    }

    public byte eBU() {
        return this.mhW;
    }

    public long KU() {
        return this.aDh;
    }
}

