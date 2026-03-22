/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OF
extends nr_0 {
    private byte[] aZZ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZZ = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.aZZ);
        return true;
    }

    public byte[] aXk() {
        return this.aZZ;
    }

    @Override
    public int d() {
        return 1030;
    }
}

