/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class czd
extends nr_0 {
    private byte[] ayE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
        return true;
    }

    @Override
    public int d() {
        return 22301;
    }

    public byte[] aKU() {
        return this.ayE;
    }
}

