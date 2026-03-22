/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmN
 */
public class cmn_0
extends nv_0 {
    private int epQ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        byteBuffer.putInt(this.epQ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12488;
    }

    public void Le(int n) {
        this.epQ = n;
    }
}

