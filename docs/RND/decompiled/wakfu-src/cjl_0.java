/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjL
 */
public class cjl_0
extends nv_0 {
    private final long lXd;
    private final int lXe;
    private final int lXf;

    public cjl_0(long l, int n, int n2) {
        this.lXd = l;
        this.lXe = n;
        this.lXf = n2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.lXd);
        byteBuffer.putInt(this.lXe);
        byteBuffer.putInt(this.lXf);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12757;
    }
}

