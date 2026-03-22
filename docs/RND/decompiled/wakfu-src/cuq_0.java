/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuq
 */
public class cuq_0
extends nr_0 {
    private long mbm;

    public long eDe() {
        return this.mbm;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbm = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12833;
    }
}

