/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crC
 */
public class crc_0
extends nr_0 {
    private long jEK;
    private int asA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jEK = byteBuffer.getLong();
        this.asA = byteBuffer.getInt();
        return true;
    }

    public long ZC() {
        return this.jEK;
    }

    public int azv() {
        return this.asA;
    }

    @Override
    public int d() {
        return 13161;
    }
}

