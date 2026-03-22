/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuz
extends nr_0 {
    private long mbt;
    private byte mbu;

    public long eDj() {
        return this.mbt;
    }

    public byte eDk() {
        return this.mbu;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbt = byteBuffer.getLong();
        this.mbu = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 12504;
    }
}

