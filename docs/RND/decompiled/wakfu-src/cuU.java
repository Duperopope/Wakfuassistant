/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuU
extends nr_0 {
    private int epK;
    private byte[] mjA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.mjA = new byte[n];
        byteBuffer.get(this.mjA);
        return true;
    }

    public int ctn() {
        return this.epK;
    }

    public byte[] eDz() {
        return this.mjA;
    }

    @Override
    public int d() {
        return 13422;
    }
}

