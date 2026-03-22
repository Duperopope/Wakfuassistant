/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpW
 */
public class cpw_0
extends nr_0 {
    private long lXG;
    private byte bIj;
    private long mep;
    private long meq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.bIj = byteBuffer.get();
        this.mep = byteBuffer.getLong();
        this.meq = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13493;
    }

    public long exN() {
        return this.lXG;
    }

    public long exO() {
        return this.mep;
    }

    public byte bks() {
        return this.bIj;
    }

    public long exP() {
        return this.meq;
    }
}

