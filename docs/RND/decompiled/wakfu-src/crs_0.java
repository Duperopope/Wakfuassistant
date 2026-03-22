/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crS
 */
public class crs_0
extends nr_0 {
    private long aZX;
    private long aZY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZX = byteBuffer.getLong();
        this.aZY = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13229;
    }

    public long aXi() {
        return this.aZX;
    }

    public long aXj() {
        return this.aZY;
    }
}

