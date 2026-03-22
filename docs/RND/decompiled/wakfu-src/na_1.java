/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NA
 */
public class na_1
extends nv_0 {
    private byte aYJ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        return this.a(this.aYJ, byteBuffer.array());
    }

    @Override
    public int d() {
        return 350;
    }

    public void E(byte by) {
        this.aYJ = by;
    }
}

