/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class czb
extends nr_0 {
    private byte mmV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmV = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 23764;
    }

    public byte eFW() {
        return this.mmV;
    }
}

