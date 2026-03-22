/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjQ
 */
public class cjq_0
extends nv_0 {
    private int jcr;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.jcr);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13172;
    }

    public void KU(int n) {
        this.jcr = n;
    }
}

