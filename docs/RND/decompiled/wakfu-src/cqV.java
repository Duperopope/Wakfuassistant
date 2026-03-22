/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqV
extends cqf {
    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 12162;
    }
}

