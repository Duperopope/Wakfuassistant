/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coC
extends nr_0 {
    private long aDh;
    private int Nf;
    private long aZJ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.Nf = byteBuffer.getInt();
        this.aZJ = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12254;
    }

    public long KU() {
        return this.aDh;
    }

    public long aXm() {
        return this.aZJ;
    }

    public int apw() {
        return this.Nf;
    }
}

