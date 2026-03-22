/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class OI
extends nr_0 {
    private byte aZz;
    private int bab;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZz = byteBuffer.get();
        this.bab = byteBuffer.getInt();
        return true;
    }

    public byte aWY() {
        return this.aZz;
    }

    public int aXo() {
        return this.bab;
    }

    @Override
    public int d() {
        return 1039;
    }
}

