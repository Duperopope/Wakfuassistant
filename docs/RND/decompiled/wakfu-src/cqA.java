/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqA
extends cqf {
    private int htt;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.htt = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12866;
    }

    public int eyF() {
        return this.htt;
    }
}

