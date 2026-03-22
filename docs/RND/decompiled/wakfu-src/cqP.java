/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqP
extends nr_0 {
    private long aDh;
    private byte[] mfz;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mfz = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.mfz);
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] eyZ() {
        return this.mfz;
    }

    @Override
    public int d() {
        return 12864;
    }
}

