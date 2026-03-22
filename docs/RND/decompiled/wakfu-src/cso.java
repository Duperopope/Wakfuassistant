/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cso
extends nr_0 {
    private long duS;
    private short bol;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.duS = byteBuffer.getLong();
        this.bol = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 13003;
    }

    public long bSZ() {
        return this.duS;
    }

    public short bfd() {
        return this.bol;
    }
}

