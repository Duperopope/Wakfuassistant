/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cja
 */
public class cja_0
extends nv_0 {
    private long lVH;
    private boolean lVK = false;
    private int bap;
    private int baq;
    private short ban;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + (this.lVK ? 10 : 0));
        byteBuffer.putLong(this.lVH);
        if (this.lVK) {
            byteBuffer.put((byte)1);
            byteBuffer.putInt(this.bap);
            byteBuffer.putInt(this.baq);
            byteBuffer.putShort(this.ban);
        } else {
            byteBuffer.put((byte)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13239;
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    public void a(int n, int n2, short s) {
        this.lVK = true;
        this.bap = n;
        this.baq = n2;
        this.ban = s;
    }
}

