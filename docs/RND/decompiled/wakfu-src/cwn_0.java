/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwn
 */
public final class cwn_0
extends nr_0 {
    private long aZQ;
    private long mkU;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZQ = byteBuffer.getLong();
        this.mkU = byteBuffer.getLong();
        return false;
    }

    public long aXb() {
        return this.aZQ;
    }

    public long eEL() {
        return this.mkU;
    }

    @Override
    public int d() {
        return 13740;
    }
}

