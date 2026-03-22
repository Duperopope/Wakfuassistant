/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csY
 */
public class csy_0
extends nr_0 {
    private long mhO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhO = byteBuffer.getLong();
        return false;
    }

    public long eBM() {
        return this.mhO;
    }

    @Override
    public int d() {
        return 12690;
    }
}

