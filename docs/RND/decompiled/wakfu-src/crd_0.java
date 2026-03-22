/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crD
 */
public final class crd_0
extends nr_0 {
    private long aDL;
    private int mgr;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDL = byteBuffer.getLong();
        this.mgr = byteBuffer.getInt();
        return true;
    }

    public long Ya() {
        return this.aDL;
    }

    public int eAh() {
        return this.mgr;
    }

    @Override
    public int d() {
        return 12197;
    }
}

