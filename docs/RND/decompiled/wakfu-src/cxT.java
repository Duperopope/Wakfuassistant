/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxT
extends nr_0 {
    private byte kIf;
    private long lKU;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.lKU = byteBuffer.getLong();
        this.aDh = byteBuffer.getLong();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long esw() {
        return this.lKU;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 1094;
    }
}

