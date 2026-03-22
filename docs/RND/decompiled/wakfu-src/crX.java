/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crX
extends nr_0 {
    private long htO;
    private boolean jDn;

    public long evy() {
        return this.htO;
    }

    public boolean eAw() {
        return this.jDn;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.htO = byteBuffer.getLong();
        this.jDn = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13689;
    }
}

