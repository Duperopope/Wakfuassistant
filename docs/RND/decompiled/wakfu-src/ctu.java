/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctu
extends nr_0 {
    private long meu;

    public long exS() {
        return this.meu;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.meu = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13503;
    }
}

