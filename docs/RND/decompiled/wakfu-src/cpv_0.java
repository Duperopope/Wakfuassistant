/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpV
 */
public class cpv_0
extends nr_0 {
    private long lXG;
    private byte aYh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aYh = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 12388;
    }

    public byte aVT() {
        return this.aYh;
    }

    public long exN() {
        return this.lXG;
    }
}

