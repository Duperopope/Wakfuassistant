/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crT
 */
public class crt_0
extends nr_0 {
    private byte bIj;
    private long aZY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bIj = byteBuffer.get();
        this.aZY = byteBuffer.getLong();
        return false;
    }

    public byte bks() {
        return this.bIj;
    }

    public long aXj() {
        return this.aZY;
    }

    @Override
    public int d() {
        return 13291;
    }
}

