/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpe
extends nr_0 {
    private long aDh;
    private long mdG;
    private int eoY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdG = byteBuffer.getLong();
        this.aDh = byteBuffer.getLong();
        this.eoY = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13512;
    }

    public long KU() {
        return this.aDh;
    }

    public long Tx() {
        return this.mdG;
    }

    public int tL() {
        return this.eoY;
    }
}

