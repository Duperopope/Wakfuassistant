/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csa
extends nr_0 {
    private long htO;
    private byte[] mgJ;

    public long evy() {
        return this.htO;
    }

    public byte[] eAx() {
        return this.mgJ;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eU(byteBuffer);
        return true;
    }

    protected void eU(ByteBuffer byteBuffer) {
        this.htO = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.mgJ = new byte[n];
            byteBuffer.get(this.mgJ);
        } else {
            this.mgJ = null;
        }
    }

    @Override
    public int d() {
        return 13923;
    }
}

