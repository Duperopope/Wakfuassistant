/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crF
 */
public class crf_0
extends nr_0 {
    private long jEK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jEK = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13355;
    }

    public long ZC() {
        return this.jEK;
    }
}

