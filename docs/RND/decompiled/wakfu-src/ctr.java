/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctr
extends nr_0 {
    private long mih;
    private long jFF;

    public long eCd() {
        return this.mih;
    }

    public long dPv() {
        return this.jFF;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mih = byteBuffer.getLong();
        this.jFF = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12364;
    }
}

