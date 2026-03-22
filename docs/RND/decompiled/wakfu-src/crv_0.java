/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crv
 */
public class crv_0
extends nr_0 {
    private long iJl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iJl = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13327;
    }

    public long dzt() {
        return this.iJl;
    }
}

