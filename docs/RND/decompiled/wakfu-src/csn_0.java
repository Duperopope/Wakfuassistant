/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csn
 */
public class csn_0
extends nr_0 {
    private byte[] mhd;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mhd = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.mhd);
        return true;
    }

    @Override
    public int d() {
        return 12125;
    }

    public byte[] eAO() {
        return this.mhd;
    }

    public long KU() {
        return this.aDh;
    }
}

