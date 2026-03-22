/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqN
 */
public final class cqn_0
extends cqf {
    private long aDh;
    private byte[] mfy;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.aDh = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        this.mfy = new byte[n];
        byteBuffer.get(this.mfy);
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] eyY() {
        return this.mfy;
    }

    @Override
    public int d() {
        return 13475;
    }
}

