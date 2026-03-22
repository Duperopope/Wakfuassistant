/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Or
 */
public final class or_0
extends nv_0 {
    public boolean aZy = true;
    private long aZA;
    private long aDh;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.aZA);
        byteBuffer.putLong(this.aDh);
        if (this.aZy) {
            return this.a((byte)6, byteBuffer.array());
        }
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public final int d() {
        return 1064;
    }

    public void da(long l) {
        this.aZA = l;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void aO(boolean bl) {
        this.aZy = bl;
    }
}

