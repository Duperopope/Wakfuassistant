/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqB
extends cqf {
    private byte[] mfi;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.mfi = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.mfi);
        return true;
    }

    @Override
    public int d() {
        return 13236;
    }

    public byte[] eyG() {
        return this.mfi;
    }
}

