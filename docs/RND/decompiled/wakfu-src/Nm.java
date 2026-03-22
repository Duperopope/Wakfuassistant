/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Nm
extends nr_0 {
    private final byte[] aYi = new byte[4];

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 4, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.get(this.aYi);
        return true;
    }

    @Override
    public int d() {
        return 338;
    }

    public byte[] aVU() {
        return this.aYi;
    }
}

