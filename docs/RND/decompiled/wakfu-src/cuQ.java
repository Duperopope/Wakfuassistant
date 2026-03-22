/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cuQ
extends nr_0 {
    private int epK;
    private boolean mjv;
    private foR mjw;
    private int ena;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.mjv = byteBuffer.get() == 1;
        this.mjw = foR.hg(byteBuffer.get());
        this.ena = byteBuffer.getInt();
        return true;
    }

    public int ctn() {
        return this.epK;
    }

    public boolean eDu() {
        return this.mjv;
    }

    public foR eDv() {
        return this.mjw;
    }

    public int cqy() {
        return this.ena;
    }

    @Override
    public int d() {
        return 13600;
    }
}

