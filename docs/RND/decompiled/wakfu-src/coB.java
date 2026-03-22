/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coB
extends nr_0 {
    private long aDh;
    private int Nf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.Nf = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12339;
    }

    public long KU() {
        return this.aDh;
    }

    public int apw() {
        return this.Nf;
    }
}

