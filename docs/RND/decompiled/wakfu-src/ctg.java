/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctg
extends nr_0 {
    private short cke;
    private long dNY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.cke = byteBuffer.getShort();
        this.dNY = byteBuffer.getLong();
        return false;
    }

    public short buM() {
        return this.cke;
    }

    public long ccf() {
        return this.dNY;
    }

    @Override
    public int d() {
        return 12045;
    }
}

