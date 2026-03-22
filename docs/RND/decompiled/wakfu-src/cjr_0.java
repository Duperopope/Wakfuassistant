/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjR
 */
public class cjr_0
extends nv_0 {
    private int jcr;
    private byte lXs;
    private long exa;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(this.jcr);
        byteBuffer.put(this.lXs);
        byteBuffer.putLong(this.exa);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13960;
    }

    public void KU(int n) {
        this.jcr = n;
    }

    public void dk(byte by) {
        this.lXs = by;
    }

    public void na(long l) {
        this.exa = l;
    }
}

