/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csT
extends nr_0 {
    private long bgK;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bgK = byteBuffer.getLong();
        this.aDh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12940;
    }

    public long Lx() {
        return this.bgK;
    }

    public long KU() {
        return this.aDh;
    }
}

