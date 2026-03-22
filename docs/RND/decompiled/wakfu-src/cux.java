/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cux
extends nr_0 {
    private long mib;
    private byte[] mbs;

    public long eBZ() {
        return this.mib;
    }

    public byte[] eDh() {
        return this.mbs;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mib = byteBuffer.getLong();
        this.mbs = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mbs);
        return false;
    }

    @Override
    public int d() {
        return 12084;
    }
}

