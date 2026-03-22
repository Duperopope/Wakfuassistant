/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cqK
extends cqf {
    private int bfE;
    private long huC;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.bfE = byteBuffer.getInt();
        this.huC = byteBuffer.getLong();
        return true;
    }

    public int aZH() {
        return this.bfE;
    }

    public long eyS() {
        return this.huC;
    }

    @Override
    public int d() {
        return 13015;
    }
}

