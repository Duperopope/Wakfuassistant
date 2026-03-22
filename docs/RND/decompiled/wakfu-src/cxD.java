/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxD
extends nr_0 {
    private int ejK;
    private long mlV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ejK = byteBuffer.getInt();
        this.mlV = byteBuffer.getLong();
        return false;
    }

    public int IO() {
        return this.ejK;
    }

    public long eEU() {
        return this.mlV;
    }

    @Override
    public int d() {
        return 15452;
    }
}

