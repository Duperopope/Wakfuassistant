/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciM
extends nv_0 {
    private int eAf;
    private long bhR = -1L;

    @Override
    public byte[] aVX() {
        int n = 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.eAf);
        byteBuffer.putLong(this.bhR);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12714;
    }

    public void KR(int n) {
        this.eAf = n;
    }

    public void fg(long l) {
        this.bhR = l;
    }
}

