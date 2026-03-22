/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnx
 */
public class cnx_0
extends nv_0 {
    private long mbM;
    private long duS;
    private int eiZ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putLong(this.mbM);
        byteBuffer.putLong(this.duS);
        byteBuffer.putInt(this.eiZ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13719;
    }

    public void nE(long l) {
        this.mbM = l;
    }

    public void nb(long l) {
        this.duS = l;
    }

    public void Lg(int n) {
        this.eiZ = n;
    }
}

