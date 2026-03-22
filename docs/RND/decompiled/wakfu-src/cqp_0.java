/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqp
 */
public class cqp_0
extends cqq_0 {
    private byte meN;
    private byte[] meO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fh(byteBuffer);
        this.meN = byteBuffer.get();
        this.meO = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.meO);
        return true;
    }

    @Override
    public int d() {
        return 12389;
    }

    public byte eyl() {
        return this.meN;
    }

    public byte[] eym() {
        return this.meO;
    }
}

