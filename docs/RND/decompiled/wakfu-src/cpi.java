/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpi
extends nr_0 {
    private long aDh;
    private byte hOe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.hOe = byteBuffer.get();
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte deO() {
        return this.hOe;
    }

    @Override
    public int d() {
        return 12632;
    }
}

