/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvD
extends nr_0 {
    private int asJ;
    private byte iag;
    private long mkr;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.iag = byteBuffer.get();
        this.mkr = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12626;
    }

    public int aGD() {
        return this.asJ;
    }

    public byte djg() {
        return this.iag;
    }

    public long eEk() {
        return this.mkr;
    }
}

