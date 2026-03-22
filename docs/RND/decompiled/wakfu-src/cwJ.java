/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwJ
extends nv_0 {
    long mlb;
    long aDh;

    public void nH(long l) {
        this.mlb = l;
    }

    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.mlb);
        byteBuffer.putLong(this.aDh);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1181;
    }
}

