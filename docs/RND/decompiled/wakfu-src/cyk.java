/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyk
extends nr_0 {
    private int eiZ;
    private long kVl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eiZ = byteBuffer.getInt();
        this.kVl = byteBuffer.getLong();
        return true;
    }

    public int aaD() {
        return this.eiZ;
    }

    public long eAU() {
        return this.kVl;
    }

    @Override
    public int d() {
        return 15997;
    }
}

