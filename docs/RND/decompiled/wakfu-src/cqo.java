/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cqo
extends nr_0 {
    private byte kIf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    @Override
    public int d() {
        return 12330;
    }
}

