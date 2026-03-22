/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvi
extends nr_0 {
    private long ePP;
    private ftt_0 mjU;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ePP = byteBuffer.getLong();
        this.mjU = ftt_0.gz(byteBuffer);
        return true;
    }

    public long Xi() {
        return this.ePP;
    }

    public ftt_0 eDQ() {
        return this.mjU;
    }

    @Override
    public int d() {
        return 13158;
    }
}

