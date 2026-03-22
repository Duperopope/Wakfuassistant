/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuT
extends nr_0 {
    private int epK;
    private byte mjz;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.mjz = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13793;
    }

    public int ctn() {
        return this.epK;
    }

    public byte eDy() {
        return this.mjz;
    }
}

