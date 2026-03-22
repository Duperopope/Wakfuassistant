/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpo
extends nr_0 {
    private long jhA;
    private byte[] mdP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jhA = byteBuffer.getLong();
        this.mdP = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.mdP);
        return true;
    }

    @Override
    public int d() {
        return 12025;
    }

    public long dGf() {
        return this.jhA;
    }

    public byte[] exk() {
        return this.mdP;
    }
}

