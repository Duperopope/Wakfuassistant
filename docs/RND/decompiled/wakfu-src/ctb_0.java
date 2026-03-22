/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctB
 */
public class ctb_0
extends nr_0 {
    private long klw;
    private long aZQ;
    private long jcL;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.klw = byteBuffer.getLong();
        this.aZQ = byteBuffer.getLong();
        this.jcL = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12939;
    }

    public long aXb() {
        return this.aZQ;
    }

    public long cXe() {
        return this.klw;
    }

    public long eCp() {
        return this.jcL;
    }
}

