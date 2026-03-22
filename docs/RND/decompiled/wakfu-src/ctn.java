/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctn
extends nr_0 {
    private long jFF;
    private boolean bmT;

    public long dPv() {
        return this.jFF;
    }

    public boolean bfb() {
        return this.bmT;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jFF = byteBuffer.getLong();
        this.bmT = byteBuffer.get() != 0;
        return byteBuffer.remaining() == 0;
    }

    @Override
    public int d() {
        return 13802;
    }
}

