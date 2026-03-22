/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ciy
 */
public class ciy_0
extends nr_0 {
    private long lUU;
    private byte[] lUV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUU = byteBuffer.getLong();
        this.lUV = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.lUV);
        return true;
    }

    public long evp() {
        return this.lUU;
    }

    public byte[] evq() {
        return this.lUV;
    }

    @Override
    public int d() {
        return 539;
    }
}

