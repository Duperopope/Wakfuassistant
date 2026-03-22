/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ov
 */
public class ov_0
extends nv_0 {
    protected long aZA;
    protected long aDh;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.aZA);
        byteBuffer.putLong(this.aDh);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public final int d() {
        return 1088;
    }

    public void da(long l) {
        this.aZA = l;
    }

    public void db(long l) {
        this.aDh = l;
    }
}

