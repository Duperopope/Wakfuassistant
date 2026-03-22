/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjS
 */
public class cjs_0
extends nv_0 {
    private int jcr;
    private int jcs;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putInt(this.jcr);
        byteBuffer.putInt(this.jcs);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13352;
    }

    public void KU(int n) {
        this.jcr = n;
    }

    public void KV(int n) {
        this.jcs = n;
    }
}

