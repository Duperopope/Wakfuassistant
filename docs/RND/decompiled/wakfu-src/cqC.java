/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqC
extends cqf {
    private byte[] mfj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.mfj = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.mfj);
        return true;
    }

    @Override
    public int d() {
        return 12010;
    }

    public byte[] eyH() {
        return this.mfj;
    }
}

