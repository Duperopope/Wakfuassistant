/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctt
extends nr_0 {
    private long mii;
    private int mij;

    public long eCf() {
        return this.mii;
    }

    public int eCg() {
        return this.mij;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mii = byteBuffer.getInt();
        this.mij = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12027;
    }
}

