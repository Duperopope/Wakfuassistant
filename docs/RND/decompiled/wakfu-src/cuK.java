/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cuK
extends nr_0 {
    private int epK;
    private int epS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.epS = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12521;
    }

    public int ctu() {
        return this.epS;
    }

    public int ctn() {
        return this.epK;
    }
}

