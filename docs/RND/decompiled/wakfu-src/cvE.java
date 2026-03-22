/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvE
extends nr_0 {
    private int asJ;
    private byte iag;
    private boolean iah;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.iag = byteBuffer.get();
        this.iah = byteBuffer.get() == 1;
        return true;
    }

    public int aGD() {
        return this.asJ;
    }

    public byte djg() {
        return this.iag;
    }

    public boolean cak() {
        return this.iah;
    }

    @Override
    public int d() {
        return 12057;
    }
}

