/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxy
extends nr_0 {
    private byte[] ayE;
    private byte[] mlS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
        this.mlS = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mlS);
        return false;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public byte[] eER() {
        return this.mlS;
    }

    @Override
    public int d() {
        return 14310;
    }
}

