/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class No
extends nr_0 {
    private boolean aYj;
    private byte[] aYk;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYj = byteBuffer.get() == 1;
        this.aYk = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.aYk);
        return true;
    }

    @Override
    public int d() {
        return 37;
    }

    public boolean aVV() {
        return this.aYj;
    }

    public byte[] aVW() {
        return this.aYk;
    }
}

