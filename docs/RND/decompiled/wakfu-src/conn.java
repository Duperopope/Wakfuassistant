/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class conn
extends nr_0 {
    private long aDh;
    private byte[] mcO;

    public long KU() {
        return this.aDh;
    }

    public byte[] ewc() {
        return this.mcO;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mcO = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.mcO);
        return true;
    }

    @Override
    public int d() {
        return 13315;
    }
}

