/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxN
extends nr_0 {
    private byte kIf;
    private long lKU;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.lKU = byteBuffer.getLong();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long esw() {
        return this.lKU;
    }

    @Override
    public int d() {
        return 1112;
    }
}

