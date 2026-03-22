/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OA
extends nr_0 {
    private long aZR = -1L;
    private boolean aZS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZR = byteBuffer.getLong();
        this.aZS = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 1037;
    }

    public long aXc() {
        return this.aZR;
    }

    public boolean aXd() {
        return this.aZS;
    }
}

