/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cko
extends nv_0 {
    private long bhR;
    private int bap;
    private int baq;
    private short ban;
    private boolean lXW;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(19);
        byteBuffer.putLong(this.bhR);
        byteBuffer.putInt(this.bap);
        byteBuffer.putInt(this.baq);
        byteBuffer.putShort(this.ban);
        byteBuffer.put((byte)(this.lXW ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12738;
    }

    public void fg(long l) {
        this.bhR = l;
    }

    public void Y(int n, int n2, short s) {
        this.bap = n;
        this.baq = n2;
        this.ban = s;
    }

    public void evv() {
        this.lXW = true;
    }
}

