/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxB
extends nr_0 {
    private int mlT;
    private byte[] ayE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mlT = byteBuffer.getInt();
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
        return false;
    }

    public int eES() {
        return this.mlT;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    @Override
    public int d() {
        return 14801;
    }
}

