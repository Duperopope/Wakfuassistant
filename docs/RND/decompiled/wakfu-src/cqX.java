/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqX
extends cqf {
    private int mfM = -1;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.mfM = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13556;
    }

    public int ezo() {
        return this.mfM;
    }
}

