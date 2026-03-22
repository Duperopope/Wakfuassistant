/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cyr
extends nr_0 {
    private byte[] bgZ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bgZ = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.bgZ);
        return false;
    }

    public byte[] bcf() {
        return this.bgZ;
    }

    @Override
    public int d() {
        return 14065;
    }
}

