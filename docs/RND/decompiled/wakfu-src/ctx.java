/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctx
extends nr_0 {
    private long aDh;
    private int min;
    private short mio;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.min = byteBuffer.getInt();
        this.aDh = byteBuffer.getLong();
        this.mio = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12301;
    }

    public long KU() {
        return this.aDh;
    }

    public int eCj() {
        return this.min;
    }

    public short eCk() {
        return this.mio;
    }
}

