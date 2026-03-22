/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coy
extends nr_0 {
    private byte[] mda;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mda = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.mda);
        return true;
    }

    @Override
    public int d() {
        return 12522;
    }

    public byte[] ewp() {
        return this.mda;
    }
}

