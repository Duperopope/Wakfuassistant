/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csS
extends nr_0 {
    private byte[] mhJ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        this.mhJ = new byte[n];
        byteBuffer.get(this.mhJ);
        return true;
    }

    @Override
    public int d() {
        return 13800;
    }

    public byte[] eBG() {
        return this.mhJ;
    }
}

