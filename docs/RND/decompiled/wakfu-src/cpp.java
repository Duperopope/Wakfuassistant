/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cpp
extends nr_0 {
    private eJS ius;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ius = eJU.fs(byteBuffer);
        return true;
    }

    public eJS dLE() {
        return this.ius;
    }

    @Override
    public int d() {
        return 13767;
    }
}

