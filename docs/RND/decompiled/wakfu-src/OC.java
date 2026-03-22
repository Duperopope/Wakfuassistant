/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OC
extends nr_0 {
    private long aZA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZA = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 1003;
    }

    public long aXa() {
        return this.aZA;
    }
}

