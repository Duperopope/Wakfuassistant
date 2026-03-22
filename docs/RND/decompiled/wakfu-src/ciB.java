/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciB
extends nr_0 {
    private long lUU;
    private byte[] lUV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUU = byteBuffer.getLong();
        this.lUV = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.lUV);
        return false;
    }

    @Override
    public int d() {
        return 473;
    }

    public long evp() {
        return this.lUU;
    }

    public byte[] evq() {
        return this.lUV;
    }
}

