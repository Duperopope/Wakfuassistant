/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciD
extends nr_0 {
    private byte kIf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 428;
    }

    public byte evi() {
        return this.kIf;
    }
}

