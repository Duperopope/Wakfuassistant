/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnF
extends nv_0 {
    private int epK;
    private byte mbU;
    private int ena;

    public void Ck(int n) {
        this.epK = n;
    }

    public void dI(byte by) {
        this.mbU = by;
    }

    public void Lh(int n) {
        this.ena = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.epK);
        byteBuffer.put(this.mbU);
        byteBuffer.putInt(this.ena);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13403;
    }
}

