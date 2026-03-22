/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuR
extends nr_0 {
    private int epK;
    private byte[] mjx;
    private byte[] mjy;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.mjx = new byte[n];
        byteBuffer.get(this.mjx);
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.mjy = new byte[n];
            byteBuffer.get(this.mjy);
        }
        return true;
    }

    public int ctn() {
        return this.epK;
    }

    public byte[] eDw() {
        return this.mjx;
    }

    public byte[] eDx() {
        return this.mjy;
    }

    @Override
    public int d() {
        return 13951;
    }
}

