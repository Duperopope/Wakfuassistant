/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpR
 */
public class cpr_0
extends nr_0 {
    private long aDh;
    private byte[] mem;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mem = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mem);
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] exI() {
        return this.mem;
    }

    @Override
    public int d() {
        return 13538;
    }
}

