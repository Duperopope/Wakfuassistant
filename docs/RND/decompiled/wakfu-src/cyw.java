/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyw
extends nr_0 {
    private fpq_0 kod;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kod = byteBuffer.remaining() > 0 ? new fpq_0(byteBuffer) : null;
        return true;
    }

    @Override
    public int d() {
        return 15438;
    }

    public fpq_0 ebp() {
        return this.kod;
    }
}

