/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpb
extends nr_0 {
    private long aDh;
    private byte[] ayE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        this.ayE = new byte[n];
        byteBuffer.get(this.ayE);
        return true;
    }

    @Override
    public int d() {
        return 13661;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] aKU() {
        return this.ayE;
    }
}

