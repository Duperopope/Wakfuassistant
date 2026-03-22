/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvA
extends nr_0 {
    private short hXA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.hXA = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12158;
    }

    public short dit() {
        return this.hXA;
    }
}

