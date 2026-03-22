/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnr
extends nv_0 {
    private long mbm;
    private byte bal;
    private byte bam;

    public void nA(long l) {
        this.mbm = l;
    }

    public void dG(byte by) {
        this.bal = by;
    }

    public void dH(byte by) {
        this.bam = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.mbm);
        byteBuffer.put(this.bal);
        byteBuffer.put(this.bam);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12500;
    }
}

