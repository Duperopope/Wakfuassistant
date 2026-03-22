/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqe
 */
public abstract class cqe_0
extends cqf {
    private long aDh;
    private byte[] ayE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.aDh = byteBuffer.getLong();
        this.ayE = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.ayE);
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] aKU() {
        return this.ayE;
    }
}

